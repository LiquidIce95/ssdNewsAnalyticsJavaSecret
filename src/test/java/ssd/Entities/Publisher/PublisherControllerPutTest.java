package ssd.Entities.Publisher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Base.PublisherRepository;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Base.RESTapi.PublisherDTO;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PublisherControllerPutTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private NewspaperRepository newspaperRepository;

    @Autowired
    private ArticleAnalyticsRepository articleAnalyticsRepository;

    @Autowired
    private AuthorAnalyticsRepository authorAnalyticsRepository;

    @Autowired
    private PublisherAnalyticsRepository publisherAnalyticsRepository;

    @Autowired
    private OwnerAnalyticsRepository ownerAnalyticsRepository;

    @Autowired
    private NewspaperAnalyticsRepository newspaperAnalyticsRepository;

    private Publisher publisher;

    @BeforeEach
    public void setup() {
        articleRepository.deleteAll();
        newspaperRepository.deleteAll();
        ownerRepository.deleteAll();
        publisherRepository.deleteAll();
        authorRepository.deleteAll();

        articleAnalyticsRepository.deleteAll();
        newspaperAnalyticsRepository.deleteAll();
        ownerAnalyticsRepository.deleteAll();
        publisherAnalyticsRepository.deleteAll();
        authorAnalyticsRepository.deleteAll();

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();
        publisherAnalytics.setBias("Neutral");
        publisherAnalytics.setViews(12000);
        publisherAnalytics.setShares(450);
        publisherAnalytics.setLikes(300);
        publisherAnalytics.setEngagementRate(0.15);
        PublisherAnalytics savedPublisherAnalytics = publisherAnalyticsRepository.saveAndFlush(publisherAnalytics);

        this.publisher = new Publisher();
        publisher.setName("Global News Network");
        publisher.setAnalytics(savedPublisherAnalytics);
        publisherRepository.saveAndFlush(publisher);
    }

    @Test
    public void testUpdatePublisher_withValidInput() {
        PublisherDTO updatedDTO = new PublisherDTO();
        updatedDTO.setName("Updated Publisher Name");

        ResponseEntity<PublisherDTO> response = restTemplate.exchange(
            "/publishers/" + this.publisher.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(updatedDTO),
            PublisherDTO.class
        );

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        PublisherDTO updatedPublisher = response.getBody();
        assertThat(updatedPublisher).isNotNull();
        assertThat(updatedPublisher.getName()).isEqualTo("Updated Publisher Name");

        Publisher savedPublisher = publisherRepository.findById(publisher.getId()).orElse(null);
        assertThat(savedPublisher).isNotNull();
        assertThat(savedPublisher.getName()).isEqualTo("Updated Publisher Name");
    }

    @Test
    public void testUpdatePublisher_withInvalidInput() {
        PublisherDTO invalidDTO = new PublisherDTO(); // Missing name

        ResponseEntity<String> response = restTemplate.exchange(
            "/publishers/" + publisher.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(invalidDTO),
            String.class
        );


        Publisher savedPublisher = publisherRepository.findById(publisher.getId()).orElse(null);
        assertThat(savedPublisher).isNotNull();
        assertThat(savedPublisher.getName()).isEqualTo("Global News Network");
    }
}

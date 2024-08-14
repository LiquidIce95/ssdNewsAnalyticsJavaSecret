package ssd.Entities.Newspaper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Base.RESTapi.NewspaperDTO;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.PublisherRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class NewspaperControllerPutTest {

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

    private Newspaper newspaper;

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

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();
        newspaperAnalytics.setBias("Neutral");
        newspaperAnalytics.setViews(12000);
        newspaperAnalytics.setShares(450);
        newspaperAnalytics.setLikes(300);
        newspaperAnalytics.setEngagementRate(0.15);
        NewspaperAnalytics savedNewspaperAnalytics = newspaperAnalyticsRepository.saveAndFlush(newspaperAnalytics);

        this.newspaper = new Newspaper();
        newspaper.setName("Daily News");
        newspaper.setAnalytics(savedNewspaperAnalytics);
        newspaperRepository.saveAndFlush(newspaper);
    }

    @Test
    public void testUpdateNewspaper_withValidInput() {
        NewspaperDTO updatedDTO = new NewspaperDTO();
        updatedDTO.setName("Updated Newspaper Name");

        ResponseEntity<NewspaperDTO> response = restTemplate.exchange(
            "/newspapers/" + this.newspaper.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(updatedDTO),
            NewspaperDTO.class
        );

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        NewspaperDTO updatedNewspaper = response.getBody();
        assertThat(updatedNewspaper).isNotNull();
        assertThat(updatedNewspaper.getName()).isEqualTo("Updated Newspaper Name");

        Newspaper savedNewspaper = newspaperRepository.findById(newspaper.getId()).orElse(null);
        assertThat(savedNewspaper).isNotNull();
        assertThat(savedNewspaper.getName()).isEqualTo("Updated Newspaper Name");
    }

    @Test
    public void testUpdateNewspaper_withInvalidInput() {
        NewspaperDTO invalidDTO = new NewspaperDTO(); // Missing name

        ResponseEntity<String> response = restTemplate.exchange(
            "/newspapers/" + newspaper.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(invalidDTO),
            String.class
        );


        Newspaper savedNewspaper = newspaperRepository.findById(newspaper.getId()).orElse(null);
        assertThat(savedNewspaper).isNotNull();
        assertThat(savedNewspaper.getName()).isEqualTo("Daily News");
    }
}

package ssd.Entities.Owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Base.RESTapi.OwnerDTO;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.PublisherRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class OwnerControllerPutTest {

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

    private Owner owner;

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

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();
        ownerAnalytics.setBias("Neutral");
        ownerAnalytics.setViews(12000);
        ownerAnalytics.setShares(450);
        ownerAnalytics.setLikes(300);
        ownerAnalytics.setEngagementRate(0.15);
        OwnerAnalytics savedOwnerAnalytics = ownerAnalyticsRepository.saveAndFlush(ownerAnalytics);

        this.owner = new Owner();
        owner.setName("John Smith");
        owner.setAnalytics(savedOwnerAnalytics);
        ownerRepository.saveAndFlush(owner);
    }

    @Test
    public void testUpdateOwner_withValidInput() {
        OwnerDTO updatedDTO = new OwnerDTO();
        updatedDTO.setName("Updated Owner Name");

        ResponseEntity<OwnerDTO> response = restTemplate.exchange(
            "/owners/" + this.owner.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(updatedDTO),
            OwnerDTO.class
        );

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        OwnerDTO updatedOwner = response.getBody();
        assertThat(updatedOwner).isNotNull();
        assertThat(updatedOwner.getName()).isEqualTo("Updated Owner Name");

        Owner savedOwner = ownerRepository.findById(owner.getId()).orElse(null);
        assertThat(savedOwner).isNotNull();
        assertThat(savedOwner.getName()).isEqualTo("Updated Owner Name");
    }

    @Test
    public void testUpdateOwner_withInvalidInput() {
        OwnerDTO invalidDTO = new OwnerDTO(); // Missing name

        ResponseEntity<String> response = restTemplate.exchange(
            "/owners/" + owner.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(invalidDTO),
            String.class
        );


        Owner savedOwner = ownerRepository.findById(owner.getId()).orElse(null);
        assertThat(savedOwner).isNotNull();
        assertThat(savedOwner.getName()).isEqualTo("John Smith");
    }
}

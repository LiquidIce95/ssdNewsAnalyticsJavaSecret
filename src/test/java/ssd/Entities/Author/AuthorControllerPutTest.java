package ssd.Entities.Author;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Base.RESTapi.AuthorDTO;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.PublisherRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AuthorControllerPutTest {

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

    private Author author;

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

        AuthorAnalytics authorAnalytics = new AuthorAnalytics();
        authorAnalytics.setBias("Neutral");
        authorAnalytics.setViews(12000);
        authorAnalytics.setShares(450);
        authorAnalytics.setLikes(300);
        authorAnalytics.setEngagementRate(0.15);
        AuthorAnalytics savedAuthorAnalytics = authorAnalyticsRepository.saveAndFlush(authorAnalytics);

        this.author = new Author();
        author.setName("Jane Doe");
        author.setAnalytics(savedAuthorAnalytics);
        authorRepository.saveAndFlush(author);
    }

    @Test
    public void testUpdateAuthor_withValidInput() {
        AuthorDTO updatedDTO = new AuthorDTO();
        updatedDTO.setName("Updated Author Name");

        ResponseEntity<AuthorDTO> response = restTemplate.exchange(
            "/authors/" + this.author.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(updatedDTO),
            AuthorDTO.class
        );

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        AuthorDTO updatedAuthor = response.getBody();
        assertThat(updatedAuthor).isNotNull();
        assertThat(updatedAuthor.getName()).isEqualTo("Updated Author Name");

        Author savedAuthor = authorRepository.findById(author.getId()).orElse(null);
        assertThat(savedAuthor).isNotNull();
        assertThat(savedAuthor.getName()).isEqualTo("Updated Author Name");
    }

    @Test
    public void testUpdateAuthor_withInvalidInput() {
        AuthorDTO invalidDTO = new AuthorDTO(); // Missing name

        ResponseEntity<String> response = restTemplate.exchange(
            "/authors/" + author.getId(),
            HttpMethod.PUT,
            new HttpEntity<>(invalidDTO),
            String.class
        );


        Author savedAuthor = authorRepository.findById(author.getId()).orElse(null);
        assertThat(savedAuthor).isNotNull();
        assertThat(savedAuthor.getName()).isEqualTo("Jane Doe");
    }
}

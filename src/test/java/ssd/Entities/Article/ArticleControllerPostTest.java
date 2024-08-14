package ssd.Entities.Article;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.ArticleRawRepository;
import ssd.Entities.Article.Raw.RESTapi.ArticleRawDTO;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Base.PublisherRepository;

import java.util.Date;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ArticleControllerPostTest {

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

    @Autowired
    private ArticleRawRepository articleRawRepository;

    private ArticleRaw articleRaw;

    @BeforeEach
    public void setup() {
        articleRepository.deleteAll();
        authorRepository.deleteAll();
        publisherRepository.deleteAll();
        ownerRepository.deleteAll();
        newspaperRepository.deleteAll();
        articleAnalyticsRepository.deleteAll();
        authorAnalyticsRepository.deleteAll();
        publisherAnalyticsRepository.deleteAll();
        ownerAnalyticsRepository.deleteAll();
        newspaperAnalyticsRepository.deleteAll();
    }

    @Test
    public void testCreateArticle_withValidInput() {
        ArticleRawDTO newArticleRawDTO = new ArticleRawDTO();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.AUGUST); // Month is 0-based, so August is 7
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        Date specificDate = calendar.getTime();
        newArticleRawDTO.setDate(specificDate);        
        newArticleRawDTO.setScrapeContent("This is the content of the new article.");
        newArticleRawDTO.setUrl("https://blabla");

        ResponseEntity<ArticleRawDTO> response = restTemplate.postForEntity("/article-raws/", newArticleRawDTO, ArticleRawDTO.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        ArticleRawDTO createdArticle = response.getBody();
        assertThat(createdArticle).isNotNull();
        assertThat(createdArticle.getScrapeContent()).isEqualTo("This is the content of the new article");

        ArticleRaw savedArticleRaw = articleRawRepository.findById(createdArticle.getId()).orElse(null);
        assertThat(savedArticleRaw).isNotNull();
        assertThat(savedArticleRaw.getScrapeContent()).isEqualTo("This is the content of the new article.");
    }

    @Test
    public void testCreateArticle_withInvalidInput() {
        ArticleRawDTO invalidArticleRawDTO = new ArticleRawDTO();  // Missing date
        invalidArticleRawDTO.setScrapeContent("This is the content of the new article.");
        invalidArticleRawDTO.setUrl("https://blabla");

        ResponseEntity<String> response = restTemplate.postForEntity("/article-raws/", invalidArticleRawDTO, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }
}

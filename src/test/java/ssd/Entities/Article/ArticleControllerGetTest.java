package ssd.Entities.Article;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.ArticleAnalyticsRepository;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.AuthorAnalyticsRepository;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalyticsRepository;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.OwnerAnalyticsRepository;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.PublisherAnalyticsRepository;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.PublisherRepository;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ArticleControllerGetTest {

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

    private Article article;

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

        // Create and save necessary entities for testing
        AuthorAnalytics authorAnalytics = new AuthorAnalytics();
        authorAnalytics.setBias("Neutral");
        authorAnalytics.setViews(12000);
        authorAnalytics.setShares(450);
        authorAnalytics.setLikes(300);
        authorAnalytics.setEngagementRate(0.15);
        AuthorAnalytics savedAuthorAnalytics = authorAnalyticsRepository.saveAndFlush(authorAnalytics);

        Author author = new Author();
        author.setName("Jane Doe");
        author.setAnalytics(savedAuthorAnalytics);
        Author savedAuthor = authorRepository.saveAndFlush(author);

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();
        publisherAnalytics.setBias("Neutral");
        publisherAnalytics.setViews(12000);
        publisherAnalytics.setShares(450);
        publisherAnalytics.setLikes(300);
        publisherAnalytics.setEngagementRate(0.15);
        PublisherAnalytics savedPublisherAnalytics = publisherAnalyticsRepository.saveAndFlush(publisherAnalytics);

        Publisher publisher = new Publisher();
        publisher.setName("Global News Network");
        publisher.setAnalytics(savedPublisherAnalytics);
        Publisher savedPublisher = publisherRepository.saveAndFlush(publisher);

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();
        ownerAnalytics.setBias("Neutral");
        ownerAnalytics.setViews(12000);
        ownerAnalytics.setShares(450);
        ownerAnalytics.setLikes(300);
        ownerAnalytics.setEngagementRate(0.15);
        OwnerAnalytics savedOwnerAnalytics = ownerAnalyticsRepository.saveAndFlush(ownerAnalytics);

        Owner owner = new Owner();
        owner.setName("John Smith");
        owner.setAnalytics(savedOwnerAnalytics);
        Owner savedOwner = ownerRepository.saveAndFlush(owner);

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();
        newspaperAnalytics.setBias("Neutral");
        newspaperAnalytics.setViews(12000);
        newspaperAnalytics.setShares(450);
        newspaperAnalytics.setLikes(300);
        newspaperAnalytics.setEngagementRate(0.15);
        NewspaperAnalytics savedNewspaperAnalytics = newspaperAnalyticsRepository.saveAndFlush(newspaperAnalytics);

        Newspaper newspaper = new Newspaper();
        newspaper.setName("Daily News");
        newspaper.setAnalytics(savedNewspaperAnalytics);
        Newspaper savedNewspaper = newspaperRepository.saveAndFlush(newspaper);

        ArticleAnalytics articleAnalytics = new ArticleAnalytics();
        articleAnalytics.setBias("Neutral");
        articleAnalytics.setViews(12000);
        articleAnalytics.setShares(450);
        articleAnalytics.setLikes(300);
        articleAnalytics.setEngagementRate(0.15);
        ArticleAnalytics savedArticleAnalytics = articleAnalyticsRepository.saveAndFlush(articleAnalytics);

        article = new Article();
        article.setName("The Impact of Climate Change on Coastal Communities");
        article.setAuthor(savedAuthor);
        article.setPublisher(savedPublisher);
        article.setOwner(savedOwner);
        article.setNewspaper(savedNewspaper);
        article.setContent("Coastal communities around the world are facing increasing threats from rising sea levels caused by climate change. This article explores the impact on these communities and the measures being taken to mitigate the damage.");
        article.setAnalytics(savedArticleAnalytics);
        articleRepository.saveAndFlush(article);
    }

    @Test
    public void testGetAllArticles_emptyDatabase() throws Exception {
        articleRepository.deleteAll();

        ResponseEntity<Article[]> response = restTemplate.getForEntity("/articles/", Article[].class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEmpty();
    }

    @Test
    public void testGetAllArticles() throws Exception {
        ResponseEntity<Article[]> response = restTemplate.getForEntity("/articles/", Article[].class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Article[] articles = response.getBody();
        assertThat(articles).isNotNull();
        assertThat(articles.length).isGreaterThan(0);
        assertThat(articles[0].getName()).isEqualTo("The Impact of Climate Change on Coastal Communities");
        assertThat(articles[0].getAnalytics().getBias()).isEqualTo("Neutral");
        assertThat(articles[0].getAnalytics().getViews()).isEqualTo(12000);
        assertThat(articles[0].getAnalytics().getShares()).isEqualTo(450);
        assertThat(articles[0].getAnalytics().getLikes()).isEqualTo(300);
        assertThat(articles[0].getAnalytics().getEngagementRate()).isEqualTo(0.15);
    }

    @Test
    public void testGetArticleById_notFound() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity("/articles/999", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void testGetArticleById() throws Exception {
        Long articleId = article.getId();

        ResponseEntity<Article> response = restTemplate.getForEntity("/articles/" + articleId, Article.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Article retrievedArticle = response.getBody();
        assertThat(retrievedArticle).isNotNull();
        assertThat(retrievedArticle.getName()).isEqualTo("The Impact of Climate Change on Coastal Communities");
        assertThat(retrievedArticle.getAnalytics().getBias()).isEqualTo("Neutral");
        assertThat(retrievedArticle.getAnalytics().getViews()).isEqualTo(12000);
        assertThat(retrievedArticle.getAnalytics().getShares()).isEqualTo(450);
        assertThat(retrievedArticle.getAnalytics().getLikes()).isEqualTo(300);
        assertThat(retrievedArticle.getAnalytics().getEngagementRate()).isEqualTo(0.15);
    }

    @Test
    public void testGetArticlesByName_notFound() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity("/articles/name/Nonexistent Title", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void testGetArticlesByName() throws Exception {
        String title = "The Impact of Climate Change on Coastal Communities";
        ResponseEntity<Article[]> response = restTemplate.getForEntity("/articles/name/" + title, Article[].class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Article[] articles = response.getBody();
        assertThat(articles).isNotNull();
        assertThat(articles.length).isGreaterThan(0);
        assertThat(articles[0].getName()).isEqualTo(title);
        assertThat(articles[0].getAnalytics().getBias()).isEqualTo("Neutral");
        assertThat(articles[0].getAnalytics().getViews()).isEqualTo(12000);
        assertThat(articles[0].getAnalytics().getShares()).isEqualTo(450);
        assertThat(articles[0].getAnalytics().getLikes()).isEqualTo(300);
        assertThat(articles[0].getAnalytics().getEngagementRate()).isEqualTo(0.15);
    }

    @Test
    public void testGetPopularArticles() throws Exception {
        ResponseEntity<Article[]> response = restTemplate.getForEntity("/articles/popular/1", Article[].class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Article[] articles = response.getBody();
        assertThat(articles).isNotNull();
        assertThat(articles.length).isEqualTo(1);
        assertThat(articles[0].getName()).isEqualTo("The Impact of Climate Change on Coastal Communities");
        assertThat(articles[0].getAnalytics().getBias()).isEqualTo("Neutral");
        assertThat(articles[0].getAnalytics().getViews()).isEqualTo(12000);
        assertThat(articles[0].getAnalytics().getShares()).isEqualTo(450);
        assertThat(articles[0].getAnalytics().getLikes()).isEqualTo(300);
        assertThat(articles[0].getAnalytics().getEngagementRate()).isEqualTo(0.15);
    }

    @Test
    public void testGetPopularArticles_noContent() throws Exception {
        articleRepository.deleteAll();

        ResponseEntity<String> response = restTemplate.getForEntity("/articles/popular/1", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
    }
}

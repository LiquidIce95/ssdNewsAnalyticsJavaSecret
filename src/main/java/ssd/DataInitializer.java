package ssd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
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

@Component
public class DataInitializer implements CommandLineRunner {

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

    @Override
    public void run(String... args) throws Exception {
        // Initialize Analytics with default constructor
        AuthorAnalytics authorAnalytics = new AuthorAnalytics();
        authorAnalytics.setBias("Neutral");
        authorAnalytics.setViews(12000);
        authorAnalytics.setShares(450);
        authorAnalytics.setLikes(300);
        authorAnalytics.setEngagementRate(0.15);
        AuthorAnalytics savedAuthorAnalytics = authorAnalyticsRepository.save(authorAnalytics);

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();
        publisherAnalytics.setBias("Neutral");
        publisherAnalytics.setViews(12000);
        publisherAnalytics.setShares(450);
        publisherAnalytics.setLikes(300);
        publisherAnalytics.setEngagementRate(0.15);
        PublisherAnalytics savedPublisherAnalytics = publisherAnalyticsRepository.save(publisherAnalytics);


        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();
        ownerAnalytics.setBias("Neutral");
        ownerAnalytics.setViews(12000);
        ownerAnalytics.setShares(450);
        ownerAnalytics.setLikes(300);
        ownerAnalytics.setEngagementRate(0.15);
        OwnerAnalytics savedOwnerAnalytics = ownerAnalyticsRepository.save(ownerAnalytics);

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();
        newspaperAnalytics.setBias("Neutral");
        newspaperAnalytics.setViews(12000);
        newspaperAnalytics.setShares(450);
        newspaperAnalytics.setLikes(300);
        newspaperAnalytics.setEngagementRate(0.15);
        NewspaperAnalytics savedNewspaperAnalytics = newspaperAnalyticsRepository.save(newspaperAnalytics);

        ArticleAnalytics articleAnalytics = new ArticleAnalytics();
        articleAnalytics.setBias("Neutral");
        articleAnalytics.setViews(12000);
        articleAnalytics.setShares(450);
        articleAnalytics.setLikes(300);
        articleAnalytics.setEngagementRate(0.15);
        ArticleAnalytics savedArticleAnalytics = articleAnalyticsRepository.save(articleAnalytics);

        // Initialize Entities with default constructor
        Author author = new Author();
        author.setName("Jane Doe");
        author.setAnalytics(savedAuthorAnalytics);
        Author savedAuthor = authorRepository.save(author);

        Publisher publisher = new Publisher();
        publisher.setName("Global News Network");
        publisher.setAnalytics(savedPublisherAnalytics);
        Publisher savedPublisher = publisherRepository.save(publisher);

        Owner owner = new Owner();
        owner.setName("John Smith");
        owner.setAnalytics(savedOwnerAnalytics);
        Owner savedOwner = ownerRepository.save(owner);

        Newspaper newspaper = new Newspaper();
        newspaper.setName("Daily News");
        newspaper.setAnalytics(savedNewspaperAnalytics);
        Newspaper savedNewspaper = newspaperRepository.save(newspaper);

        Article article = new Article();
        article.setName("The Impact of Climate Change on Coastal Communities");
        article.setAuthor(savedAuthor);
        article.setPublisher(savedPublisher);
        article.setOwner(savedOwner);
        article.setNewspaper(savedNewspaper);
        article.setContent("Coastal communities around the world are facing increasing threats from rising sea levels caused by climate change. This article explores the impact on these communities and the measures being taken to mitigate the damage.");
        article.setAnalytics(savedArticleAnalytics);
        articleRepository.save(article);
    }
}

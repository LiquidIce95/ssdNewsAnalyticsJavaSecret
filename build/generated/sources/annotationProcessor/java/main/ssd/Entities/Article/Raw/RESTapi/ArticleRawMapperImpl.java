package ssd.Entities.Article.Raw.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPostDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPutDTO;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticleGetDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticlePostDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticlePutDTO;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawGetDTO;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawPostDTO;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawPutDTO;
import ssd.Entities.Author.Analytics.AuthorAnalytics;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsGetDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPostDTO;
import ssd.Entities.Author.Analytics.RESTapi.DTO.AuthorAnalyticsPutDTO;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorGetDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPostDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPutDTO;
import ssd.Entities.Newspaper.Analytics.NewspaperAnalytics;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsGetDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPostDTO;
import ssd.Entities.Newspaper.Analytics.RESTapi.DTO.NewspaperAnalyticsPutDTO;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperGetDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPostDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPutDTO;
import ssd.Entities.Owner.Analytics.OwnerAnalytics;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsGetDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPostDTO;
import ssd.Entities.Owner.Analytics.RESTapi.DTO.OwnerAnalyticsPutDTO;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerGetDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPostDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPutDTO;
import ssd.Entities.Publisher.Analytics.PublisherAnalytics;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsGetDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPostDTO;
import ssd.Entities.Publisher.Analytics.RESTapi.DTO.PublisherAnalyticsPutDTO;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherGetDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPostDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPutDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPostDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPutDTO;
import ssd.Entities.Topic.Analytics.TopicAnalytics;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicGetDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPostDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPutDTO;
import ssd.Entities.Topic.Base.Topic;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class ArticleRawMapperImpl implements ArticleRawMapper {

    @Override
    public ArticleRawGetDTO convertEntityToGetDTO(ArticleRaw articleRaw) {
        if ( articleRaw == null ) {
            return null;
        }

        ArticleRawGetDTO articleRawGetDTO = new ArticleRawGetDTO();

        articleRawGetDTO.setDate( articleRaw.getDate() );
        articleRawGetDTO.setId( articleRaw.getId() );
        articleRawGetDTO.setScrapeContent( articleRaw.getScrapeContent() );
        articleRawGetDTO.setUrl( articleRaw.getUrl() );
        articleRawGetDTO.setBaseEntity( articleToArticleGetDTO( articleRaw.getBaseEntity() ) );

        return articleRawGetDTO;
    }

    @Override
    public ArticleRaw convertPostDTOToEntity(ArticleRawPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        ArticleRaw articleRaw = new ArticleRaw();

        articleRaw.setScrapeContent( postDTO.getScrapeContent() );
        articleRaw.setDate( postDTO.getDate() );
        articleRaw.setUrl( postDTO.getUrl() );
        articleRaw.setBaseEntity( articlePostDTOToArticle( postDTO.getBaseEntity() ) );

        return articleRaw;
    }

    @Override
    public ArticleRaw updateEntityFromPutDTO(ArticleRawPutDTO putDTO, ArticleRaw articleRaw) {
        if ( putDTO == null && articleRaw == null ) {
            return null;
        }

        ArticleRaw articleRaw1 = new ArticleRaw();

        if ( putDTO != null ) {
            articleRaw1.setDate( putDTO.getDate() );
            articleRaw1.setScrapeContent( putDTO.getScrapeContent() );
            articleRaw1.setUrl( putDTO.getUrl() );
            articleRaw1.setBaseEntity( articlePutDTOToArticle( putDTO.getBaseEntity() ) );
        }

        return articleRaw1;
    }

    protected ArticleAnalyticsGetDTO articleAnalyticsToArticleAnalyticsGetDTO(ArticleAnalytics articleAnalytics) {
        if ( articleAnalytics == null ) {
            return null;
        }

        ArticleAnalyticsGetDTO articleAnalyticsGetDTO = new ArticleAnalyticsGetDTO();

        articleAnalyticsGetDTO.setId( articleAnalytics.getId() );
        articleAnalyticsGetDTO.setBias( articleAnalytics.getBias() );
        articleAnalyticsGetDTO.setViews( articleAnalytics.getViews() );
        articleAnalyticsGetDTO.setShares( articleAnalytics.getShares() );
        articleAnalyticsGetDTO.setLikes( articleAnalytics.getLikes() );
        articleAnalyticsGetDTO.setEngagementRate( articleAnalytics.getEngagementRate() );

        return articleAnalyticsGetDTO;
    }

    protected AuthorAnalyticsGetDTO authorAnalyticsToAuthorAnalyticsGetDTO(AuthorAnalytics authorAnalytics) {
        if ( authorAnalytics == null ) {
            return null;
        }

        AuthorAnalyticsGetDTO authorAnalyticsGetDTO = new AuthorAnalyticsGetDTO();

        authorAnalyticsGetDTO.setId( authorAnalytics.getId() );
        authorAnalyticsGetDTO.setBias( authorAnalytics.getBias() );
        authorAnalyticsGetDTO.setViews( authorAnalytics.getViews() );
        authorAnalyticsGetDTO.setShares( authorAnalytics.getShares() );
        authorAnalyticsGetDTO.setLikes( authorAnalytics.getLikes() );
        authorAnalyticsGetDTO.setEngagementRate( authorAnalytics.getEngagementRate() );

        return authorAnalyticsGetDTO;
    }

    protected AuthorGetDTO authorToAuthorGetDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorGetDTO authorGetDTO = new AuthorGetDTO();

        authorGetDTO.setId( author.getId() );
        authorGetDTO.setName( author.getName() );
        authorGetDTO.setAnalytics( authorAnalyticsToAuthorAnalyticsGetDTO( author.getAnalytics() ) );

        return authorGetDTO;
    }

    protected PublisherAnalyticsGetDTO publisherAnalyticsToPublisherAnalyticsGetDTO(PublisherAnalytics publisherAnalytics) {
        if ( publisherAnalytics == null ) {
            return null;
        }

        PublisherAnalyticsGetDTO publisherAnalyticsGetDTO = new PublisherAnalyticsGetDTO();

        publisherAnalyticsGetDTO.setId( publisherAnalytics.getId() );
        publisherAnalyticsGetDTO.setBias( publisherAnalytics.getBias() );
        publisherAnalyticsGetDTO.setViews( publisherAnalytics.getViews() );
        publisherAnalyticsGetDTO.setShares( publisherAnalytics.getShares() );
        publisherAnalyticsGetDTO.setLikes( publisherAnalytics.getLikes() );
        publisherAnalyticsGetDTO.setEngagementRate( publisherAnalytics.getEngagementRate() );

        return publisherAnalyticsGetDTO;
    }

    protected PublisherGetDTO publisherToPublisherGetDTO(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        PublisherGetDTO publisherGetDTO = new PublisherGetDTO();

        publisherGetDTO.setId( publisher.getId() );
        publisherGetDTO.setName( publisher.getName() );
        publisherGetDTO.setAnalytics( publisherAnalyticsToPublisherAnalyticsGetDTO( publisher.getAnalytics() ) );

        return publisherGetDTO;
    }

    protected TopicAnalyticsGetDTO topicAnalyticsToTopicAnalyticsGetDTO(TopicAnalytics topicAnalytics) {
        if ( topicAnalytics == null ) {
            return null;
        }

        TopicAnalyticsGetDTO topicAnalyticsGetDTO = new TopicAnalyticsGetDTO();

        topicAnalyticsGetDTO.setId( topicAnalytics.getId() );
        topicAnalyticsGetDTO.setBias( topicAnalytics.getBias() );
        topicAnalyticsGetDTO.setViews( topicAnalytics.getViews() );
        topicAnalyticsGetDTO.setShares( topicAnalytics.getShares() );
        topicAnalyticsGetDTO.setLikes( topicAnalytics.getLikes() );
        topicAnalyticsGetDTO.setEngagementRate( topicAnalytics.getEngagementRate() );

        return topicAnalyticsGetDTO;
    }

    protected TopicGetDTO topicToTopicGetDTO(Topic topic) {
        if ( topic == null ) {
            return null;
        }

        TopicGetDTO topicGetDTO = new TopicGetDTO();

        topicGetDTO.setId( topic.getId() );
        topicGetDTO.setName( topic.getName() );
        topicGetDTO.setAnalytics( topicAnalyticsToTopicAnalyticsGetDTO( topic.getAnalytics() ) );

        return topicGetDTO;
    }

    protected OwnerAnalyticsGetDTO ownerAnalyticsToOwnerAnalyticsGetDTO(OwnerAnalytics ownerAnalytics) {
        if ( ownerAnalytics == null ) {
            return null;
        }

        OwnerAnalyticsGetDTO ownerAnalyticsGetDTO = new OwnerAnalyticsGetDTO();

        ownerAnalyticsGetDTO.setId( ownerAnalytics.getId() );
        ownerAnalyticsGetDTO.setBias( ownerAnalytics.getBias() );
        ownerAnalyticsGetDTO.setViews( ownerAnalytics.getViews() );
        ownerAnalyticsGetDTO.setShares( ownerAnalytics.getShares() );
        ownerAnalyticsGetDTO.setLikes( ownerAnalytics.getLikes() );
        ownerAnalyticsGetDTO.setEngagementRate( ownerAnalytics.getEngagementRate() );

        return ownerAnalyticsGetDTO;
    }

    protected OwnerGetDTO ownerToOwnerGetDTO(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerGetDTO ownerGetDTO = new OwnerGetDTO();

        ownerGetDTO.setId( owner.getId() );
        ownerGetDTO.setName( owner.getName() );
        ownerGetDTO.setAnalytics( ownerAnalyticsToOwnerAnalyticsGetDTO( owner.getAnalytics() ) );

        return ownerGetDTO;
    }

    protected NewspaperAnalyticsGetDTO newspaperAnalyticsToNewspaperAnalyticsGetDTO(NewspaperAnalytics newspaperAnalytics) {
        if ( newspaperAnalytics == null ) {
            return null;
        }

        NewspaperAnalyticsGetDTO newspaperAnalyticsGetDTO = new NewspaperAnalyticsGetDTO();

        newspaperAnalyticsGetDTO.setId( newspaperAnalytics.getId() );
        newspaperAnalyticsGetDTO.setBias( newspaperAnalytics.getBias() );
        newspaperAnalyticsGetDTO.setViews( newspaperAnalytics.getViews() );
        newspaperAnalyticsGetDTO.setShares( newspaperAnalytics.getShares() );
        newspaperAnalyticsGetDTO.setLikes( newspaperAnalytics.getLikes() );
        newspaperAnalyticsGetDTO.setEngagementRate( newspaperAnalytics.getEngagementRate() );

        return newspaperAnalyticsGetDTO;
    }

    protected NewspaperGetDTO newspaperToNewspaperGetDTO(Newspaper newspaper) {
        if ( newspaper == null ) {
            return null;
        }

        NewspaperGetDTO newspaperGetDTO = new NewspaperGetDTO();

        newspaperGetDTO.setId( newspaper.getId() );
        newspaperGetDTO.setName( newspaper.getName() );
        newspaperGetDTO.setAnalytics( newspaperAnalyticsToNewspaperAnalyticsGetDTO( newspaper.getAnalytics() ) );

        return newspaperGetDTO;
    }

    protected ArticleGetDTO articleToArticleGetDTO(Article article) {
        if ( article == null ) {
            return null;
        }

        ArticleGetDTO articleGetDTO = new ArticleGetDTO();

        articleGetDTO.setId( article.getId() );
        articleGetDTO.setName( article.getName() );
        articleGetDTO.setAnalytics( articleAnalyticsToArticleAnalyticsGetDTO( article.getAnalytics() ) );
        articleGetDTO.setAuthor( authorToAuthorGetDTO( article.getAuthor() ) );
        articleGetDTO.setPublisher( publisherToPublisherGetDTO( article.getPublisher() ) );
        articleGetDTO.setTopic( topicToTopicGetDTO( article.getTopic() ) );
        articleGetDTO.setOwner( ownerToOwnerGetDTO( article.getOwner() ) );
        articleGetDTO.setNewspaper( newspaperToNewspaperGetDTO( article.getNewspaper() ) );
        articleGetDTO.setContent( article.getContent() );

        return articleGetDTO;
    }

    protected AuthorAnalytics authorAnalyticsPostDTOToAuthorAnalytics(AuthorAnalyticsPostDTO authorAnalyticsPostDTO) {
        if ( authorAnalyticsPostDTO == null ) {
            return null;
        }

        AuthorAnalytics authorAnalytics = new AuthorAnalytics();

        authorAnalytics.setBias( authorAnalyticsPostDTO.getBias() );
        authorAnalytics.setViews( authorAnalyticsPostDTO.getViews() );
        authorAnalytics.setShares( authorAnalyticsPostDTO.getShares() );
        authorAnalytics.setLikes( authorAnalyticsPostDTO.getLikes() );
        authorAnalytics.setEngagementRate( authorAnalyticsPostDTO.getEngagementRate() );

        return authorAnalytics;
    }

    protected Author authorPostDTOToAuthor(AuthorPostDTO authorPostDTO) {
        if ( authorPostDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setName( authorPostDTO.getName() );
        author.setAnalytics( authorAnalyticsPostDTOToAuthorAnalytics( authorPostDTO.getAnalytics() ) );

        return author;
    }

    protected PublisherAnalytics publisherAnalyticsPostDTOToPublisherAnalytics(PublisherAnalyticsPostDTO publisherAnalyticsPostDTO) {
        if ( publisherAnalyticsPostDTO == null ) {
            return null;
        }

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();

        publisherAnalytics.setBias( publisherAnalyticsPostDTO.getBias() );
        publisherAnalytics.setViews( publisherAnalyticsPostDTO.getViews() );
        publisherAnalytics.setShares( publisherAnalyticsPostDTO.getShares() );
        publisherAnalytics.setLikes( publisherAnalyticsPostDTO.getLikes() );
        publisherAnalytics.setEngagementRate( publisherAnalyticsPostDTO.getEngagementRate() );

        return publisherAnalytics;
    }

    protected Publisher publisherPostDTOToPublisher(PublisherPostDTO publisherPostDTO) {
        if ( publisherPostDTO == null ) {
            return null;
        }

        Publisher publisher = new Publisher();

        publisher.setName( publisherPostDTO.getName() );
        publisher.setAnalytics( publisherAnalyticsPostDTOToPublisherAnalytics( publisherPostDTO.getAnalytics() ) );

        return publisher;
    }

    protected TopicAnalytics topicAnalyticsPostDTOToTopicAnalytics(TopicAnalyticsPostDTO topicAnalyticsPostDTO) {
        if ( topicAnalyticsPostDTO == null ) {
            return null;
        }

        TopicAnalytics topicAnalytics = new TopicAnalytics();

        topicAnalytics.setBias( topicAnalyticsPostDTO.getBias() );
        topicAnalytics.setViews( topicAnalyticsPostDTO.getViews() );
        topicAnalytics.setShares( topicAnalyticsPostDTO.getShares() );
        topicAnalytics.setLikes( topicAnalyticsPostDTO.getLikes() );
        topicAnalytics.setEngagementRate( topicAnalyticsPostDTO.getEngagementRate() );

        return topicAnalytics;
    }

    protected Topic topicPostDTOToTopic(TopicPostDTO topicPostDTO) {
        if ( topicPostDTO == null ) {
            return null;
        }

        Topic topic = new Topic();

        topic.setName( topicPostDTO.getName() );
        topic.setAnalytics( topicAnalyticsPostDTOToTopicAnalytics( topicPostDTO.getAnalytics() ) );

        return topic;
    }

    protected OwnerAnalytics ownerAnalyticsPostDTOToOwnerAnalytics(OwnerAnalyticsPostDTO ownerAnalyticsPostDTO) {
        if ( ownerAnalyticsPostDTO == null ) {
            return null;
        }

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();

        ownerAnalytics.setBias( ownerAnalyticsPostDTO.getBias() );
        ownerAnalytics.setViews( ownerAnalyticsPostDTO.getViews() );
        ownerAnalytics.setShares( ownerAnalyticsPostDTO.getShares() );
        ownerAnalytics.setLikes( ownerAnalyticsPostDTO.getLikes() );
        ownerAnalytics.setEngagementRate( ownerAnalyticsPostDTO.getEngagementRate() );

        return ownerAnalytics;
    }

    protected Owner ownerPostDTOToOwner(OwnerPostDTO ownerPostDTO) {
        if ( ownerPostDTO == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setName( ownerPostDTO.getName() );
        owner.setAnalytics( ownerAnalyticsPostDTOToOwnerAnalytics( ownerPostDTO.getAnalytics() ) );

        return owner;
    }

    protected NewspaperAnalytics newspaperAnalyticsPostDTOToNewspaperAnalytics(NewspaperAnalyticsPostDTO newspaperAnalyticsPostDTO) {
        if ( newspaperAnalyticsPostDTO == null ) {
            return null;
        }

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();

        newspaperAnalytics.setBias( newspaperAnalyticsPostDTO.getBias() );
        newspaperAnalytics.setViews( newspaperAnalyticsPostDTO.getViews() );
        newspaperAnalytics.setShares( newspaperAnalyticsPostDTO.getShares() );
        newspaperAnalytics.setLikes( newspaperAnalyticsPostDTO.getLikes() );
        newspaperAnalytics.setEngagementRate( newspaperAnalyticsPostDTO.getEngagementRate() );

        return newspaperAnalytics;
    }

    protected Newspaper newspaperPostDTOToNewspaper(NewspaperPostDTO newspaperPostDTO) {
        if ( newspaperPostDTO == null ) {
            return null;
        }

        Newspaper newspaper = new Newspaper();

        newspaper.setName( newspaperPostDTO.getName() );
        newspaper.setAnalytics( newspaperAnalyticsPostDTOToNewspaperAnalytics( newspaperPostDTO.getAnalytics() ) );

        return newspaper;
    }

    protected ArticleAnalytics articleAnalyticsPostDTOToArticleAnalytics(ArticleAnalyticsPostDTO articleAnalyticsPostDTO) {
        if ( articleAnalyticsPostDTO == null ) {
            return null;
        }

        ArticleAnalytics articleAnalytics = new ArticleAnalytics();

        articleAnalytics.setBias( articleAnalyticsPostDTO.getBias() );
        articleAnalytics.setViews( articleAnalyticsPostDTO.getViews() );
        articleAnalytics.setShares( articleAnalyticsPostDTO.getShares() );
        articleAnalytics.setLikes( articleAnalyticsPostDTO.getLikes() );
        articleAnalytics.setEngagementRate( articleAnalyticsPostDTO.getEngagementRate() );

        return articleAnalytics;
    }

    protected Article articlePostDTOToArticle(ArticlePostDTO articlePostDTO) {
        if ( articlePostDTO == null ) {
            return null;
        }

        Article article = new Article();

        article.setName( articlePostDTO.getName() );
        article.setAuthor( authorPostDTOToAuthor( articlePostDTO.getAuthor() ) );
        article.setPublisher( publisherPostDTOToPublisher( articlePostDTO.getPublisher() ) );
        article.setTopic( topicPostDTOToTopic( articlePostDTO.getTopic() ) );
        article.setOwner( ownerPostDTOToOwner( articlePostDTO.getOwner() ) );
        article.setNewspaper( newspaperPostDTOToNewspaper( articlePostDTO.getNewspaper() ) );
        article.setContent( articlePostDTO.getContent() );
        article.setAnalytics( articleAnalyticsPostDTOToArticleAnalytics( articlePostDTO.getAnalytics() ) );

        return article;
    }

    protected AuthorAnalytics authorAnalyticsPutDTOToAuthorAnalytics(AuthorAnalyticsPutDTO authorAnalyticsPutDTO) {
        if ( authorAnalyticsPutDTO == null ) {
            return null;
        }

        AuthorAnalytics authorAnalytics = new AuthorAnalytics();

        authorAnalytics.setBias( authorAnalyticsPutDTO.getBias() );
        authorAnalytics.setViews( authorAnalyticsPutDTO.getViews() );
        authorAnalytics.setShares( authorAnalyticsPutDTO.getShares() );
        authorAnalytics.setLikes( authorAnalyticsPutDTO.getLikes() );
        authorAnalytics.setEngagementRate( authorAnalyticsPutDTO.getEngagementRate() );
        authorAnalytics.setId( authorAnalyticsPutDTO.getId() );

        return authorAnalytics;
    }

    protected Author authorPutDTOToAuthor(AuthorPutDTO authorPutDTO) {
        if ( authorPutDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorPutDTO.getId() );
        author.setName( authorPutDTO.getName() );
        author.setAnalytics( authorAnalyticsPutDTOToAuthorAnalytics( authorPutDTO.getAnalytics() ) );

        return author;
    }

    protected PublisherAnalytics publisherAnalyticsPutDTOToPublisherAnalytics(PublisherAnalyticsPutDTO publisherAnalyticsPutDTO) {
        if ( publisherAnalyticsPutDTO == null ) {
            return null;
        }

        PublisherAnalytics publisherAnalytics = new PublisherAnalytics();

        publisherAnalytics.setBias( publisherAnalyticsPutDTO.getBias() );
        publisherAnalytics.setViews( publisherAnalyticsPutDTO.getViews() );
        publisherAnalytics.setShares( publisherAnalyticsPutDTO.getShares() );
        publisherAnalytics.setLikes( publisherAnalyticsPutDTO.getLikes() );
        publisherAnalytics.setEngagementRate( publisherAnalyticsPutDTO.getEngagementRate() );
        publisherAnalytics.setId( publisherAnalyticsPutDTO.getId() );

        return publisherAnalytics;
    }

    protected Publisher publisherPutDTOToPublisher(PublisherPutDTO publisherPutDTO) {
        if ( publisherPutDTO == null ) {
            return null;
        }

        Publisher publisher = new Publisher();

        publisher.setId( publisherPutDTO.getId() );
        publisher.setName( publisherPutDTO.getName() );
        publisher.setAnalytics( publisherAnalyticsPutDTOToPublisherAnalytics( publisherPutDTO.getAnalytics() ) );

        return publisher;
    }

    protected TopicAnalytics topicAnalyticsPutDTOToTopicAnalytics(TopicAnalyticsPutDTO topicAnalyticsPutDTO) {
        if ( topicAnalyticsPutDTO == null ) {
            return null;
        }

        TopicAnalytics topicAnalytics = new TopicAnalytics();

        topicAnalytics.setBias( topicAnalyticsPutDTO.getBias() );
        topicAnalytics.setViews( topicAnalyticsPutDTO.getViews() );
        topicAnalytics.setShares( topicAnalyticsPutDTO.getShares() );
        topicAnalytics.setLikes( topicAnalyticsPutDTO.getLikes() );
        topicAnalytics.setEngagementRate( topicAnalyticsPutDTO.getEngagementRate() );
        topicAnalytics.setId( topicAnalyticsPutDTO.getId() );

        return topicAnalytics;
    }

    protected Topic topicPutDTOToTopic(TopicPutDTO topicPutDTO) {
        if ( topicPutDTO == null ) {
            return null;
        }

        Topic topic = new Topic();

        topic.setId( topicPutDTO.getId() );
        topic.setName( topicPutDTO.getName() );
        topic.setAnalytics( topicAnalyticsPutDTOToTopicAnalytics( topicPutDTO.getAnalytics() ) );

        return topic;
    }

    protected OwnerAnalytics ownerAnalyticsPutDTOToOwnerAnalytics(OwnerAnalyticsPutDTO ownerAnalyticsPutDTO) {
        if ( ownerAnalyticsPutDTO == null ) {
            return null;
        }

        OwnerAnalytics ownerAnalytics = new OwnerAnalytics();

        ownerAnalytics.setBias( ownerAnalyticsPutDTO.getBias() );
        ownerAnalytics.setViews( ownerAnalyticsPutDTO.getViews() );
        ownerAnalytics.setShares( ownerAnalyticsPutDTO.getShares() );
        ownerAnalytics.setLikes( ownerAnalyticsPutDTO.getLikes() );
        ownerAnalytics.setEngagementRate( ownerAnalyticsPutDTO.getEngagementRate() );
        ownerAnalytics.setId( ownerAnalyticsPutDTO.getId() );

        return ownerAnalytics;
    }

    protected Owner ownerPutDTOToOwner(OwnerPutDTO ownerPutDTO) {
        if ( ownerPutDTO == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setId( ownerPutDTO.getId() );
        owner.setName( ownerPutDTO.getName() );
        owner.setAnalytics( ownerAnalyticsPutDTOToOwnerAnalytics( ownerPutDTO.getAnalytics() ) );

        return owner;
    }

    protected NewspaperAnalytics newspaperAnalyticsPutDTOToNewspaperAnalytics(NewspaperAnalyticsPutDTO newspaperAnalyticsPutDTO) {
        if ( newspaperAnalyticsPutDTO == null ) {
            return null;
        }

        NewspaperAnalytics newspaperAnalytics = new NewspaperAnalytics();

        newspaperAnalytics.setBias( newspaperAnalyticsPutDTO.getBias() );
        newspaperAnalytics.setViews( newspaperAnalyticsPutDTO.getViews() );
        newspaperAnalytics.setShares( newspaperAnalyticsPutDTO.getShares() );
        newspaperAnalytics.setLikes( newspaperAnalyticsPutDTO.getLikes() );
        newspaperAnalytics.setEngagementRate( newspaperAnalyticsPutDTO.getEngagementRate() );
        newspaperAnalytics.setId( newspaperAnalyticsPutDTO.getId() );

        return newspaperAnalytics;
    }

    protected Newspaper newspaperPutDTOToNewspaper(NewspaperPutDTO newspaperPutDTO) {
        if ( newspaperPutDTO == null ) {
            return null;
        }

        Newspaper newspaper = new Newspaper();

        newspaper.setId( newspaperPutDTO.getId() );
        newspaper.setName( newspaperPutDTO.getName() );
        newspaper.setAnalytics( newspaperAnalyticsPutDTOToNewspaperAnalytics( newspaperPutDTO.getAnalytics() ) );

        return newspaper;
    }

    protected ArticleAnalytics articleAnalyticsPutDTOToArticleAnalytics(ArticleAnalyticsPutDTO articleAnalyticsPutDTO) {
        if ( articleAnalyticsPutDTO == null ) {
            return null;
        }

        ArticleAnalytics articleAnalytics = new ArticleAnalytics();

        articleAnalytics.setBias( articleAnalyticsPutDTO.getBias() );
        articleAnalytics.setViews( articleAnalyticsPutDTO.getViews() );
        articleAnalytics.setShares( articleAnalyticsPutDTO.getShares() );
        articleAnalytics.setLikes( articleAnalyticsPutDTO.getLikes() );
        articleAnalytics.setEngagementRate( articleAnalyticsPutDTO.getEngagementRate() );
        articleAnalytics.setId( articleAnalyticsPutDTO.getId() );

        return articleAnalytics;
    }

    protected Article articlePutDTOToArticle(ArticlePutDTO articlePutDTO) {
        if ( articlePutDTO == null ) {
            return null;
        }

        Article article = new Article();

        article.setId( articlePutDTO.getId() );
        article.setName( articlePutDTO.getName() );
        article.setAuthor( authorPutDTOToAuthor( articlePutDTO.getAuthor() ) );
        article.setPublisher( publisherPutDTOToPublisher( articlePutDTO.getPublisher() ) );
        article.setTopic( topicPutDTOToTopic( articlePutDTO.getTopic() ) );
        article.setOwner( ownerPutDTOToOwner( articlePutDTO.getOwner() ) );
        article.setNewspaper( newspaperPutDTOToNewspaper( articlePutDTO.getNewspaper() ) );
        article.setContent( articlePutDTO.getContent() );
        article.setAnalytics( articleAnalyticsPutDTOToArticleAnalytics( articlePutDTO.getAnalytics() ) );

        return article;
    }
}

package ssd.Entities.Article.Base.RESTapi.DTO;

import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPutDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPutDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPutDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPutDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPutDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPutDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPutDTO;

public class ArticlePutDTO extends BaseEntityPutDTO<ArticleAnalyticsPutDTO> {
    private AuthorPutDTO author;
    private PublisherPutDTO publisher;
    private TopicPutDTO topic;
    private OwnerPutDTO owner;
    private NewspaperPutDTO newspaper;
    private String content;

    // Getters
    public AuthorPutDTO getAuthor() {
        return author;
    }

    public PublisherPutDTO getPublisher() {
        return publisher;
    }

    public TopicPutDTO getTopic() {
        return topic;
    }

    public OwnerPutDTO getOwner() {
        return owner;
    }

    public NewspaperPutDTO getNewspaper() {
        return newspaper;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setAuthor(AuthorPutDTO author) {
        this.author = author;
    }

    public void setPublisher(PublisherPutDTO publisher) {
        this.publisher = publisher;
    }

    public void setTopic(TopicPutDTO topic) {
        this.topic = topic;
    }

    public void setOwner(OwnerPutDTO owner) {
        this.owner = owner;
    }

    public void setNewspaper(NewspaperPutDTO newspaper) {
        this.newspaper = newspaper;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

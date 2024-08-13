package ssd.Entities.Article.Base.RESTapi.DTO;

import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPostDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPostDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPostDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPostDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPostDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPostDTO;

public class ArticlePostDTO extends BaseEntityPostDTO<ArticleAnalyticsPostDTO> {
    private AuthorPostDTO author;
    private PublisherPostDTO publisher;
    private TopicPostDTO topic;
    private OwnerPostDTO owner;
    private NewspaperPostDTO newspaper;
    private String content;

    // Getters
    public AuthorPostDTO getAuthor() {
        return author;
    }

    public PublisherPostDTO getPublisher() {
        return publisher;
    }

    public TopicPostDTO getTopic() {
        return topic;
    }

    public OwnerPostDTO getOwner() {
        return owner;
    }

    public NewspaperPostDTO getNewspaper() {
        return newspaper;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setAuthor(AuthorPostDTO author) {
        this.author = author;
    }

    public void setPublisher(PublisherPostDTO publisher) {
        this.publisher = publisher;
    }

    public void setTopic(TopicPostDTO topic) {
        this.topic = topic;
    }

    public void setOwner(OwnerPostDTO owner) {
        this.owner = owner;
    }

    public void setNewspaper(NewspaperPostDTO newspaper) {
        this.newspaper = newspaper;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

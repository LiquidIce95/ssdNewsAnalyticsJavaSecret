package ssd.Entities.Article.Base.RESTapi;

import ssd.AbstractClasses.Base.RESTapi.BaseEntityDTO;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.ArticleAnalyticsDTO;
import ssd.Entities.Author.Base.RESTapi.AuthorDTO;
import ssd.Entities.Newspaper.Base.RESTapi.NewspaperDTO;
import ssd.Entities.Owner.Base.RESTapi.OwnerDTO;
import ssd.Entities.Publisher.Base.RESTapi.PublisherDTO;

public class ArticleDTO extends BaseEntityDTO<ArticleAnalyticsDTO> {

    private AuthorDTO author;
    private PublisherDTO publisher;
    private OwnerDTO owner;
    private NewspaperDTO newspaper;
    private String content;

    // Getters and Setters

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public PublisherDTO getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherDTO publisher) {
        this.publisher = publisher;
    }

    public OwnerDTO getOwner() {
        return owner;
    }

    public void setOwner(OwnerDTO owner) {
        this.owner = owner;
    }

    public NewspaperDTO getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(NewspaperDTO newspaper) {
        this.newspaper = newspaper;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

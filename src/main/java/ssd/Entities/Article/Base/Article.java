package ssd.Entities.Article.Base;

import javax.persistence.*;

import ssd.AbstractClasses.Base.BaseEntity;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Publisher.Base.Publisher;
/*  */
@Entity
@Table(name = "article")
public class Article extends BaseEntity<ArticleAnalytics> {

    
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;


    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "newspaper_id", nullable = false)
    private Newspaper newspaper;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;


    public Article(){
      super(ArticleAnalytics.class);
      this.author = new Author();
      this.publisher = new Publisher();
      this.owner = new Owner();
      this.newspaper = new Newspaper();
      this.content = "";
    }

    // Getters and Setters

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Newspaper getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

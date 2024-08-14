package ssd.Entities.Author.Base;

import javax.persistence.*;

import ssd.AbstractClasses.Base.BaseEntity;
import ssd.Entities.Author.Analytics.AuthorAnalytics;

@Entity
@Table(name = "author")
public class Author extends BaseEntity<AuthorAnalytics>{

   public Author(){
    super(AuthorAnalytics.class);
   } 
}

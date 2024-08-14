package ssd.Entities.Author.Raw;

import javax.persistence.Entity;
import javax.persistence.Table;

import ssd.AbstractClasses.Raw.EntityRaw;
import ssd.Entities.Author.Base.Author;

@Entity
@Table(name = "author_raw")
public class AuthorRaw extends EntityRaw<Author> {
    // Additional fields or methods specific to ArticleRaw can be added here if needed
    public AuthorRaw(){
      super(Author.class);
    }
}

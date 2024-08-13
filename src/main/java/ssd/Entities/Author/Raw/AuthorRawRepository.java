package ssd.Entities.Author.Raw;

import org.springframework.stereotype.Repository;

import ssd.AbstractClasses.Raw.EntityRawRepository;

@Repository("authorRawRepository")
public interface AuthorRawRepository extends EntityRawRepository<AuthorRaw>{
}

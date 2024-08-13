package ssd.Entities.Author.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Author.Base.Author;
import ssd.Entities.Author.Base.AuthorRepository;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorGetDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPostDTO;
import ssd.Entities.Author.Base.RESTapi.DTO.AuthorPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/authors")
public class AuthorController extends BaseEntityController<Author, AuthorRepository, AuthorGetDTO, AuthorPostDTO, AuthorPutDTO, AuthorMapper> {

    public AuthorController(AuthorRepository repository, AuthorMapper mapper) {
        super(repository, mapper);
    }
}

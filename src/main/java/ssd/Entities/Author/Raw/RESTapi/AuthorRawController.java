package ssd.Entities.Author.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.AuthorRawRepository;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawGetDTO;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawPostDTO;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/author-raws")
public class AuthorRawController extends EntityRawController<AuthorRaw, AuthorRawRepository, AuthorRawGetDTO, AuthorRawPostDTO, AuthorRawPutDTO, AuthorRawMapper> {

    public AuthorRawController(AuthorRawRepository repository, AuthorRawMapper mapper) {
        super(repository, mapper);
    }
}

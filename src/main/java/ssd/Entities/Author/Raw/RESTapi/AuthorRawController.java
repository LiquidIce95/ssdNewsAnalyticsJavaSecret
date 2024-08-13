package ssd.Entities.Author.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;
import ssd.Entities.Author.Raw.AuthorRaw;
import ssd.Entities.Author.Raw.AuthorRawRepository;
import ssd.Entities.Author.Raw.RESTapi.DTO.AuthorRawGetDTO;

@RestController
@RequestMapping("/author-raws")
public class AuthorRawController extends EntityRawController<AuthorRaw, AuthorRawRepository, AuthorRawGetDTO, AuthorRawMapper> {

    public AuthorRawController(AuthorRawRepository repository, AuthorRawMapper mapper) {
        super(repository, mapper);
    }
}

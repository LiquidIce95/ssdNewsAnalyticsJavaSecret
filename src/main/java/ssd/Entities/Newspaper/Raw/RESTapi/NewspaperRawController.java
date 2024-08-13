package ssd.Entities.Newspaper.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Newspaper.Raw.NewspaperRaw;
import ssd.Entities.Newspaper.Raw.NewspaperRawRepository;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawGetDTO;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawPostDTO;
import ssd.Entities.Newspaper.Raw.RESTapi.DTO.NewspaperRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/newspaper-raws")
public class NewspaperRawController extends EntityRawController<NewspaperRaw, NewspaperRawRepository, NewspaperRawGetDTO, NewspaperRawPostDTO, NewspaperRawPutDTO, NewspaperRawMapper> {

    public NewspaperRawController(NewspaperRawRepository repository, NewspaperRawMapper mapper) {
        super(repository, mapper);
    }
}

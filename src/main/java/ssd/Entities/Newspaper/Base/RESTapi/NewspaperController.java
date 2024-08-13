package ssd.Entities.Newspaper.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Newspaper.Base.Newspaper;
import ssd.Entities.Newspaper.Base.NewspaperRepository;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperGetDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPostDTO;
import ssd.Entities.Newspaper.Base.RESTapi.DTO.NewspaperPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/newspapers")
public class NewspaperController extends BaseEntityController<Newspaper, NewspaperRepository, NewspaperGetDTO, NewspaperPostDTO, NewspaperPutDTO, NewspaperMapper> {

    public NewspaperController(NewspaperRepository repository, NewspaperMapper mapper) {
        super(repository, mapper);
    }
}

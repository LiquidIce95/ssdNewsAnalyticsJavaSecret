package ssd.Entities.Publisher.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Publisher.Base.Publisher;
import ssd.Entities.Publisher.Base.PublisherRepository;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherGetDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPostDTO;
import ssd.Entities.Publisher.Base.RESTapi.DTO.PublisherPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/publishers")
public class PublisherController extends BaseEntityController<Publisher, PublisherRepository, PublisherGetDTO, PublisherPostDTO, PublisherPutDTO, PublisherMapper> {

    public PublisherController(PublisherRepository repository, PublisherMapper mapper) {
        super(repository, mapper);
    }
}

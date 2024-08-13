package ssd.Entities.Publisher.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Publisher.Raw.PublisherRaw;
import ssd.Entities.Publisher.Raw.PublisherRawRepository;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawGetDTO;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawPostDTO;
import ssd.Entities.Publisher.Raw.RESTapi.DTO.PublisherRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/publisher-raws")
public class PublisherRawController extends EntityRawController<PublisherRaw, PublisherRawRepository, PublisherRawGetDTO, PublisherRawPostDTO, PublisherRawPutDTO, PublisherRawMapper> {

    public PublisherRawController(PublisherRawRepository repository, PublisherRawMapper mapper) {
        super(repository, mapper);
    }
}

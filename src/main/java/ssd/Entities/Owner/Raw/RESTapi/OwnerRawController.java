package ssd.Entities.Owner.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.OwnerRawRepository;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawGetDTO;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawPostDTO;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawPutDTO;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;

@RestController
@RequestMapping("/owner-raws")
public class OwnerRawController extends EntityRawController<OwnerRaw, OwnerRawRepository, OwnerRawGetDTO, OwnerRawPostDTO, OwnerRawPutDTO, OwnerRawMapper> {

    public OwnerRawController(OwnerRawRepository repository, OwnerRawMapper mapper) {
        super(repository, mapper);
    }
}

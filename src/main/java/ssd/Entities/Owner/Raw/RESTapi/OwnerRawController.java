package ssd.Entities.Owner.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;
import ssd.Entities.Owner.Raw.OwnerRaw;
import ssd.Entities.Owner.Raw.OwnerRawRepository;
import ssd.Entities.Owner.Raw.RESTapi.DTO.OwnerRawGetDTO;

@RestController
@RequestMapping("/owner-raws")
public class OwnerRawController extends EntityRawController<OwnerRaw, OwnerRawRepository, OwnerRawGetDTO, OwnerRawMapper> {

    public OwnerRawController(OwnerRawRepository repository, OwnerRawMapper mapper) {
        super(repository, mapper);
    }
}

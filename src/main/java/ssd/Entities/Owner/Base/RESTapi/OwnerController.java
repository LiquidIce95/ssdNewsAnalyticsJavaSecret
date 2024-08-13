package ssd.Entities.Owner.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Owner.Base.Owner;
import ssd.Entities.Owner.Base.OwnerRepository;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerGetDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPostDTO;
import ssd.Entities.Owner.Base.RESTapi.DTO.OwnerPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/owners")
public class OwnerController extends BaseEntityController<Owner, OwnerRepository, OwnerGetDTO, OwnerPostDTO, OwnerPutDTO, OwnerMapper> {

    public OwnerController(OwnerRepository repository, OwnerMapper mapper) {
        super(repository, mapper);
    }
}

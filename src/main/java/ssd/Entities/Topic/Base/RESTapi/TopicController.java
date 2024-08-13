package ssd.Entities.Topic.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Topic.Base.Topic;
import ssd.Entities.Topic.Base.TopicRepository;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicGetDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPostDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/topics")
public class TopicController extends BaseEntityController<Topic, TopicRepository, TopicGetDTO, TopicPostDTO, TopicPutDTO, TopicMapper> {

    public TopicController(TopicRepository repository, TopicMapper mapper) {
        super(repository, mapper);
    }
}

package ssd.Entities.Topic.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Topic.Analytics.TopicAnalytics;
import ssd.Entities.Topic.Analytics.TopicAnalyticsRepository;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPostDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPutDTO;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;

@RestController
@RequestMapping("/topic-analytics")
public class TopicAnalyticsController extends AnalyticsController<TopicAnalytics, TopicAnalyticsRepository, TopicAnalyticsGetDTO, TopicAnalyticsPostDTO, TopicAnalyticsPutDTO, TopicAnalyticsMapper> {

    public TopicAnalyticsController(TopicAnalyticsRepository repository, TopicAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}

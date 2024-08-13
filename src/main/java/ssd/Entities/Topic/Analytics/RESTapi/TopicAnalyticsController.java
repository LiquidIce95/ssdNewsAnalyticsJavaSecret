package ssd.Entities.Topic.Analytics.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Analytics.RESTapi.AnalyticsController;
import ssd.Entities.Topic.Analytics.TopicAnalytics;
import ssd.Entities.Topic.Analytics.TopicAnalyticsRepository;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;

@RestController
@RequestMapping("/topic-analytics")
public class TopicAnalyticsController extends AnalyticsController<TopicAnalytics, TopicAnalyticsRepository, TopicAnalyticsGetDTO,TopicAnalyticsMapper> {

    public TopicAnalyticsController(TopicAnalyticsRepository repository, TopicAnalyticsMapper mapper) {
        super(repository, mapper);
    }
}

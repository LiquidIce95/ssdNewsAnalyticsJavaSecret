package ssd.Entities.Topic.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;
import ssd.Entities.Topic.Analytics.TopicAnalytics;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:13:04+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class TopicAnalyticsMapperImpl implements TopicAnalyticsMapper {

    @Override
    public TopicAnalyticsGetDTO convertEntityToGetDTO(TopicAnalytics topicAnalytics) {
        if ( topicAnalytics == null ) {
            return null;
        }

        TopicAnalyticsGetDTO topicAnalyticsGetDTO = new TopicAnalyticsGetDTO();

        topicAnalyticsGetDTO.setShares( topicAnalytics.getShares() );
        topicAnalyticsGetDTO.setEngagementRate( topicAnalytics.getEngagementRate() );
        topicAnalyticsGetDTO.setBias( topicAnalytics.getBias() );
        topicAnalyticsGetDTO.setId( topicAnalytics.getId() );
        topicAnalyticsGetDTO.setViews( topicAnalytics.getViews() );
        topicAnalyticsGetDTO.setLikes( topicAnalytics.getLikes() );

        return topicAnalyticsGetDTO;
    }
}

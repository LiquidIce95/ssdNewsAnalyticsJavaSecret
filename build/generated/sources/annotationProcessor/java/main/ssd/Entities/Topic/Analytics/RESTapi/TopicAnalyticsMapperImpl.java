package ssd.Entities.Topic.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPostDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPutDTO;
import ssd.Entities.Topic.Analytics.TopicAnalytics;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
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

    @Override
    public TopicAnalytics convertPostDTOToEntity(TopicAnalyticsPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        TopicAnalytics topicAnalytics = new TopicAnalytics();

        topicAnalytics.setBias( postDTO.getBias() );
        topicAnalytics.setViews( postDTO.getViews() );
        topicAnalytics.setShares( postDTO.getShares() );
        topicAnalytics.setLikes( postDTO.getLikes() );
        topicAnalytics.setEngagementRate( postDTO.getEngagementRate() );

        return topicAnalytics;
    }

    @Override
    public TopicAnalytics updateEntityFromPutDTO(TopicAnalyticsPutDTO putDTO, TopicAnalytics topicAnalytics) {
        if ( putDTO == null && topicAnalytics == null ) {
            return null;
        }

        TopicAnalytics topicAnalytics1 = new TopicAnalytics();

        if ( putDTO != null ) {
            topicAnalytics1.setShares( putDTO.getShares() );
            topicAnalytics1.setEngagementRate( putDTO.getEngagementRate() );
            topicAnalytics1.setBias( putDTO.getBias() );
            topicAnalytics1.setViews( putDTO.getViews() );
            topicAnalytics1.setLikes( putDTO.getLikes() );
        }

        return topicAnalytics1;
    }
}

package ssd.Entities.Topic.Base.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsGetDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPostDTO;
import ssd.Entities.Topic.Analytics.RESTapi.DTO.TopicAnalyticsPutDTO;
import ssd.Entities.Topic.Analytics.TopicAnalytics;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicGetDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPostDTO;
import ssd.Entities.Topic.Base.RESTapi.DTO.TopicPutDTO;
import ssd.Entities.Topic.Base.Topic;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class TopicMapperImpl implements TopicMapper {

    @Override
    public TopicGetDTO convertEntityToGetDTO(Topic topic) {
        if ( topic == null ) {
            return null;
        }

        TopicGetDTO topicGetDTO = new TopicGetDTO();

        topicGetDTO.setAnalytics( topicAnalyticsToTopicAnalyticsGetDTO( topic.getAnalytics() ) );
        topicGetDTO.setName( topic.getName() );
        topicGetDTO.setId( topic.getId() );

        return topicGetDTO;
    }

    @Override
    public Topic convertPostDTOToEntity(TopicPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Topic topic = new Topic();

        topic.setAnalytics( topicAnalyticsPostDTOToTopicAnalytics( postDTO.getAnalytics() ) );
        topic.setName( postDTO.getName() );

        return topic;
    }

    @Override
    public Topic updateEntityFromPutDTO(TopicPutDTO putDTO, Topic topic) {
        if ( putDTO == null && topic == null ) {
            return null;
        }

        Topic topic1 = new Topic();

        if ( putDTO != null ) {
            topic1.setAnalytics( topicAnalyticsPutDTOToTopicAnalytics( putDTO.getAnalytics() ) );
            topic1.setName( putDTO.getName() );
        }

        return topic1;
    }

    protected TopicAnalyticsGetDTO topicAnalyticsToTopicAnalyticsGetDTO(TopicAnalytics topicAnalytics) {
        if ( topicAnalytics == null ) {
            return null;
        }

        TopicAnalyticsGetDTO topicAnalyticsGetDTO = new TopicAnalyticsGetDTO();

        topicAnalyticsGetDTO.setId( topicAnalytics.getId() );
        topicAnalyticsGetDTO.setBias( topicAnalytics.getBias() );
        topicAnalyticsGetDTO.setViews( topicAnalytics.getViews() );
        topicAnalyticsGetDTO.setShares( topicAnalytics.getShares() );
        topicAnalyticsGetDTO.setLikes( topicAnalytics.getLikes() );
        topicAnalyticsGetDTO.setEngagementRate( topicAnalytics.getEngagementRate() );

        return topicAnalyticsGetDTO;
    }

    protected TopicAnalytics topicAnalyticsPostDTOToTopicAnalytics(TopicAnalyticsPostDTO topicAnalyticsPostDTO) {
        if ( topicAnalyticsPostDTO == null ) {
            return null;
        }

        TopicAnalytics topicAnalytics = new TopicAnalytics();

        topicAnalytics.setBias( topicAnalyticsPostDTO.getBias() );
        topicAnalytics.setViews( topicAnalyticsPostDTO.getViews() );
        topicAnalytics.setShares( topicAnalyticsPostDTO.getShares() );
        topicAnalytics.setLikes( topicAnalyticsPostDTO.getLikes() );
        topicAnalytics.setEngagementRate( topicAnalyticsPostDTO.getEngagementRate() );

        return topicAnalytics;
    }

    protected TopicAnalytics topicAnalyticsPutDTOToTopicAnalytics(TopicAnalyticsPutDTO topicAnalyticsPutDTO) {
        if ( topicAnalyticsPutDTO == null ) {
            return null;
        }

        TopicAnalytics topicAnalytics = new TopicAnalytics();

        topicAnalytics.setBias( topicAnalyticsPutDTO.getBias() );
        topicAnalytics.setViews( topicAnalyticsPutDTO.getViews() );
        topicAnalytics.setShares( topicAnalyticsPutDTO.getShares() );
        topicAnalytics.setLikes( topicAnalyticsPutDTO.getLikes() );
        topicAnalytics.setEngagementRate( topicAnalyticsPutDTO.getEngagementRate() );
        topicAnalytics.setId( topicAnalyticsPutDTO.getId() );

        return topicAnalytics;
    }
}

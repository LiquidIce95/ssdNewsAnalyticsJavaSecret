package ssd.Entities.Article.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T14:13:04+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.10 (Debian)"
)
@Component
public class ArticleAnalyticsMapperImpl implements ArticleAnalyticsMapper {

    @Override
    public ArticleAnalyticsGetDTO convertEntityToGetDTO(ArticleAnalytics articleAnalytics) {
        if ( articleAnalytics == null ) {
            return null;
        }

        ArticleAnalyticsGetDTO articleAnalyticsGetDTO = new ArticleAnalyticsGetDTO();

        articleAnalyticsGetDTO.setShares( articleAnalytics.getShares() );
        articleAnalyticsGetDTO.setEngagementRate( articleAnalytics.getEngagementRate() );
        articleAnalyticsGetDTO.setBias( articleAnalytics.getBias() );
        articleAnalyticsGetDTO.setId( articleAnalytics.getId() );
        articleAnalyticsGetDTO.setViews( articleAnalytics.getViews() );
        articleAnalyticsGetDTO.setLikes( articleAnalytics.getLikes() );

        return articleAnalyticsGetDTO;
    }
}

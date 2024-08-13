package ssd.Entities.Article.Analytics.RESTapi;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ssd.Entities.Article.Analytics.ArticleAnalytics;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsGetDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPostDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPutDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T17:29:08+0200",
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

    @Override
    public ArticleAnalytics convertPostDTOToEntity(ArticleAnalyticsPostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        ArticleAnalytics articleAnalytics = new ArticleAnalytics();

        articleAnalytics.setBias( postDTO.getBias() );
        articleAnalytics.setViews( postDTO.getViews() );
        articleAnalytics.setShares( postDTO.getShares() );
        articleAnalytics.setLikes( postDTO.getLikes() );
        articleAnalytics.setEngagementRate( postDTO.getEngagementRate() );

        return articleAnalytics;
    }

    @Override
    public ArticleAnalytics updateEntityFromPutDTO(ArticleAnalyticsPutDTO putDTO, ArticleAnalytics articleAnalytics) {
        if ( putDTO == null && articleAnalytics == null ) {
            return null;
        }

        ArticleAnalytics articleAnalytics1 = new ArticleAnalytics();

        if ( putDTO != null ) {
            articleAnalytics1.setShares( putDTO.getShares() );
            articleAnalytics1.setEngagementRate( putDTO.getEngagementRate() );
            articleAnalytics1.setBias( putDTO.getBias() );
            articleAnalytics1.setViews( putDTO.getViews() );
            articleAnalytics1.setLikes( putDTO.getLikes() );
        }

        return articleAnalytics1;
    }
}

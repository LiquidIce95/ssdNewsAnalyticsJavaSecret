package ssd.Entities.Article.Base.RESTapi.DTO;

import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPutDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPutDTO;

public class ArticlePutDTO extends BaseEntityPutDTO<ArticleAnalyticsPutDTO> {
    private Long authorId;
    private Long publisherId;
    private Long topicId;
    private Long ownerId;
    private Long newspaperId;
    private String content;

    // Getters and Setters

    // Additional fields or methods specific to Article can be added here
}

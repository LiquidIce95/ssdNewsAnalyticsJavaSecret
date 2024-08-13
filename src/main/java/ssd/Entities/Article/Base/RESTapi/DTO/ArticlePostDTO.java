package ssd.Entities.Article.Base.RESTapi.DTO;

import ssd.AbstractClasses.Base.RESTapi.DTO.BaseEntityPostDTO;
import ssd.Entities.Article.Analytics.RESTapi.DTO.ArticleAnalyticsPostDTO;

public class ArticlePostDTO extends BaseEntityPostDTO<ArticleAnalyticsPostDTO> {
    private Long authorId;
    private Long publisherId;
    private Long topicId;
    private Long ownerId;
    private Long newspaperId;
    private String content;

    // Getters and Setters

    // Additional fields or methods specific to Article can be added here
}

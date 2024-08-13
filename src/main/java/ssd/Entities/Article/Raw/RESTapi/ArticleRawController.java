package ssd.Entities.Article.Raw.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.AbstractClasses.Raw.RESTapi.EntityRawController;
import ssd.Entities.Article.Raw.ArticleRaw;
import ssd.Entities.Article.Raw.ArticleRawRepository;
import ssd.Entities.Article.Raw.RESTapi.DTO.ArticleRawGetDTO;

@RestController
@RequestMapping("/article-raws")
public class ArticleRawController extends EntityRawController<ArticleRaw, ArticleRawRepository, ArticleRawGetDTO, ArticleRawMapper> {

    public ArticleRawController(ArticleRawRepository repository, ArticleRawMapper mapper) {
        super(repository, mapper);
    }
}

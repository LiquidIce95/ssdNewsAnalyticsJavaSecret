package ssd.Entities.Article.Base.RESTapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssd.Entities.Article.Base.Article;
import ssd.Entities.Article.Base.ArticleRepository;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticleGetDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticlePostDTO;
import ssd.Entities.Article.Base.RESTapi.DTO.ArticlePutDTO;
import ssd.AbstractClasses.Base.RESTapi.BaseEntityController;

@RestController
@RequestMapping("/articles")
public class ArticleController extends BaseEntityController<Article, ArticleRepository, ArticleGetDTO, ArticlePostDTO, ArticlePutDTO, ArticleMapper> {

    public ArticleController(ArticleRepository repository, ArticleMapper mapper) {
        super(repository, mapper);
    }
}

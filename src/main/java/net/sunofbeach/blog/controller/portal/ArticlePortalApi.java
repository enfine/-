package net.sunofbeach.blog.controller.portal;

import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal/article")
public class ArticlePortalApi {

    @GetMapping("/list/{page}/{size}")
    public ResponseResult listArticle(@PathVariable("page") int page,
                                      @PathVariable("size") int size){
        return null;
    }

    @GetMapping("/list/{categoryId}/{page}/{size}")
    public ResponseResult listArticleByCategoryId(@PathVariable("categoryId") String categoryId,
                                      @PathVariable("page") int page,
                                      @PathVariable("size") int size){
        return null;
    }

    //文章细节
    @GetMapping("/{articleId}")
    public ResponseResult getArticleDetail(@PathVariable("articleId") String articleId){
        return null;
    }

    //获取推荐文章
    @GetMapping("/recommend/{articleId}")
    public ResponseResult getRecommendArticle(@PathVariable("articleId") String articleId){
        return null;
    }
}

package net.sunofbeach.blog.controller.portal;

import net.sunofbeach.blog.pojo.Comment;
import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portal/comment")
public class CommentPortalApi {
    @PostMapping
    public ResponseResult postComment(@RequestBody Comment comment){
        return null;
    }

    @DeleteMapping("/{commentId}")
    public ResponseResult deleteComment(@PathVariable("commentId") String imageId){
        return null;
    }

    @GetMapping("/list/{commentId}")
    public ResponseResult listComments(@PathVariable("articleId") String articleId){
        return null;
    }


}

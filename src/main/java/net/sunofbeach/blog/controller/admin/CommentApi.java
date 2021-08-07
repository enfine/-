package net.sunofbeach.blog.controller.admin;

import net.sunofbeach.blog.pojo.Comment;
import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

//增加，删除在前端可以实现 在portal包内
@RestController
@RequestMapping("/admin/comment")
public class CommentApi {


    @PutMapping("/{commentId}")
    public ResponseResult updateComment(@PathVariable("commentId") String imageId){
        return null;
    }


    @GetMapping("/list")
    public ResponseResult listComment(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }

    @PutMapping("/top/{commentId}")
    public ResponseResult topComment(@PathVariable("commentId") String commend){
        return null;
    }
}

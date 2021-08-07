package net.sunofbeach.blog.controller.portal;

import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal/search")
public class SearchPortalApi {
    @GetMapping
    public ResponseResult doSearch(@RequestParam("keyword") String keyword,
                                   @RequestParam("page") int page){
        return null;
    }
}

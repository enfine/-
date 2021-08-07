package net.sunofbeach.blog.controller.admin;

import net.sunofbeach.blog.pojo.FriendLink;
import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/friend_link")
public class FriendLinkApi {
    @PostMapping
    public ResponseResult addFriendsLink(@RequestBody FriendLink friendLink){
        return null;
    }

    @DeleteMapping("/{friendsLinkId}")
    public ResponseResult deleteFriendsLinke(@PathVariable("friendsLinkId") String imageId){
        return null;
    }

    @PutMapping("/{friendsLinkId}")
    public ResponseResult updateFriendsLink(@PathVariable("friendsLinkId") String imageId){
        return null;
    }

    @GetMapping("/{friendsLinkId}")
    public ResponseResult getFriendsLink(@PathVariable("friendsLinkId") String imageId){
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listFriendsLink(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }
}

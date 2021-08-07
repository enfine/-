package net.sunofbeach.blog.controller.admin;

import net.sunofbeach.blog.pojo.Looper;
import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/loop")
public class LooperApi {
    @PostMapping
    public ResponseResult addLoop(@RequestBody Looper looper){
        return null;
    }

    @DeleteMapping("/{loopId}")
    public ResponseResult deleteLooper(@PathVariable("loopId") String loopId){
        return null;
    }

    @PutMapping("/{loopId}")
    public ResponseResult updateLooper(@PathVariable("loopId") String loopId){
        return null;
    }

    @GetMapping("/{loopId}")
    public ResponseResult getLooper(@PathVariable("loopId") String loopId){
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listLoopers(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }
}

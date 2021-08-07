package net.sunofbeach.blog.controller.admin;

import net.sunofbeach.blog.pojo.Categories;
import net.sunofbeach.blog.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * 管理中心，分类的API
 */
@RestController
@RequestMapping("/admin/category")
public class CategoryAdminApi {
    /**
     * 添加分类
     *
     */
    @PostMapping
    public ResponseResult addCategory(@RequestBody Categories categories){
        return null;
    }
    /**
     * 添加分类
     *
     */
    @DeleteMapping("/{categoryId}")
    public ResponseResult deleteCategory(@PathVariable("categoryId") String categoryId){
        return null;
    }

    /**
     * 更新分类
     *
     */
    @PutMapping("/{categoryId}")
    public ResponseResult updataCategory(@PathVariable("categoryId") String categoryId,@RequestBody Categories categories){
        return null;
    }

    /**
     * 获取分类
     *
     */
    @GetMapping("/{categoryId}")
    public ResponseResult getCategory(@PathVariable("categoryId") String categoryId){
        return null;
    }

    /**
     * 获取分类列表
     *
     */
    @GetMapping("/list")
    public ResponseResult listCategory(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }

}

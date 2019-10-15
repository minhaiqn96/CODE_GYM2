package com.codegym.springboot.myspringcrud.controller;

import com.codegym.springboot.myspringcrud.entity.Blog;
import com.codegym.springboot.myspringcrud.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired private BlogService blogService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Blog> blogs = blogService.getAllBlog();
        model.addAttribute("blogs", blogs);
        return "index";
    }

    @RequestMapping(value = "add")
    public String addBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "addBlog";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editUser(@RequestParam("id") Long blogId, Model model) {
        Optional<Blog> blogEdit = blogService.findBlogById(blogId);
        blogEdit.ifPresent(blog -> model.addAttribute("blog", blog));
        return "editBlog";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Blog blog) {
        blogService.saveBlog(blog);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteBlog(@RequestParam("id") Long blogId, Model model) {
        blogService.deleteBlog(blogId);
        return "redirect:/";
    }
}
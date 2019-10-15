package com.codegym.springboot.myspringcrud.service;

import com.codegym.springboot.myspringcrud.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> getAllBlog();

    void saveBlog(Blog blog);

    void deleteBlog(Long id);

    Optional<Blog> findBlogById(Long id);
}
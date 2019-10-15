package com.codegym.springboot.myspringcrud.service.impl;

import com.codegym.springboot.myspringcrud.entity.Blog;
import com.codegym.springboot.myspringcrud.repository.BlogRepository;
import com.codegym.springboot.myspringcrud.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> getAllBlog() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Optional<Blog> findBlogById(Long id) {
        return blogRepository.findById(id);
    }
}
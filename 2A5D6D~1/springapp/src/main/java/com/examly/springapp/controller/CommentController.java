package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @GetMapping("/{id}")
    public String getCommentById(@PathVariable int id) {
        return "Comment id " + id;
    }
}

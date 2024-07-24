package com.codewithamar.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithamar.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}

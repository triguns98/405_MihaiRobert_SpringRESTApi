package com.robert_alexandru_mihai.friendlly.friendlly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robert_alexandru_mihai.friendlly.friendlly.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {} 

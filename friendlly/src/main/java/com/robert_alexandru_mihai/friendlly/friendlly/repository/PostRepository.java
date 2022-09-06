package com.robert_alexandru_mihai.friendlly.friendlly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robert_alexandru_mihai.friendlly.friendlly.models.Post;
import com.robert_alexandru_mihai.friendlly.friendlly.models.User;

public interface PostRepository extends JpaRepository<Post, Integer> {} 

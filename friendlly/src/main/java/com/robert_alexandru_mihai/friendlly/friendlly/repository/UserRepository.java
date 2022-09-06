package com.robert_alexandru_mihai.friendlly.friendlly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.robert_alexandru_mihai.friendlly.friendlly.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {} 

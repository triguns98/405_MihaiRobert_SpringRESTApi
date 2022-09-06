package com.robert_alexandru_mihai.friendlly.friendlly.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.Data;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private User author;

    @NotNull
    private Post post;

    @Min(0)
    private int likeCount;

    @Nullable
    @OneToMany
    private Set<Comment> subComments;
}

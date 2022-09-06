package com.robert_alexandru_mihai.friendlly.friendlly.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

import com.robert_alexandru_mihai.friendlly.friendlly.enums.PostType;

import lombok.Data;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private PostType postType;

    @NotNull
    private User author;

    @NotBlank
    @Size(min = 0, max = 100)
    private String title;

    @NotBlank
    @Size(min = 0, max = 255)
    private String description;

    @NotNull
    @Min(0)
    private int likeCount;

    @Nullable
    private List<User> mentions;
    
    @NotNull
    private Image image;
}

package com.robert_alexandru_mihai.friendlly.friendlly.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.Data;

@Data
@Entity
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @Min(0)
    private int likeCount;

    @Nullable
    private List<Post> posts;
}

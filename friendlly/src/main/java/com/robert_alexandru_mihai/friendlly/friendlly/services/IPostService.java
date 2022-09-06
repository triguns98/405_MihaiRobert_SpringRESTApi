package com.robert_alexandru_mihai.friendlly.friendlly.services;

import java.util.List;

import com.robert_alexandru_mihai.friendlly.friendlly.models.Post;

public interface IPostService {
    public List<Post> getPosts();
    public Post getPost(int id);
    public Post createPost(Post newUser);
    public Post updatePost(Post user);
    public void deletePost(int id);
}

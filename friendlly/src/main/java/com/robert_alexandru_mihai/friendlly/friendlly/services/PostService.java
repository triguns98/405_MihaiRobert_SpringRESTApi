package com.robert_alexandru_mihai.friendlly.friendlly.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.robert_alexandru_mihai.friendlly.friendlly.models.Post;
import com.robert_alexandru_mihai.friendlly.friendlly.repository.PostRepository;

@Service
public class PostService implements IPostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPost(int id) {
        return postRepository.getOne(id);
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        var dbPost = postRepository.getOne(post.getId());
        dbPost.setAuthor(post.getAuthor());
        dbPost.setDescription(post.getDescription());
        dbPost.setTitle(post.getTitle());

        return dbPost;
    }

    @Override
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }
    
}

package com.pawinc.myblog.service.impl;

import com.pawinc.myblog.model.Post;
import com.pawinc.myblog.repository.PostRepository;
import com.pawinc.myblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post create(Post post) {
        Assert.notNull(post, "Post cannot be empty");
        return postRepository.save(post);
    }

    @Override
    public Post readById(long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Post with id=" + id + " not found"));
    }

    @Override
    public Post update(Post post) {
        Assert.notNull(post, "Post cannot be empty");
        postRepository.findById(post.getId())
                .orElseThrow(() -> new EntityNotFoundException("Post not found"));
        return postRepository.save(post);
    }

    @Override
    public void delete(long id) {
        postRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Post with id=" + id + " not found"));
        postRepository.deleteById(id);
    }

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }
}

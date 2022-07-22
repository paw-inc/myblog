package com.pawinc.myblog.service.impl;

import com.pawinc.myblog.repository.PostCategoryRepository;
import com.pawinc.myblog.service.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostCategoryServiceImpl implements PostCategoryService {

    private PostCategoryRepository postCategoryRepository;

    @Autowired
    public PostCategoryServiceImpl(PostCategoryRepository postCategoryRepository) {
        this.postCategoryRepository = postCategoryRepository;
    }

}

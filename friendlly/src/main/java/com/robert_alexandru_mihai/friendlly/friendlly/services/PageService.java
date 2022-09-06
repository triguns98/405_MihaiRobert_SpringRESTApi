package com.robert_alexandru_mihai.friendlly.friendlly.services;

import org.springframework.stereotype.Service;

import com.robert_alexandru_mihai.friendlly.friendlly.repository.PageRepository;

@Service
public class PageService {
    private PageRepository pageRepository;

    public PageService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }


}

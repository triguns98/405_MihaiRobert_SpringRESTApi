package com.robert_alexandru_mihai.friendlly.friendlly.services;

import java.util.List;

import com.robert_alexandru_mihai.friendlly.friendlly.models.Page;

public interface IPageService {
    public List<Page> getPages();
    public Page getPage(int id);
    public Page createPage(Page page);
}

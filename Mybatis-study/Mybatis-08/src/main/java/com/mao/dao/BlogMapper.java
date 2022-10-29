package com.mao.dao;

import com.mao.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //新增一个博客
    int addBlog(Blog blog);

    //需求1
    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    //查询第1-2-3号记录的博客
    List<Blog> queryBlogForeach(Map map);
}

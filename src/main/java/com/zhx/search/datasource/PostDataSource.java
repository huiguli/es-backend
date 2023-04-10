package com.zhx.search.datasource;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhx.search.model.dto.post.PostQueryRequest;
import com.zhx.search.model.entity.Post;
import com.zhx.search.model.vo.PostVO;
import com.zhx.search.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子服务实现
 *
 */
@Service
@Slf4j
public class PostDataSource implements DataSource<PostVO> {

    @Resource
    private PostService postService;

    @Override
    public Page<PostVO> doSearch(String searchText, long pageNum, long pageSize) {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setSearchText(searchText);
        postQueryRequest.setCurrent(pageNum);
        postQueryRequest.setPageSize(pageSize);
//        获取请求对象
        ServletRequestAttributes servletRequestAttributes =  (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
//         直接从数据库中查找，用的是 %like%
//        Page<PostVO> postVOPage = postService.listPostVoPage(postQueryRequest, request);
//        return postVOPage;
//        将mysql中的数据传到es后，可进行分词查找，更能搜出内容
//        再这之前需先建立post索引（表），指定分词器等，后在Java中实现对es数据的增删改查
//        可自定义查询DSL:如：searchFromEs方法（postServicelImpl中）
//        yml中：打开9200配置，启动es(elasticsearch.bat)
        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
        return postService.getPostVOPage(postPage, request);
    }
}





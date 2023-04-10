package com.zhx.search.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;

@Component
public class VideoDataSource implements DataSource<Object> {

//    扩展示例--video
    @Override
    public Page<Object> doSearch(String searchText, long pageNum, long pageSize) {
        return null;
    }
}

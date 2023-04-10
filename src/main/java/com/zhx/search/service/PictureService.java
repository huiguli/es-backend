package com.zhx.search.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhx.search.model.entity.Picture;
import org.springframework.stereotype.Service;


/**
 * 帖子服务
 *
 */
public interface PictureService {
    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}

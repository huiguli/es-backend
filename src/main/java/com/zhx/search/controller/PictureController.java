package com.zhx.search.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhx.search.common.BaseResponse;
import com.zhx.search.common.ErrorCode;
import com.zhx.search.common.ResultUtils;
import com.zhx.search.exception.ThrowUtils;
import com.zhx.search.model.dto.picture.PictureQueryRequest;
import com.zhx.search.model.entity.Picture;
import com.zhx.search.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private PictureService pictureService;
    @PostMapping("/list/page/vo")
    public BaseResponse<Page<Picture>> searchPictureVOByPage(@RequestBody PictureQueryRequest pictureQueryRequest,
                                                             HttpServletRequest request) {
        long current = pictureQueryRequest.getCurrent();
        long size = pictureQueryRequest.getPageSize();
        String searchText = pictureQueryRequest.getSearchText();
        // 限制爬虫
        ThrowUtils.throwIf(size > 20, ErrorCode.PARAMS_ERROR);
        Page<Picture> picturePage = pictureService.searchPicture(searchText, current, size);
        return ResultUtils.success(picturePage);
    }
}

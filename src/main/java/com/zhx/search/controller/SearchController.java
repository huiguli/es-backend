package com.zhx.search.controller;

import com.zhx.search.common.BaseResponse;
import com.zhx.search.common.ResultUtils;
import com.zhx.search.manager.SearchFacade;
import com.zhx.search.model.dto.search.SearchRequest;
import com.zhx.search.model.vo.SearchVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * 聚合搜索接口
 *
 * @author Admin
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    /**
     * 抽象出来的门面模式：SearchFacade
     */
    @Resource
    private SearchFacade searchFacade;
    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
            return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
        }
    }

package com.zhx.search.model.dto.search;

import com.zhx.search.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * @author Admin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;
    /**
     * 搜索类型
     */
    private String type;
    private static final long serialVersionUID = 1L;
}
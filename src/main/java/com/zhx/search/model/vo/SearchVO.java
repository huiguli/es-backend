package com.zhx.search.model.vo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhx.search.model.entity.Picture;
import com.zhx.search.model.entity.Post;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 聚合搜索
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class SearchVO implements Serializable {

    private List<UserVO> userList;
    private List<PostVO> postList;
    private List<Picture> pictureList;

    private List<?> dataList;
    private static final long serialVersionUID = 1L;
}

package com.zhx.search.esdao;

import com.zhx.search.model.dto.post.PostEsDTO;
import java.util.List;

import javafx.geometry.Pos;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);

    List<PostEsDTO> findByTitle(String title);
}
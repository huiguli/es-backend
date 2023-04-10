package com.zhx.search.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 照片
 * @author broccoli
 */
@Data
public class Picture implements Serializable {
    private String url;
    private String title;
    private static final long serialVersionUID = 1L;
}

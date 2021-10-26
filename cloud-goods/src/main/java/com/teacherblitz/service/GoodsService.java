package com.teacherblitz.service;

import com.teacherblitz.entity.dto.GoodsDTO;

import java.util.List;

/**
 * 商品模块 服务
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
public interface GoodsService {

    /**
     * 获取商品列表
     * @return  商品列表DTO
     */
    List<GoodsDTO> getGoodsList();
}

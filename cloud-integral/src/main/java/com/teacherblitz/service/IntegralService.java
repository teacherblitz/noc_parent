package com.teacherblitz.service;

import com.teacherblitz.entity.dto.GoodsDTO;

import java.util.List;

/**
 * 积分服务接口
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
public interface IntegralService {

    /**
     * 添加积分分润
     * @param orderNo   订单号
     * @return          success/error
     */
    String addOrderProfit(String orderNo);

    /**
     * 获取商品列表
     * @return  商品列表DTO
     */
    List<GoodsDTO> getGoodsList();
}

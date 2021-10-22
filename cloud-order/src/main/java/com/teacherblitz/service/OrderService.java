package com.teacherblitz.service;

import com.teacherblitz.entity.dto.OrderDTO;
import com.teacherblitz.entity.vo.OrderVO;

/**
 * 订单服务接口
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
public interface OrderService {

    /**
     * 订单详情
     * @param orderVO   订单查询VO
     * @return          订单详情DTO
     */
    OrderDTO getOrderDetail(OrderVO orderVO);
}

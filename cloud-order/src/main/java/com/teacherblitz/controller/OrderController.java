package com.teacherblitz.controller;

import com.teacherblitz.entity.dto.OrderDTO;
import com.teacherblitz.entity.vo.OrderVO;
import com.teacherblitz.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单控制器
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    /**
     * 订单详情
     * @param orderVO   订单查询VO
     * @return          订单详情DTO
     */
    @PostMapping("/getOrderDetail")
    public OrderDTO getOrderDetail (@RequestBody OrderVO orderVO) {
       return orderService.getOrderDetail(orderVO);
    }
}

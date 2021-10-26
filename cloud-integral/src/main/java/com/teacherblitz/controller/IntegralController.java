package com.teacherblitz.controller;

import com.teacherblitz.entity.dto.GoodsDTO;
import com.teacherblitz.service.IntegralService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 积分控制器
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@RestController
@RequestMapping("/integral")
@RequiredArgsConstructor
public class IntegralController {

    private final IntegralService integralService;

    /**
     * 订单完成时，添加积分分润
     * @param orderNo   订单号
     * @return          success/error
     */
    @GetMapping("/addOrderProfit/{orderNo}")
    public String addOrderProfit (@PathVariable("orderNo") String orderNo) {
        return integralService.addOrderProfit(orderNo);
    }

    /**
     * 获取商品列表
     * @return  商品列表DTO
     */
    @GetMapping("/getGoodsList")
    public List<GoodsDTO> getGoodsList() {
        return integralService.getGoodsList();
    }
}

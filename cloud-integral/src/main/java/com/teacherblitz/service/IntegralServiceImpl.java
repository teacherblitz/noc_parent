package com.teacherblitz.service;

import com.alibaba.fastjson.JSON;
import com.teacherblitz.entity.dto.OrderDTO;
import com.teacherblitz.entity.vo.OrderVO;
import com.teacherblitz.feignclient.OrderFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 积分服务接口实现
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class IntegralServiceImpl implements IntegralService {

    private final OrderFeignClient orderFeignClient;

    @Override
    public String addOrderProfit(String orderNo) {
        if (StringUtils.isBlank(orderNo)) {
            log.info("订单号为空，本次积分分润结束。");
            return "error";
        }
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderNo(orderNo);
        OrderDTO orderDTO = orderFeignClient.getOrderDetail(orderVO);
        log.info("订单号：{}，返回详情：{}", orderNo, JSON.toJSONString(orderDTO));
        return "success";
    }
}

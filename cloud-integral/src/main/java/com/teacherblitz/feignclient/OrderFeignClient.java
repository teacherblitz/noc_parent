package com.teacherblitz.feignclient;

import com.teacherblitz.entity.dto.OrderDTO;
import com.teacherblitz.entity.vo.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 订单服务调用
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@FeignClient(value = "cloud-order")
public interface OrderFeignClient {

    String BASE_PATH = "/cloud-order";

    /**
     * 查询订单详情
     * @param orderVO   订单查询VO
     * @return          订单详情DTO
     */
    @PostMapping( BASE_PATH + "/order/getOrderDetail")
    OrderDTO getOrderDetail(OrderVO orderVO);
}

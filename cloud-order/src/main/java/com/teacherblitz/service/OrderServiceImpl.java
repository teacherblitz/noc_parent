package com.teacherblitz.service;

import com.teacherblitz.entity.dto.OrderDTO;
import com.teacherblitz.entity.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 订单服务接口实现
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderDTO getOrderDetail(OrderVO orderVO) {
        OrderDTO orderDTO = new OrderDTO();
        LocalDateTime localDateTime = LocalDateTime.now();
        orderDTO.setOrderNo(localDateTime.format(DateTimeFormatter.ofPattern("YYYYmmdd")));
        orderDTO.setAmount(new BigDecimal("5380"));
        orderDTO.setCreateTime(localDateTime);
        return orderDTO;
    }
}

package com.teacherblitz.entity.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单查询DTO
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@Data
public class OrderDTO implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;


    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}

package com.teacherblitz.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单查询VO
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/9/29
 */
@Data
public class OrderVO implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;

}

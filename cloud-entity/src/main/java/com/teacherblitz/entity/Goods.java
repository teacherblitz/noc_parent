package com.teacherblitz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 商品 实体
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {

    /**
     * 商品ID
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格(元)
     */
    private BigDecimal goodsPrice;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}

package com.teacherblitz.entity.dto;

import com.teacherblitz.entity.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 商品列表DTO
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GoodsDTO implements Serializable {

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

    public GoodsDTO(Goods goods) {
        BeanUtils.copyProperties(goods, this);
    }
}

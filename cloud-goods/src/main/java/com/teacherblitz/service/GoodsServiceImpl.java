package com.teacherblitz.service;

import com.teacherblitz.entity.Goods;
import com.teacherblitz.entity.dto.GoodsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品模块 服务实现
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {

    @Override
    public List<GoodsDTO> getGoodsList() {
        List<Goods> goods = this.buildGoods();
        return goods.stream().map(GoodsDTO::new).collect(Collectors.toList());
    }

    /**
     * 构建商品列表数据
     * @return 商品列表实体
     */
    public List<Goods> buildGoods() {
        log.info("开始构建商品列表数据》》》》");
        Goods goods = new Goods(1, "苹果", new BigDecimal("5.98"), LocalDateTime.now());
        Goods goods2 = new Goods(2, "香蕉", new BigDecimal("3.98"), LocalDateTime.now());
        Goods goods3 = new Goods(3, "葡萄", new BigDecimal("15.98"), LocalDateTime.now());
        return Arrays.asList(goods, goods2, goods3);
    }
}

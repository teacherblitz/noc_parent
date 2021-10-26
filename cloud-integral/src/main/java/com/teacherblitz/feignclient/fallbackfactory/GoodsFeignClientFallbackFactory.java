package com.teacherblitz.feignclient.fallbackfactory;

import com.teacherblitz.entity.dto.GoodsDTO;
import com.teacherblitz.feignclient.GoodsFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * 商品服务降级容错工厂
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
@Slf4j
@Component
public class GoodsFeignClientFallbackFactory implements FallbackFactory<GoodsFeignClient> {

    @Override
    public GoodsFeignClient create(Throwable cause) {
        log.error("商品服务出现问题，错误信息：{}", cause.getMessage());
        return new GoodsFeignClient() {
            @Override
            public List<GoodsDTO> getGoodsList() {
                GoodsDTO goodsDTO = new GoodsDTO(0, "错误商品", new BigDecimal("0.00"), LocalDateTime.now());
                return Arrays.asList(goodsDTO);
            }

            @Override
            public String index() {
                return null;
            }
        };
    }
}

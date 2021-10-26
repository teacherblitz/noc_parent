package com.teacherblitz.feignclient;

import com.teacherblitz.constant.ServiceNameConstants;
import com.teacherblitz.entity.dto.GoodsDTO;
import com.teacherblitz.feignclient.fallbackfactory.GoodsFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 商品服务调用
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
@FeignClient(contextId = "goodsFeignClient",
        name = ServiceNameConstants.CLOUD_GOODS,
        fallbackFactory = GoodsFeignClientFallbackFactory.class,
        path = "/" + ServiceNameConstants.CLOUD_GOODS)
@RequestMapping("/goods")
public interface GoodsFeignClient {

    /**
     * 获取商品列表
     * @return  商品列表DTO
     */
    @RequestMapping("/getGoodsList")
    List<GoodsDTO> getGoodsList();

    /**
     * 测试方法
     * @return
     */
    @PostMapping("index")
    String index();
}

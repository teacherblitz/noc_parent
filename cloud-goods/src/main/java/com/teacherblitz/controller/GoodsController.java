package com.teacherblitz.controller;

import com.teacherblitz.entity.dto.GoodsDTO;
import com.teacherblitz.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品模块 控制器
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">Teacher</a>
 * @since: 2021/10/26
 */
@RestController
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodsController {

    private final GoodsService goodsService;

    /**
     * 获取商品列表
     * @return 商品列表DTO
     */
    @RequestMapping("/getGoodsList")
    public List<GoodsDTO> getGoodsList() {
        return goodsService.getGoodsList();
    }
}

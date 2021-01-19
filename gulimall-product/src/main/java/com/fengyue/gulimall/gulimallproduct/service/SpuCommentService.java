package com.fengyue.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengyue.common.utils.PageUtils;
import com.fengyue.gulimall.gulimallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-19 23:50:58
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


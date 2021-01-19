package com.fengyue.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengyue.common.utils.PageUtils;
import com.fengyue.gulimall.gulimallproduct.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-19 23:50:58
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


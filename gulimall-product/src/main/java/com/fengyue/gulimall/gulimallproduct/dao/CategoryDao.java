package com.fengyue.gulimall.gulimallproduct.dao;

import com.fengyue.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-19 23:50:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

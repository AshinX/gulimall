package com.fengyue.gulimall.gulimallproduct.service.impl;

import com.fengyue.common.utils.PageUtils;
import com.fengyue.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.fengyue.gulimall.gulimallproduct.dao.CategoryDao;
import com.fengyue.gulimall.gulimallproduct.entity.CategoryEntity;
import com.fengyue.gulimall.gulimallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

}
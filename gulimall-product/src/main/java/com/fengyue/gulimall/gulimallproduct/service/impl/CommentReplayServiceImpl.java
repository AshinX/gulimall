package com.fengyue.gulimall.gulimallproduct.service.impl;

import com.fengyue.common.utils.PageUtils;
import com.fengyue.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.fengyue.gulimall.gulimallproduct.dao.CommentReplayDao;
import com.fengyue.gulimall.gulimallproduct.entity.CommentReplayEntity;
import com.fengyue.gulimall.gulimallproduct.service.CommentReplayService;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}
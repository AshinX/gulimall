package com.fengyue.gulimall.gulimallorder.dao;

import com.fengyue.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-20 22:55:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

package com.fengyue.gulimall.gulimallmember.dao;

import com.fengyue.gulimall.gulimallmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-20 22:47:27
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}

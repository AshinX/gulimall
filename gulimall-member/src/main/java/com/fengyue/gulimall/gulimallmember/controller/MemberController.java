package com.fengyue.gulimall.gulimallmember.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.fengyue.gulimall.gulimallmember.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengyue.gulimall.gulimallmember.entity.MemberEntity;
import com.fengyue.gulimall.gulimallmember.service.MemberService;
import com.fengyue.common.utils.PageUtils;
import com.fengyue.common.utils.R;



/**
 * 会员
 *
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-20 22:47:27
 */
@RestController
@RequestMapping("gulimallmember/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @RequestMapping("/mycoupon")
    public R myCoupon(){
        MemberEntity entity = new MemberEntity();
        entity.setNickname("张三");
        Object mycoupon = couponFeignService.getCoupon().get("mycoupon");
        return R.ok().put("entity",entity).put("mycoupon",mycoupon);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("gulimallmember:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("gulimallmember:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("gulimallmember:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("gulimallmember:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("gulimallmember:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

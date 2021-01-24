package com.fengyue.gulimall.gulimallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengyue.gulimall.gulimallcoupon.entity.CouponEntity;
import com.fengyue.gulimall.gulimallcoupon.service.CouponService;
import com.fengyue.common.utils.PageUtils;
import com.fengyue.common.utils.R;



/**
 * 优惠券信息
 *
 * @author fengyue
 * @email 1339148474@qq.com
 * @date 2021-01-20 22:38:46
 */
@RestController
@RefreshScope
@RequestMapping("/gulimallcoupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.username}")
    private String username;

    @Value("${coupon.age}")
    private Integer age;

    @RequestMapping("/getValue")
    public R getValue(){
        return R.ok().put("username",username).put("age",age);
    }


    @RequestMapping("/getCoupon")
    public R getCoupon(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满1000减100");
        couponEntity.setId(1l);
        return R.ok().put("mycoupon",couponEntity);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("gulimallcoupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("gulimallcoupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("gulimallcoupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("gulimallcoupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("gulimallcoupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

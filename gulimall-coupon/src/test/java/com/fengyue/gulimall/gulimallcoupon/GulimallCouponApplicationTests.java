package com.fengyue.gulimall.gulimallcoupon;

import com.fengyue.gulimall.gulimallcoupon.entity.SpuBoundsEntity;
import com.fengyue.gulimall.gulimallcoupon.service.SpuBoundsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

	@Autowired
	SpuBoundsService spuBoundsService;
	@Test
	void contextLoads() {
		SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
		spuBoundsEntity.setId(1l);
		spuBoundsEntity.setWork(23);
		spuBoundsService.save(spuBoundsEntity);
	}

}

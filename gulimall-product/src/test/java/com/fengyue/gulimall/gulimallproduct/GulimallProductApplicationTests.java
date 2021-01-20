package com.fengyue.gulimall.gulimallproduct;

import com.fengyue.gulimall.gulimallproduct.entity.BrandEntity;
import com.fengyue.gulimall.gulimallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1l);
		brandEntity.setName("huawei");

		brandService.save(brandEntity);
	}

}

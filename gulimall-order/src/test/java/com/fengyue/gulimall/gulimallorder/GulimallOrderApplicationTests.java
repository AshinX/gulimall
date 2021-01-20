package com.fengyue.gulimall.gulimallorder;

import com.fengyue.gulimall.gulimallorder.entity.OrderOperateHistoryEntity;
import com.fengyue.gulimall.gulimallorder.service.OrderOperateHistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {

	@Autowired
	OrderOperateHistoryService orderOperateHistoryService;

	@Test
	void contextLoads() {


		OrderOperateHistoryEntity orderOperateHistoryEntity = new OrderOperateHistoryEntity();

		orderOperateHistoryEntity.setId(1l);
		orderOperateHistoryEntity.setNote("note");
		orderOperateHistoryService.save(orderOperateHistoryEntity);
	}

}

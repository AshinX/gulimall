package com.fengyue.gulimall.gulimallmember;

import com.fengyue.gulimall.gulimallmember.entity.IntegrationChangeHistoryEntity;
import com.fengyue.gulimall.gulimallmember.service.IntegrationChangeHistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

	@Autowired
	IntegrationChangeHistoryService integrationChangeHistoryService;

	@Test
	void contextLoads() {

		IntegrationChangeHistoryEntity integrationChangeHistoryEntity = new IntegrationChangeHistoryEntity();
		integrationChangeHistoryEntity.setChangeCount(1);
		integrationChangeHistoryEntity.setId(1l);

		integrationChangeHistoryService.save(integrationChangeHistoryEntity);
	}

}

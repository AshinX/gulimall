package com.fengyue.gulimall.gulimallware;

import com.fengyue.gulimall.gulimallware.entity.PurchaseEntity;
import com.fengyue.gulimall.gulimallware.entity.UndoLogEntity;
import com.fengyue.gulimall.gulimallware.service.PurchaseService;
import com.fengyue.gulimall.gulimallware.service.UndoLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    PurchaseService purchaseService;

    @Autowired
    UndoLogService undoLogService;

    @Test
    void contextLoads() {
        UndoLogEntity logEntity = new UndoLogEntity();

        logEntity.setId(1l);
        logEntity.setRollbackInfo("eqweqwe".getBytes());
        logEntity.setBranchId(1231l);
        logEntity.setContext("123312312");
        logEntity.setExt("ext");
        logEntity.setLogCreated(new Date());
        logEntity.setLogModified(new Date());
        logEntity.setLogStatus(3);
        logEntity.setXid("34562137812730912");

        undoLogService.save(logEntity);
    }

}

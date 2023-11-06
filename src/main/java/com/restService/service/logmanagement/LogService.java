package com.restService.service.logmanagement;

import com.restService.model.base.logmanagement.LogEntity;
import com.restService.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;

@Service
public class LogService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveSuccessLog(LogEntity logEntity, byte[] result) {
        logEntity.setResultStatus("SUCCESS");
        logEntity.setResult(result);
        logEntity.setResponseTime(DateUtils.format(new Date(), "yyyyMMdd:HHmmssss"));
        entityManager.persist(logEntity);
    }

    @Transactional
    public void saveFailureLog(LogEntity logEntity, byte[] result) {
        logEntity.setResultStatus("FAILURE");
        logEntity.setResult(result);
        logEntity.setResponseTime(DateUtils.format(new Date(), "yyyyMMdd:HHmmssss"));
        entityManager.persist(logEntity);
    }
}

package com.zdzc.util.dynamicDataSource;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Order(-1)// 保证该AOP在@Transactional之前执行
@Component
public class DynamicDataSourceAspect {

    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Pointcut("execution(* com.zdzc.dao..*.*(..))")
    public void anyMethod(){};

    @Before("anyMethod() && args(param)")
    public void changeDataSource1(JoinPoint point, Map<String, Object> param) throws Throwable {
        String dsId = param != null ? param.get("dbName") + "":null;
        if (!DynamicDataSourceContextHolder.containsDataSource(dsId)) {
            logger.error("数据源[{}]不存在，使用默认数据源 > { }", dsId, point.getSignature());
        } else {
            logger.debug("Use DataSource : {} > {}", dsId, point.getSignature());
            DynamicDataSourceContextHolder.setDataSourceType(dsId);
        }
    }

    @Before("@annotation(ds)")
    public void changeDataSource1(JoinPoint point, TargetDataSource ds) throws Throwable {
        String dsId = ds.name();
        if (!DynamicDataSourceContextHolder.containsDataSource(dsId)) {
            logger.error("数据源[{}]不存在，使用默认数据源 > {}", ds.name(), point.getSignature());
        } else {
            logger.debug("Use DataSource : {} > {}", ds.name(), point.getSignature());
            DynamicDataSourceContextHolder.setDataSourceType(ds.name());
        }
    }

    @After("anyMethod() && args(param)")
    public void restoreDataSource(JoinPoint point, Map<String, Object> param) {
        logger.debug("Revert DataSource : {} > {}", param.get("dbName"), point.getSignature());
        DynamicDataSourceContextHolder.clearDataSourceType();
    }

}

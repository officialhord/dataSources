package com.learning.datasources.config.routing;


import com.learning.datasources.config.db.RoutingDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DatabaseRouterAspect {

    @Around("@annotation(withDatabase)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, WithDatabase withDatabase) throws Throwable {
        try {
            RoutingDataSource.setCtx(withDatabase.value());
            return proceedingJoinPoint.proceed();
        } finally {

            RoutingDataSource.restoreCtx();
        }
    }
}

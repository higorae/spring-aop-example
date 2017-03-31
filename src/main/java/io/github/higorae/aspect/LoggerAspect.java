package io.github.higorae.aspect;

import io.github.higorae.service.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

	@Before("execution(* io.github.higorae..*(..))")
    public void callBeforeMethodExecution(JoinPoint joinPoint){
        Logger.log(joinPoint.getSignature().getDeclaringTypeName());
    }
}

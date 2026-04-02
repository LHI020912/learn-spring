package com.spiring_aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//공동기능 메소드 포함 (proxy 해당)
@Aspect
public class PerformaceAspect {
	// where: @Pointcut("expression")
	@Pointcut("within(com.sping_aop.annotation.*)")
	public void pointcutMethod() {
		
	}
	
	// when: advice 시점(point-cut ref가 필요)
	@Around("pointcutMethod()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		Signature s = joinPoint.getSignature();
		String methodName = s.getName(); // 핵심기능 메소드 이름
	
		System.out.println("------------------------------------");
		System.out.println("[Log]Before: "+methodName+"(): 실행시작");
		System.out.println("------------------------------------");
		
		long startTime = System.nanoTime();
		
		Object result=null;
		
		try {
			result = joinPoint.proceed(); // 핵심기능 수행
		}catch(Exception e) {
			System.out.println("[Log]Exception: "+methodName);
		}
		
		long endTime = System.nanoTime();

		System.out.println("------------------------------------");
		System.out.println("[Log]After: "+methodName+"(): 실행 종료");
		System.out.println("[Log]: "+methodName+"(): 실행시간"+(endTime-startTime)+"ns");
		System.out.println("------------------------------------");
		
		return result;
	}
}

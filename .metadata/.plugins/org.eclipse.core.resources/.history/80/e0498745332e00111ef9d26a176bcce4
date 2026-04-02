package com.spiring_aop.xml2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

// 공통기능
public class PerformanceAspect {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s= joinPoint.getSignature();
		String methodName = s.getName();
	
		System.out.println("------------------------------------");
		System.out.println("[Log]Before: "+methodName+"(): 실행 시작");
		// 시작시간
		long curLong = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd:HH:mm:ss.SSS");
		String curTime = sdf.format(new Date(curLong));
		System.out.println("[Log]Before: "+curTime+" : 실행 시작 시간");
		System.out.println("------------------------------------");
		
		long startTime = System.nanoTime();
		
		Object result=null;
		
		try {
			result = joinPoint.proceed();
		}catch(Exception e) {
			System.out.println("[Log]Exception: "+methodName);
		}

		curLong = System.currentTimeMillis();
		curTime = sdf.format(new Date(curLong));
		long endTime = System.nanoTime();

		System.out.println("------------------------------------");
		System.out.println("[Log]After: "+methodName+"(): 실행 종료");
		System.out.println("[Log]After: "+curTime+" : 실행 종료 시간");
		System.out.println("[Log]: "+methodName+"(): 실행시간"+(endTime-startTime)+"ns");
		System.out.println("------------------------------------");
		
		return result;
	}
}

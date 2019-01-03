package com.example.spring.aop.appExampleSpringAOP.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectContactService {

	@Around("execution(* com.example.spring.aop.appExampleSpringAOP.service.*.*(..))")
	public Object verificaContactService(ProceedingJoinPoint _pProceedingJoinPoint) throws Throwable {
		System.out.println(" ************* Inicio verificaContactService ***************");
		Object resultado = _pProceedingJoinPoint.proceed();
		
		System.out.println(resultado);
		System.out.println("class : " + _pProceedingJoinPoint.getTarget().getClass());
		System.out.println("metodo : " + _pProceedingJoinPoint.getSignature().getName());
		
		
		System.out.println(" ************* Fin verificaContactService ***************");
		return resultado;
	} 
}

package ec.edu.espol.adapter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public aspect PagoAspect {
	//Pointcut para pagar en USD
	@Pointcut("execution(* ec.edu.espol.adapter.AdaptadorCajaRegistradora.pagoEnUSD(..))")
	public void pagarEnUSD() {}
	
	@Before("pagarEnUSD()")
	public void antesDePagarUSD(JoinPoint joinPoint) {
	System.out.println("Se está usando el dolar para pagar: " + joinPoint.getSignature());
	}
	
	@After("pagarEnUSD()")
	public void despuesDePagarUSD(JoinPoint joinPoint) {
	System.out.println("Se procesó el pago en dolares: " + joinPoint.getSignature());
	}
	
	//Pointcut para pagar en EUR
	@Pointcut("execution(* ec.edu.espol.adapter.AdaptadorCajaRegistradora.pagoEnEUR(..))")
	public void pagarEnEUR() {}
		
	@Before("pagarEnEUR()")
	public void antesDePagarEUR(JoinPoint joinPoint) {
	System.out.println("Se está usando el euro para pagar: " + joinPoint.getSignature());
	}
		
	@After("pagarEnEUR()")
	public void despuesDePagarEUR(JoinPoint joinPoint) {
	System.out.println("Se procesó el pago en euro: " + joinPoint.getSignature());
	}
	
	//Pointcut para pagar en Btc
	@Pointcut("execution(* ec.edu.espol.adapter.AdaptadorCajaRegistradora.pagoEnBtc(..))")
	public void pagarEnBtc() {}
			
	@Before("pagarEnBtc()")
	public void antesDePagarBtc(JoinPoint joinPoint) {
	System.out.println("Se está usando bitcoin para pagar: " + joinPoint.getSignature());
	}
			
	@After("pagarEnBtc()")
	public void despuesDePagarBtc(JoinPoint joinPoint) {
	System.out.println("Se procesó el pago en bitcoin: " + joinPoint.getSignature());
	}
		
		
	
	
}

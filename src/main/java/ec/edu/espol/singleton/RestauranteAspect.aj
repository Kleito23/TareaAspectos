package ec.edu.espol.singleton;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class RestauranteAspect {
// Pointcut para obtener la instancia del Chef
@Pointcut("execution(* ec.edu.espol.singleton.Chef.getInstance(..))")
public void obtenerChef() {}

// Advice que se ejecuta antes de obtener el Chef
@Before("obtenerChef()")
public void antesDeObtenerChef(JoinPoint joinPoint) {
System.out.println("Se está obteniendo la instancia del Chef: " + joinPoint.getSignature());
}

// Pointcut para presentar ingredientes
@Pointcut("execution(* ec.edu.espol.singleton.AyudanteDeCocina.presentarIngredientes(..))")
public void presentarIngredientesMethod() {}

// Advice que se ejecuta antes de presentar ingredientes
@Before("presentarIngredientesMethod()")
public void antesDePresentarIngredientes(JoinPoint joinPoint) {
System.out.println("El ayudante está a punto de presentar los ingredientes: " + joinPoint.getSignature());
}

// Advice que se ejecuta después de cambiar el nombre del Chef
@After("execution(* ec.edu.espol.singleton.Chef.setNombre(..))")
public void despuesDeCambiarNombre(JoinPoint joinPoint) {
System.out.println("El nombre del Chef ha sido cambiado: " + joinPoint.getSignature());
}
}
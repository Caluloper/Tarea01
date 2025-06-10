package modelo;

import org.aspectj.lang.annotation.Aspect;
import java.awt.Color;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {

	@After("execution(* Ventana.setColor(java.awt.Color)) && args(color)")
    public void logAfterColorChange(Color color) {
        System.out.println("El color de fondo de la ventana ha cambiado a: " + color.toString());
    }
}
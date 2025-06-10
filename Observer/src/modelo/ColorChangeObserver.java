package modelo;

import java.awt.Color;

public class ColorChangeObserver implements Observer {
	@Override
    public void update(Color color) {
        System.out.println("El color de la ventana ha cambiado a: " + color);
    }
}

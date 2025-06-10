package modelo;

public class Main {
	
	public static void main(String[] args) {
		 Ventana ventana = new Ventana();
	
	    Observer observer1 = new ColorChangeObserver();
	
	    ventana.addObserver(observer1);
	
	    ventana.setVisible(true);
	    }
	}

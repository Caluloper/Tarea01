package modelo;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Ventana extends JFrame {
	private JPanel panel;
	private JButton botonRojo, botonVerde, botonAzul;
	private List<Observer> observers = new ArrayList<>();
	private Color color;
	
	public Ventana() {
		setTitle("Cambiar Color");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		botonRojo = new JButton("Rojo");
		botonVerde = new JButton("Verde");
		botonAzul = new JButton("Azul");
		
		
		panel.add(botonRojo);
		panel.add(botonVerde);
		panel.add(botonAzul);
		
		botonRojo.addActionListener(e -> {
			setColor(Color.RED);
		});
		
		botonVerde.addActionListener(e -> {
			setColor(Color.GREEN);
		});
		
		botonAzul.addActionListener(e -> {
			setColor(Color.BLUE);
		});
		
		add(panel);
	}
	
	private void setColor(Color color) {
        panel.setBackground(color);
        this.color = color;
        notifyObservers();
    }
	
	public void addObserver(Observer observer) {
        observers.add(observer);
    }
	
	public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
	
	private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(color);
        }
    }
}
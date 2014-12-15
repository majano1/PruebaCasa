package controlador;

import modelo.Bombilla;

public class Principal {

	public static void main(String[] args) {
		Bombilla nuevaBombilla=new Bombilla("encendida");
		
		System.out.println(nuevaBombilla.getEncendidooapagado());
		
		nuevaBombilla.setEncendidooapagado("apagada");
		
		System.out.println(nuevaBombilla.getEncendidooapagado());
	}

}

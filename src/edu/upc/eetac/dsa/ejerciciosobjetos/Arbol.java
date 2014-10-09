package edu.upc.eetac.dsa.ejerciciosobjetos;

public class Arbol {
	int altura;
	int edad;
	String nombre;

	Arbol(int altura) {

		this.altura = altura;

		System.out.println("Un arbol de " + altura + " metros");

	}

	Arbol(String nombre) {
		this.nombre = nombre;
		System.out.println("Un " + nombre);
	}

	Arbol() {
		System.out.println("Un arbol genérico");
	}

	Arbol(int altura, String nombre) {
		this.altura = altura;
		this.nombre = nombre;
		System.out.println("Un " + nombre + " de " + altura + " metros");
	}
	
}

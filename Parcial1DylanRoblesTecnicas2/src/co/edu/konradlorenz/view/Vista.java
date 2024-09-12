package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
Scanner sc = new Scanner(System.in);
	
	public String pedirString(String mensaje) {
		System.out.println(mensaje);
		
		return sc.next();
	}
	public int pedirInt(String mensaje) {
		System.out.println(mensaje);
		
		return sc.nextInt();
	}
	
	public void mostrarString(String mensaje) {
		
		System.out.println(mensaje);
	}
	public boolean pedirvalor(String mensaje) {
		System.out.println(mensaje);
		return sc.nextBoolean();
	}
	
	

}

package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Jugador;
import co.edu.konradlorenz.model.ListaJugadores;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	
	
	Jugador objJu = new Jugador();
	Vista  objVi = new Vista();
	ListaJugadores objLi = new ListaJugadores();
	
	public void run() {
		int opcion = objVi.pedirInt("indique el menu al que quiere entrar");
		do {
		switch(opcion) {
		
		
		case 1:
			
			crearJugador();
			
			
			run();
			
			
			break;
			
		case 2:
			
			agregarLista();
			run();
			
			break;
			
		case 3:
			
			mostrarLista();
			run();
			
			break;
			
		case 4:
                    
                    mostrarJugador();
                    run();
		
		break;
                
                case 5:
                    mostrarCopas();
                    run();
                    break;
                    
                default:
                    objVi.mostrarString("el programa ha terminado");
                    break;
		}
		
		
		}while(opcion != 6);
		
	}
	
	public void crearJugador() {
		
		objJu.setNombre(objVi.pedirString("Ingrese el nombre del jugador"));
		objJu.setEstado(objVi.pedirString("Ingrese si el jugador se encuentra Activo o Retirado"));

		
		
		
		if(objJu.getEstado().equals("Retirado")) {
			objJu.setAnnoRetiro(objVi.pedirString("ingrese el año de retiro del jugador"));
			
			
		
		}else if(objJu.getEstado().equals("Activo")){
			objJu.setAnnoRetiro(null);
			
		}
		objJu.setBalonOro(objVi.pedirString("ingrese si el jugador a conseguido balones de oro"));
		
		
		objJu.setPosicion(objVi.pedirInt("ingrese la posicion del jugador"));
		objJu.setClub(objVi.pedirString("ingrese ultimo club al que el jugador pertenecio"));
		
		objVi.mostrarString(objJu.toString());
		
		
	}
	
	public void agregarLista() {
            
            
		objLi.agregarJugador(objJu);
                
		
	}
	
	public void mostrarLista() {
		if(objLi.getListaJugadores().isEmpty()) {
			objVi.mostrarString("la lista esta vacia");
		}else {
		objLi.mostrarLista();
		}
		
	}
	
	public void mostrarCopas() {
		
		objLi.mostrarCopas();
		
		
		
	}
        
        public void mostrarJugador(){
            int posicion = objVi.pedirInt("ingrese la posicion de la lista que quiere ver");
            objLi.mostrarJugador(posicion);
            
            
        }
	



}
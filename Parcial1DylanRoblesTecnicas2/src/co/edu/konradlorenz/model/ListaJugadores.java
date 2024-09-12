package co.edu.konradlorenz.model;

import java.util.ArrayList;

import co.edu.konradlorenz.view.Vista;

public class ListaJugadores {
	
	private ArrayList<Jugador> listaJugadores = new ArrayList<>();
	
	Jugador objJu = new Jugador();
	
	Vista objVi = new Vista();

	
	
	

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}




	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}




	public void agregarJugador(Jugador jugador) {
		
		
	listaJugadores.add(jugador);
		
		
	}
	
	public void mostrarLista() {
		
		for(int i = 0; i<listaJugadores.size(); i++ ) {
			
			objVi.mostrarString("posicion en la lista "+ i);
			objVi.mostrarString(""+listaJugadores.get(i));
			
			
		}
	
	
	}
	
	public void mostrarCopas() {
		int contador= 0;
		for(int i= 0; i<listaJugadores.size(); i++) {
			
			if(listaJugadores.get(i).getBalonOro().equals("si")) {
				
				contador++;
			}
			
			
			
			
			
			
			
			
		}
		objVi.mostrarString("el total de balones de oro es "+ contador);
		
		
		
	}
        public void mostrarJugador(int posicion){
            objVi.mostrarString(listaJugadores.get(posicion).toString());
            
        }
        
}
	
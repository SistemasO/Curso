package edu.uptc.hilos.logic;

import java.util.ArrayList;

public class Esperas {

	private ArrayList<Cliente> clientes;
	
	public Esperas() {
		
		clientes = new ArrayList<>();
		
	}
	
	public void add(Cliente cliente ){
			
		clientes.add(cliente);
		
		
	}
	
	
	public void delete(int e){
		
		for (int i = 0; i < clientes.size(); i++) {

			if(clientes.get(i).getEspera()== e){
				
				clientes.remove(i);
				
			}
		}
	}
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
}

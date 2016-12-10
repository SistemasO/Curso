package edu.uptc.hilos.logic;

public class Cliente {

	private int espera;
	private long id_Cliente;
	
	
	
	public int getEspera() {
		return espera;
	}

	public void setEspera(int espera) {
		this.espera = espera;
	}

	public long getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(long id_Cliente) {
		this.id_Cliente = id_Cliente;
	}



	@Override
	public String toString() {
		return "Cliente [espera=" + espera + ", id_Cliente=" + id_Cliente + "]";
	}



	public Cliente(int espera, long id_Cliente) {
		super();
		this.espera = espera;
		this.id_Cliente = id_Cliente;
	}
	
	
	
}

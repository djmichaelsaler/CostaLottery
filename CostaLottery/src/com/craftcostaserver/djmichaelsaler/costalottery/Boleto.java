package com.craftcostaserver.djmichaelsaler.costalottery;

import java.util.ArrayList;

public class Boleto {
	
	private String player;
	private int sorteo;
	private ArrayList<Integer> apuesta;
	
	public Boleto (int sorteo, String player,ArrayList<Integer> apuesta){
		this.sorteo=sorteo;
		this.player=player;
		this.apuesta=apuesta;
	}
	
	public ArrayList<Integer> getApuesta(){
		return this.apuesta;
	}

	public String getPlayer(){
		return this.player;
	}
	
	public boolean isBoletoPremiado(ArrayList<Integer> combgana, int sorteo){
		return apuesta.containsAll(combgana) && sorteo==this.sorteo;
	}
	
	public Boleto getBoleto(){
		return this;
	}
}

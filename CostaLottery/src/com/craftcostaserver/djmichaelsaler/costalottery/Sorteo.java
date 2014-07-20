package com.craftcostaserver.djmichaelsaler.costalottery;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class Sorteo {
	private HashMap<Player, Boleto> participantes;
	private int numeroid;
	private Boleto combganadora;
	private int bote;
	//private int numfinal;
	//private int numbolas;
	public Sorteo (int numeroid, int bote){
		this.numeroid = numeroid;
		this.bote = bote;
	}
	
	
	

}

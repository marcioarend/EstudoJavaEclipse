package com.marcio.estudo.dostatic;

public class Bicicleta {

	public static String nome;
	public static Integer contador = new  Integer(0);
	
	private String estado;
	
	public String global;
	
	public Bicicleta() {
		this.contador ++;
	}
	public Bicicleta(String nome){
		System.out.println(nome);
	}
	
	public void setEstado(){
		
	}
	
	
	public static Integer converPolegadasEmCM(Integer p){
		return p*2;
	}
	public void setGlobal(String a){
		
		this.global = a;
	}
	
	
	
	
}

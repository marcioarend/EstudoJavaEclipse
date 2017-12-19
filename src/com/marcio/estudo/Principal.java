package com.marcio.estudo;

public class Principal {

	static final int IDADE = 5;
	
	public static void main(String[] args){
		final Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		p.setNome("Palomita");
		System.out.println(p.getNome());
		System.out.println(p);
		System.out.println(p2);
		p2=p;
		System.out.println(p2);
		p2.setNome("Marcio");
		System.out.println(p.getNome());
		troca(p);
		System.out.println(p.getNome());
		
		
		
		
		/**
		 * se vc tentar alterar a referencia do 
		 * objeto vc tem um erro de compilacao
		 * 
			p=p2;
		 *  
		 *  
		 *  Isso tbm vai dar errro
		 *  IDADE = 5;
		 */
		
	}
	
	public static void troca(Pessoa p){
		p.setNome("Sanha");
	
	}
}

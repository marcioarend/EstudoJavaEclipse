package com.marcio.estudo;

public class Principal {

	static final int IDADE = 5;
	
	public static void main(String[] a){
		final Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		p.setNome("Palomita");
		System.out.println(p.getNome());
		/**
		 * se vc tentar alterar a referencia do 
		 * objeto vc tem um erro de compilacao
		 * 
		 *  p=p2;
		 *  
		 *  
		 *  Isso tbm vai dar errro
		 *  IDADE = 5;
		 */
		
	}
}

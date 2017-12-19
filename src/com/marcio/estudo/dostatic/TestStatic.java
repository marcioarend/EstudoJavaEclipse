package com.marcio.estudo.dostatic;

public class TestStatic {
	
	private static String nome;

	public static void main(String[] args) {
		nome = "marcio";
		Bicicleta b1 = new Bicicleta();
		Bicicleta b2 = new Bicicleta();
		b1.nome = "Caloi";
		b1.global= "Vermelha";
		b2.nome = "Monark";
		b2.global = "azul";
		System.out.println(b1.nome + "  " + b2.nome);
		System.out.println(b1.global + "  " + b2.global);
		System.out.println(Bicicleta.converPolegadasEmCM(2));
		
		Math.random();
	}

}

package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		carro1.nome = "Ford";
		carro1.modelo = "Fusion";
		carro1.ano = 2021;

		carro2.nome = "Chevrolet";
		carro2.modelo = "Camaro";
		carro2.ano = 2022;
		
		carro1 = carro2;

		System.out.println("Carro 1:");
		System.out.println("Nome: " + carro1.nome);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Ano: " + carro1.ano);

		System.out.println("--------------------------------------");

		System.out.println("Carro 2:");
		System.out.println("Nome: " + carro2.nome);
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Ano: " + carro2.ano);

	}

}

package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {

	public static void main(String[]args) {
		String[] nomes = new String[4];
	
		nomes[0] = "Enzo";
		nomes[1] = "Jo�o";
		nomes[2] = "Pedro";
		nomes[3] = "Maria";
		
		
		
		for (int i = 0; i <= nomes.length; i++) {
		System.out.println("Posi��o "+(i+1)+":"+ nomes[i]);
			
		}
	
	}
}

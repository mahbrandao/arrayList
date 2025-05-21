package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Atividade1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random(); // nomes de variáveis não podem estar iguais

		for (int i = 0; i < 10; i++) { // for utiliza-se p percorrer (mostrar)
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio); // carregando o valor
		}
		System.out.println(numeros);

		numeros.remove(3);

		System.out.println(numeros);
	}

}

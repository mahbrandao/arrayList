package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Atividade3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i <= 6; i++) {
			int numeroAleatorio = random.nextInt(-10, 10);
			numeros.add(numeroAleatorio);
		}
		System.out.println(numeros);

		for (int numero : numeros) {
			if (numero >= 0) {
				System.out.println(numero);
			}
		}

	}
}

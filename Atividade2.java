package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Atividade2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}
		System.out.println(numeros);

		for (int numero : numeros) {
			numero *= 2;
			System.out.println(numero);
		}

	}
}

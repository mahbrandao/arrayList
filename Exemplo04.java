package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Exemplo04 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		Random random = new Random();// construção de objeto, chama-se a classse e a nomeia

		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}

		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}

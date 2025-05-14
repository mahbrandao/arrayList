package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Atividade1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}
		numeros.remove(4);

		System.out.println(numeros);
	}

}

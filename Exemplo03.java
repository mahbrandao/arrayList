package arraylist;

import java.util.ArrayList;

public class Exemplo03 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(10);
		numeros.add(20);

		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));

		numeros.set(1, 25);
		System.out.println(numeros.get(1));

		numeros.remove(0);
		System.out.println(numeros.get(0));

		System.out.println(numeros.size());

	}

}

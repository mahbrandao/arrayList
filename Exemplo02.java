package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo02 {

	public static void main(String[] args) {
		String[] disciplinas = { "matemática", "filosofia", "história", "física" };
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("língua inglesa");

		for (String i : novaLista) { // for each
			System.out.println("Disciplina : " + i);
		}
	}

}

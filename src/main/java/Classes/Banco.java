package Classes;

import java.util.ArrayList;

public class Banco {
	private static ArrayList<String> lista = new ArrayList<>();
	
	static {
		Banco.lista.add("cachorro");
		Banco.lista.add("animal");
	}	
	
	public void adiciona(String palavra) {
		Banco.lista.add(palavra);
	}
	
	public ArrayList<String> getPalavras(){
		return Banco.lista;
	}
}
 
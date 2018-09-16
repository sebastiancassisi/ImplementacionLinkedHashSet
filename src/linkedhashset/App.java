package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet No permite repetidos, ordena de forma que se van agregando valores a la coleccion

public class App {

	public static void main(String[] args) {
		
		
Set<Persona> lista = new LinkedHashSet<>();
		
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(3, "ssss", 77));
		lista.add(new Persona(4, "hhhh", 88));
		lista.add(new Persona(5, "lllll", 44));
		
		for (Persona string : lista) {
			System.out.println(string);
		}
		
	}

}

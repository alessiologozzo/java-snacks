//SNACK 6
//Consegna: 
//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//
//Possibile usare solo :
//
//cicli
//chartAt
//if / switch
//Es. “25” come stringa deve essere convertito in intero 25.

package org.lessons.java.snacks;

import java.util.Scanner;

import org.lessons.java.utils.InputInterface;

public class Snack6 {

	public static void run(Scanner scanner) {
		int x = InputInterface.getInt(scanner,
				System.lineSeparator() + "SNACK 6" + System.lineSeparator() + "Inserisci un numero");

		System.out.println("Il numero che hai inserito è " + x);
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

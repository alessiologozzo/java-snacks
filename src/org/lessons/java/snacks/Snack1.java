//SNACK 1
//Consegna:
//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

package org.lessons.java.snacks;

import java.util.Scanner;

import org.lessons.java.utils.InputInterface;

public class Snack1 {

	public static void run(Scanner scanner) {
		int x = InputInterface.getInt(scanner,
				System.lineSeparator() + "SNACK 1" + System.lineSeparator() + "Inserisci un numero");

		if (x % 2 == 0)
			System.out.println("Il numero che hai inserito è pari.");
		else
			System.out.println("Il numero che hai inserito è dispari. " + (x + 1) + " però è pari!");

		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

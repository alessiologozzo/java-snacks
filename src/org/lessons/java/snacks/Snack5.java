//SNSACK 5
//Consegna:
//Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//Continuare a chiedere una nuova stringa finchè non si inserisce 0.

package org.lessons.java.snacks;

import java.util.Scanner;

import org.lessons.java.utils.InputInterface;

public class Snack5 {

	public static void run(Scanner scanner) {
		boolean exit = false;
		String s = "";
		int lettersCount = 0, numbersCount = 0, SymbolsCount = 0;

		while (!exit) {
			s = InputInterface.getString(scanner, System.lineSeparator() + "SNACK 5" + System.lineSeparator()
					+ "Inserisci una stringa. Digita 0 per tornare al menu' principale");

			if (s.length() == 1 && s.charAt(0) == '0')
				exit = true;
			else
				for (int i = 0; i < s.length(); i++)
					if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
						lettersCount++;
					else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
						numbersCount++;
					else
						SymbolsCount++;

			System.out.println("Lettere: " + lettersCount + System.lineSeparator() + "Numeri: " + numbersCount
					+ System.lineSeparator() + "Simboli: " + SymbolsCount);
		}

		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

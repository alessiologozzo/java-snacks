//SNACK 9
//Consegna:
//Chiedere all'utente numeri interi e calcolarene la somma. Continuare a chiedere numeri, finche' la sommatoria non supera il valore 1000

package org.lessons.java.snacks;

import java.util.Scanner;

import org.lessons.java.utils.InputInterface;

public class Snack9 {

	public static void run(Scanner scanner) {
		int x = 0, sum = 0;

		while (sum <= 1000) {
			x = InputInterface.getInt(scanner, 1, 999_999,
					"Inserisci un numero intero. Lo snack terminerà quando la somma dei numeri da te inseriti supererà 1000 "
							+ "(Somma attuale: " + sum + ")");
			sum += x;
		}

		System.out.println("La somma finale dei tuoi numeri è: " + sum + ".");
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

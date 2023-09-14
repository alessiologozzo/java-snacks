//SNACK 7
//Consegna:
//Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

package org.lessons.java.snacks;

import java.util.Scanner;

import org.lessons.java.utils.InputInterface;

public class Snack7 {

	public static void run(Scanner scanner) {
		int second = 0, minute = 0, hour = 0;
		int x = InputInterface.getInt(scanner, 1,
				System.lineSeparator() + "SNACK 7" + System.lineSeparator() + "Inserisci il numero dei secondi");
		String result = "";

		hour = x / 3600;
		minute = (x % 3600) / 60;
		second = ((x % 3600) % 60);

		result = String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":"
				+ String.format("%02d", second);

		System.out.println("La stringa generata è la seguente (hh:mm:ss): " + result);
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

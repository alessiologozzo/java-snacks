//SNACK 3
//Consegna:
//Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari

package org.lessons.java.snacks;

import java.util.Random;
import java.util.Scanner;

public class Snack3 {

	public static void run(Scanner scanner) {
		Random random = new Random();
		final int DIM = random.nextInt(5) + 6;
		int[] array = new int[DIM];
		int x = 0, sum = 0;

		System.out.println(
				System.lineSeparator() + "SNACK 3" + System.lineSeparator() + "Questo è l'array generato per te: ");

		for (int i = 0; i < DIM; i++) {
			x = random.nextInt(999) + 1;
			array[i] = x;
			if (i % 2 != 0)
				sum += array[i];

			System.out.println(i + ") " + array[i]);
		}

		System.out.println("La somma di tutti gli elementi che sono in posizione dispari è: " + sum + ".");
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

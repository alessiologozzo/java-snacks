//SNACK 8
//Consegna:
//Creare un array di 10 interi randomici compresi tra 100 e 150. Stampare tutti i valori contenuti nell'array (dopo averli inseriti). Stampare inoltre il valore minimo, massimo e la media

package org.lessons.java.snacks;

import java.util.Random;
import java.util.Scanner;

public class Snack8 {

	public static void run(Scanner scanner) {
		Random random = new Random();
		int[] array = new int[10];
		int min = 200, max = 0, sum = 0;

		System.out.println("Ecco il tuo array:");

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50) + 101;

			if (array[i] < min)
				min = array[i];

			if (array[i] > max)
				max = array[i];

			sum += array[i];

			System.out.println((i + 1) + ") " + array[i]);
		}

		System.out.println("Il valore minimo presente nell'array è " + min + ", quello massimo è " + max
				+ ". La media dei valori è " + String.format("%.2f", (float) sum / 10) + ".");
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

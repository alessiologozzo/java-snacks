//SNACK 10
//Consegna:
//Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
//tutti gli elementi pari
//tutti gli elementi dispari
//tutti gli elementi in indice pari
//tutti gli elementi in indice dispari

package org.lessons.java.snacks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snack10 {

	public static void run(Scanner scanner) {
		Random random = new Random();
		int[] array = new int[10];
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>(), oddNumbers = new ArrayList<Integer>(),
				evenIndexes = new ArrayList<Integer>(), oddIndexes = new ArrayList<Integer>();

		System.out.println("Ecco il tuo array:");

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(901) + 100;

			if (array[i] % 2 == 0)
				evenNumbers.add(array[i]);
			else
				oddNumbers.add(array[i]);

			if (i % 2 == 0)
				evenIndexes.add(array[i]);
			else
				oddIndexes.add(array[i]);

			System.out.println(i + ") " + array[i]);
		}

		System.out.println("Gli elementi pari sono i seguenti: " + evenNumbers.toString() + System.lineSeparator()
				+ "Gli elementi dispari sono i seguenti: " + oddNumbers.toString() + System.lineSeparator()
				+ "Gli elementi con indice pari sono i seguenti: " + evenIndexes.toString() + System.lineSeparator()
				+ "Gli elementi con indice dispari sono i seguenti: " + oddIndexes.toString());
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

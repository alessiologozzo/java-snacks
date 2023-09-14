//SNACK 2
//Consegna:
//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

package org.lessons.java.snacks;

import java.util.Random;
import java.util.Scanner;

public class Snack2 {

	public static void run(Scanner scanner) {
		String[] names = { "Mario", "Franco", "Antonio", "Valerio", "Achille", "Gennaro", "Marco", "Loredana",
				"Jessica", "Claudia", "Bianca", "Laura", "Angelina", "Beatrice" };
		String[] surnames = { "Rossi", "Bianchi", "Alberici", "Albertini", "Bartoletti", "Basilone", "Cusmano",
				"D'Agosta", "Poccia", "Radice", "Salmeri", "Salzano" };
		Random random = new Random();
		int randomNameIndex = random.nextInt(14);
		int randomSurnameIndex = random.nextInt(12);

		System.out.println(
				System.lineSeparator() + "SNACK 2" + System.lineSeparator() + "Il nome casuale generato per te è: "
						+ names[randomNameIndex] + " " + surnames[randomSurnameIndex] + ".");
		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());

	}
}

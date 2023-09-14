package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.snacks.Snack1;
import org.lessons.java.snacks.Snack2;
import org.lessons.java.snacks.Snack3;
import org.lessons.java.snacks.Snack4;
import org.lessons.java.snacks.Snack5;
import org.lessons.java.snacks.Snack6;
import org.lessons.java.snacks.Snack7;
import org.lessons.java.utils.InputInterface;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		do {
			choice = InputInterface.getInt(scanner, 0, 7,
					"MENU' PRINCIPALE\nScegli uno snack da eseguire:\n1) Snack 1 - Pari e Dispari\n2) Snack 2 - Generatore di nomi\n3) Snack 3 - Somma array\n4) Snack 4 - Palindroma\n5) Snack 5 - Composizione stringa\n6) Snack 6 - Da string a int\n7) Snack 7 - Convertitore secondi\n0) Esci");

			switch (choice) {
			case 1:
				Snack1.run(scanner);
				break;

			case 2:
				Snack2.run(scanner);
				break;

			case 3:
				Snack3.run(scanner);
				break;

			case 4:
				Snack4.run(scanner);
				break;

			case 5:
				Snack5.run(scanner);
				break;

			case 6:
				Snack6.run(scanner);
				break;

			case 7:
				Snack7.run(scanner);
				break;
			}
		} while (choice > 0);

		System.out.println(System.lineSeparator() + "Arrivederci!");
		scanner.close();
	}

}

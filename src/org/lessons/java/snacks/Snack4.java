//SNACK 4
//Consegna:
//Data in input una stringa verificare se è palindroma

package org.lessons.java.snacks;

import java.util.Scanner;

import org.lessons.java.utils.InputInterface;

public class Snack4 {

	public static void run(Scanner scanner) {
		boolean isPalindrome = true;
		String s = InputInterface.getString(scanner, 2,
				System.lineSeparator() + "SNACK 4" + System.lineSeparator() + "Inserisci una stringa");

		for (int i = 0; i < s.length() / 2 && isPalindrome; i++)
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				isPalindrome = false;

		if (isPalindrome)
			System.out.println("La stringa che hai inserito è paldindroma");
		else
			System.out.println("La stringa che hai inserito non è palindroma");

		System.out.println("Torno al menu' principale..." + System.lineSeparator() + System.lineSeparator());
	}
}

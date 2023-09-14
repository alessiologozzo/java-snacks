package org.lessons.java.utils;

import java.util.Scanner;

public class InputInterface {

	public static int getInt(Scanner scanner, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				inputSuccess = true;
				
			} catch (NumberFormatException e) {
				System.out.println("Errore! Devi inserire un numero intero valido. Riprova");
			}
		}

		return x;
	}
	
	public static int getInt(Scanner scanner, int min, int max, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				if (x < min)
					System.out.println("Errore! Devi inserire un numero maggiore di " + (min - 1) + ". Riprova");
				else if (x > max)
					System.out.println("Errore! Devi inserire un numero minore di  " + (max + 1) + ". Riprova");
				else
					inputSuccess = true;
			} catch (NumberFormatException e) {
				System.out.println("Errore! Devi inserire un numero intero. Riprova");
			}
		}

		return x;
	}
	
	public static int getInt(Scanner scanner, int min, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				if (x < min)
					System.out.println("Errore! Devi inserire un numero maggiore di " + (min - 1) + ". Riprova");
				else
					inputSuccess = true;
			} catch (NumberFormatException e) {
				System.out.println("Errore! Devi inserire un numero intero. Riprova");
			}
		}

		return x;
	}
	
	public static String getString(Scanner scanner, int max, String requestMessage) {
		String s = "";
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {

			s = scanner.nextLine();

			if (s.length() < max)
				System.out.println("Errore! Devi inserire almeno " + max + " caratteri. Riprova");
			else
				inputSuccess = true;

		}

		return s;
	}
	
	public static String getString(Scanner scanner, String requestMessage) {
		String s = "";
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {

			s = scanner.nextLine();

			if (s.isBlank())
				System.out.println("Errore! Devi inserire una stringa valida. Riprova");
			else
				inputSuccess = true;

		}

		return s;
	}
	
	public static String getStringNumber(Scanner scanner, String requestMessage) {
		String s = null;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {

			s = scanner.nextLine();

			try {
				Integer.parseInt(s);
				
				inputSuccess = true;
			} catch (Exception e) {
				System.out.println("Errore! Devi inserire un numero intero. Riprova");
			}

		}

		return s;
	}
}

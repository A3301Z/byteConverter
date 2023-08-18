package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ByteConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Шаблон для ввода: from 1024 to [kb, mb, gb]");
		String command = sc.nextLine();
		System.out.println(byteConverter(command));
	}

	public static String byteConverter(String line) {
		String[] split = line.split(" ");
		String convertTo = split[3];
		double from = Double.parseDouble(split[1]);
		String formatted = "";
		if (convertTo.equalsIgnoreCase("kb")) {
			formatted = ((int) from) + "Б = " + new DecimalFormat("#0.00").format(from / 1024) + "КБ";
		} else if (convertTo.equalsIgnoreCase("mb")) {
			formatted = ((int) from) + "Б = " + new DecimalFormat("#0.00").format(from / 1024 / 1024) + "МБ";
		} else if (convertTo.equalsIgnoreCase("gb")) {
			formatted = ((int) from) + "Б = " + new DecimalFormat("#0.000").format(from / 1024 / 1024 / 1024) + "ГБ";
		}
		return formatted;
	}
}
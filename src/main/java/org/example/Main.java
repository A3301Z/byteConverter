package org.example;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		System.out.println(byteConverter(44124, "KB"));
	}

	public static String byteConverter(double from, String convertTo) {
		String formatted = "";
		if (convertTo.equalsIgnoreCase("kb")) {
			formatted = ((int) from) + "Б = " + new DecimalFormat("#0.000").format(from / 1000) + "КБ";

		} else if (convertTo.equalsIgnoreCase("mb")) {
			formatted = ((int) from) + "Б = " + new DecimalFormat("#0.000").format(from / 1000 / 1000) + "МБ";

		} else if (convertTo.equalsIgnoreCase("gb")) {
			formatted = ((int) from) + "Б = " + new DecimalFormat("#0.000").format(from / 1000 / 1000 / 1000) + "ГБ";
		}
		return formatted;
	}
}
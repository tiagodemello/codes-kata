package br.com.tiagodemello.kata;

public class OrdinalNumberConverter {

	public static String numberToOrdinal(int number) {
		if (number == 0) {
			return "0";
		}
		return number + retreiveOrdinalIndicator(number);
	}

	private static String retreiveOrdinalIndicator(int number) {
		if (endsWithTeenNumber(number)) {
			return "th";
		}
		
		int lastDigit = number % 10;
		switch (lastDigit) {
			case 1:
				return "st";
			case 2:
				return "nd";
			case 3:
				return "rd";
			default:
				return "th";
		}
	}

	private static boolean endsWithTeenNumber(int number) {
		int lastTwoDigit = number % 100;
		return lastTwoDigit > 10 && lastTwoDigit < 20;
	}

}

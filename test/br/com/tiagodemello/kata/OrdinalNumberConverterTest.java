package br.com.tiagodemello.kata;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class OrdinalNumberConverterTest {

	@Test
	public void shouldHandleSingleDigits() {
		assertEquals("1st", OrdinalNumberConverter.numberToOrdinal(1));
		assertEquals("2nd", OrdinalNumberConverter.numberToOrdinal(2));
		assertEquals("3rd", OrdinalNumberConverter.numberToOrdinal(3));
		assertEquals("4th", OrdinalNumberConverter.numberToOrdinal(4));
		assertEquals("5th", OrdinalNumberConverter.numberToOrdinal(5));
		assertEquals("6th", OrdinalNumberConverter.numberToOrdinal(6));
		assertEquals("7th", OrdinalNumberConverter.numberToOrdinal(7));
		assertEquals("8th", OrdinalNumberConverter.numberToOrdinal(8));
		assertEquals("9th", OrdinalNumberConverter.numberToOrdinal(9));
		assertEquals("10th", OrdinalNumberConverter.numberToOrdinal(10));
	}
	
	@Test
	public void shouldHandleTeensNumbers() {
		assertEquals("11th", OrdinalNumberConverter.numberToOrdinal(11));
		assertEquals("12th", OrdinalNumberConverter.numberToOrdinal(12));
		assertEquals("13th", OrdinalNumberConverter.numberToOrdinal(13));
		assertEquals("14th", OrdinalNumberConverter.numberToOrdinal(14));
		assertEquals("15th", OrdinalNumberConverter.numberToOrdinal(15));
		assertEquals("16th", OrdinalNumberConverter.numberToOrdinal(16));
		assertEquals("17th", OrdinalNumberConverter.numberToOrdinal(17));
		assertEquals("18th", OrdinalNumberConverter.numberToOrdinal(18));
		assertEquals("19th", OrdinalNumberConverter.numberToOrdinal(19));
		
		assertEquals("111th", OrdinalNumberConverter.numberToOrdinal(111));
		assertEquals("112th", OrdinalNumberConverter.numberToOrdinal(112));
		assertEquals("113th", OrdinalNumberConverter.numberToOrdinal(113));
		assertEquals("114th", OrdinalNumberConverter.numberToOrdinal(114));
		assertEquals("115th", OrdinalNumberConverter.numberToOrdinal(115));
		assertEquals("116th", OrdinalNumberConverter.numberToOrdinal(116));
		assertEquals("117th", OrdinalNumberConverter.numberToOrdinal(117));
		assertEquals("118th", OrdinalNumberConverter.numberToOrdinal(118));
		assertEquals("119th", OrdinalNumberConverter.numberToOrdinal(119));
	}
	
	@Test
	public void shouldHandleMultipleDigits() {
		assertEquals("21st", OrdinalNumberConverter.numberToOrdinal(21));
		assertEquals("202nd", OrdinalNumberConverter.numberToOrdinal(202));
		assertEquals("403rd", OrdinalNumberConverter.numberToOrdinal(403));
		assertEquals("1254th", OrdinalNumberConverter.numberToOrdinal(1254));
		assertEquals("995th", OrdinalNumberConverter.numberToOrdinal(995));
		assertEquals("76th", OrdinalNumberConverter.numberToOrdinal(76));
		assertEquals("987th", OrdinalNumberConverter.numberToOrdinal(987));
		assertEquals("108th", OrdinalNumberConverter.numberToOrdinal(108));
		assertEquals("909th", OrdinalNumberConverter.numberToOrdinal(909));
		assertEquals("200th", OrdinalNumberConverter.numberToOrdinal(200));
	}
	
	@Test
	public void shouldHandleTheBoundariesNumber() {
		assertEquals("0", OrdinalNumberConverter.numberToOrdinal(0));
		assertEquals("10000th", OrdinalNumberConverter.numberToOrdinal(10000));
	}
	
}

package iut.tdd;

import org.junit.Assert;

import org.junit.Test;


public class RomanNumeralsTest {

	@Test
	public void should_return_XL_when_40 () {		
		//Given
		String input = "40";
		String expected = "XL"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_XXX_when_30 () {		
		//Given
		String input = "30";
		String expected = "XXX"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_XX_when_20 () {		
		//Given
		String input = "20";
		String expected = "XX"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_XV_when_15 () {		
		//Given
		String input = "15";
		String expected = "XV"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_X_when_10 () {		
		//Given
		String input = "10";
		String expected = "X"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_IX_when_9 () {		
		//Given
		String input = "9";
		String expected = "IX"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_VIII_when_8 () {		
		//Given
		String input = "8";
		String expected = "VIII"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_VII_when_7 () {		
		//Given
		String input = "7";
		String expected = "VII"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_VI_when_6 () {		
		//Given
		String input = "6";
		String expected = "VI"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_V_when_5 () {		
		//Given
		String input = "5";
		String expected = "V"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_IV_when_4 () {		
		//Given
		String input = "4";
		String expected = "IV"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_II_when_2 () {		
		//Given
		String input = "2";
		String expected = "II"; 
		testConvertToRoman(input, expected);
	}
	@Test
	public void should_return_I_when_1 () {
		//Given
		testConvertToRoman("1", "I");
	}

	private void testConvertToRoman(String input, String expected) {
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}

}

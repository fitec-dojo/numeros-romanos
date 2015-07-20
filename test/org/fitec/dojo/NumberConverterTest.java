package org.fitec.dojo;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class NumberConverterTest {

	@Test
	public void testOneToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(1);
		
		Assert.assertEquals("I", roman);
	}
	
	@Test
	public void testFiveToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(5);
		
		Assert.assertEquals("V", roman);
	}

	@Test
	public void testTenToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(10);
		
		Assert.assertEquals("X", roman);
	}

	@Test
	public void testFiftyToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(50);
		
		Assert.assertEquals("L", roman);
	}

	@Test
	public void testHundredToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(100);
		
		Assert.assertEquals("C", roman);
	}

	@Test
	public void testFiveHundredToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(500);
		
		Assert.assertEquals("D", roman);
	}

	@Test
	public void testThousandToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(1000);
		
		Assert.assertEquals("M", roman);
	}

	
	
	@Test(expected=RuntimeException.class)
	public void testInvalidToRoman() 
	{
		NumberConverter converter = new NumberConverter();
		String roman = converter.decimalToRoman(-1);
	}
	
	@Test
	public void testItoDecimal(){
		NumberConverter converter = new NumberConverter();
		Integer roman = converter.getNumber("I");
		
		Assert.assertEquals(Integer.valueOf(1), roman);
	}
	
	@Test
	public void testVtoDecimal(){
		NumberConverter converter = new NumberConverter();
		Integer roman = converter.getNumber("V");
		
		Assert.assertEquals(Integer.valueOf(5), roman);
	}
	
	@Test
	public void testXtoDecimal(){
		NumberConverter converter = new NumberConverter();
		Integer roman = converter.getNumber("X");
		
		Assert.assertEquals(Integer.valueOf(10), roman);
	}
	
	@Test
	public void testIIItoDecimal(){
		NumberConverter converter = new NumberConverter();
		Integer roman = converter.getNumber("III");
		
		Assert.assertEquals(Integer.valueOf(3), roman);
	}

}

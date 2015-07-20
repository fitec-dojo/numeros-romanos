package org.fitec.dojo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberConverter {

	public String decimalToRoman(Integer i)  {
		if(dic.containsKey(i))
		{
			return dic.get(i);
		}
		
		throw new RuntimeException("Invalid number");
	}
	
	Map<Integer, String> dic = new HashMap<Integer, String>();
	
	
	public String getRoman(int pNumber) {
		
		return "";
	}

	public NumberConverter() {
	   dic.put(1, "I");
	   dic.put(5, "V");
	   dic.put(10, "X");
	   dic.put(50, "L");
	   dic.put(100, "C");
	   dic.put(500, "D");
	   dic.put(1000, "M");
	   
	}
	
	public Integer getNumber(String roman){
		Set<Integer> keySet = dic.keySet();
		
		Integer sum = 0;
		
		char[] charArray = roman.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {			
			for (Integer integer : keySet) {
				if (dic.get(integer).equals(charArray[i])) {
					sum += integer;
				}
			}
		}
		
		
		return sum;
				
	}
}

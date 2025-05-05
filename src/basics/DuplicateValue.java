package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateValue {

	public static void main(String[] args) {
		// input : hackerearth
		// o/p = h a r 


		String input = "hhackerearth";
		char[] inputChars = input.toCharArray();
		Map<Character, Integer> duplicateValues = new HashMap<Character, Integer>();
		
		for(char c: inputChars) {

			if(duplicateValues.get(c)==null) {
				duplicateValues.put(c, 1);
			}
			else {
				duplicateValues.put(c, duplicateValues.get(c)+1);
			}
			
		}
		
//		duplicateValues.forEach((key,value)->{	
//			if(value>1) {
//				System.out.println(key + ":"+ value);
//			}
//		});
		
		for(Map.Entry<Character, Integer> entry : duplicateValues.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}

	
	
}

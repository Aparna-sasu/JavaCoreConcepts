package stringconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringEquality {
	//
	//	Strings:
	//		1. Given two strings, first string is a sentence and the second string is a character. You need to write a
	//		function to print unique number of characters in between the occurrences of second-string excluding
	//		spaces. String1 = “I love java programming” String2 =”o” output: “vejavpr”

	//		2. Given input string= “ABCAABCAEBE” find which character is duplicated least number of times. o/p= ”E,
	//		C”

	//		3. Convert Uppercase to Lowercase in java without using built in method?

	//		4. String a="HeyDearHowareyou";
	//		String b="Howareyou";
	//		Write a code to find that string b is present in String
	//		a?

	//		5. Given an array of strings ={“hello”,”ello”}, replace all ll with aa without using inbuilt method.

	public static void main(String[] args) {

		Set<Character> s = getUniqueNumberOfCharacters("I love java programming",'o');
		System.out.println(s);

		List<Character> cg = getLeastNumberOfCharacters("AABCBCAEBE");
		System.out.println(cg);
		
		String upperCaseString = "HELLO";
		char[] newString = upperCaseString.toCharArray();
		// 'A' = 65 , a = 97
		
		List<Character> ls1 = new ArrayList<>();
		for(char val : newString)
		{
			ls1.add((char) (val+32));
	
		}		
	
	
		System.out.println(ls1);
	}




	private static List<Character> getLeastNumberOfCharacters(String inputString) {

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] ch1 = inputString.toCharArray();

		for(char cw : ch1) {
			map.put(cw, map.getOrDefault(cw, 0)+1);
		}

		int minDuplicateCount = Integer.MAX_VALUE;
		for(int countDup : map.values()) {
			if(countDup>1) {
				minDuplicateCount = Math.min(minDuplicateCount, countDup);
			}		
		}
		List<Character> key = getKeyValue(map,minDuplicateCount);
		return key;
	}



	private static List<Character> getKeyValue(Map<Character, Integer> map2, int minDuplicateCount) {

		List<Character> ls = new ArrayList<Character>();
		for(Map.Entry<Character,Integer> entry: map2.entrySet() ) {
			if(entry.getValue().equals(minDuplicateCount)) {
				ls.add(entry.getKey());
			}
		}
		return ls;
	}




	private static Set<Character> getUniqueNumberOfCharacters(String s, char c) {


		String s1 = s.substring(4, 14);
		System.out.println(s1);
		String s2 = s1.replaceAll(" ", ""); 
		char [] ch = s2.toCharArray();
		System.out.println(ch);

		Set<Character> set = new HashSet<Character>();

		for(char ches : ch) {
			//System.out.println(ches);
			set.add(ches);

		}

		return set;
	}


}

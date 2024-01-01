package collectionPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	    public static void main(String[] args) {
	        String s = "I am from am from Testyantra";
	        String result = removeDuplicates(s);
	        System.out.println("Original string: " + s);
	        System.out.println("String after removing duplicates: " + result);
	    }

	    public static String removeDuplicates(String str) {
	        LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
	        
	        for (char c : str.toCharArray()) {
	            charSet.add(c);
	        }

	        StringBuilder result = new StringBuilder();
	        for (Character c : charSet) {
	            result.append(c);
	        }

	        return result.toString();
	    }
	}



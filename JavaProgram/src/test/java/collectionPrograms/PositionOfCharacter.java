package collectionPrograms;

import java.util.HashMap;
import java.util.Map;
public class PositionOfCharacter {

	
	    public static void main(String[] args) {
	        String str = "Testyantra";
	        displayCharacterPositions(str);
	    }
 
	    public static void displayCharacterPositions(String str) {
	        Map<Character, StringBuilder> charPositions = new HashMap<Character, StringBuilder>();

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            charPositions.putIfAbsent(c, new StringBuilder());
	            charPositions.get(c).append(i).append(" ");
	        }

	        System.out.println("Characters and their positions:");
	        for (Map.Entry<Character, StringBuilder> entry : charPositions.entrySet()) {
	            System.out.println("'" + entry.getKey() + "' occurs at positions: " + entry.getValue());
	        }
	    }
	}



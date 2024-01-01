package collectionPrograms;

import org.testng.annotations.Test;

public class OccuranceString {

	public static void main(String[] args) {
		
		
		String str="Testyantra";
		  
		int i,len,j;
		 StringBuffer sb = new StringBuffer(str);
	        len = sb.length();
	        
	        for(i=0;i<len;i++)
	        {
	            int c=1;
	            for(j=0;j<len;j++)
	            {
	                if(sb.charAt(i)==sb.charAt(j) && (i!=j))
	                {
	                    c++;
	                    sb.setCharAt(j, ' ');
	                }
	                
	            }
	            if(c>0 && sb.charAt(i)!=' ')
	            {
	                System.out.println("The "+sb.charAt(i)+" occurs " + c +" times.");
	            }
	        }
	        
	        
	        
	    }
	    
	
		// TODO Auto-generated method stub

	
/*The outer loop iterates over each character of the string using index i.
Inside the outer loop, a variable c is initialized to 1. This variable will be used to count the occurrences of the current character.
The inner loop iterates over each character of the string using index j. It compares the character at index i with the character at index j.
If the characters match and i is not equal to j, it means the same character is encountered again. In this case, the occurrence count c is incremented, and the character at index j is replaced with a space to mark it for exclusion from further counting.
After the inner loop finishes, if c is greater than 0 and the character at index i is not a space, the program prints the character along with its occurrence count.
The program continues this process for each character in the string, effectively counting the occurrences of each character.*/






@Test

public void printMinLengthValueInString() {
	String[] s= {"12","1234","12345","45","1434234"};
	String max_length=s[0];
	for(int i=0;i<s.length;i++) {
		if(s[i].length()>max_length.length()) {
			max_length=s[i];
		}
	}
	for(int i=0;i<s.length;i++) {
		if(s[i].length()==max_length.length()) {
			System.out.println(s[i]+" ");
		}
	}
	
}
}
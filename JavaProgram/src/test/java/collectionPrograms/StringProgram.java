package collectionPrograms;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class StringProgram {
	@Test
	public void numOfWords() {
		String s="Navin is my World";
		String[] st=s.split("");
	    int len =st.length;
	    System.out.println(len);
		
	}
	@Test
	public void numOfChar() {
		String s="Navin is my World";
	//	int leng=s.length();
		char[] st=s.toCharArray();
		int leng=st.length;
		System.out.println(leng);
		
	}
	
	
	
	@Test
	public void reverseWordString() {
		String st="I am from Bangalore";
		String[] s=st.split(" ");
		for(int i=0;i<s.length;i++) {
			String str=s[i];
			for(int j=str.length()-1;j>=0;j--) {
				System.out.print(str.charAt(j));
				
			}
			System.out.print(" ");
		}
	}


@Test
public void occuranceUsingMap() {
	String s="TestYantra";
	String st=s.toLowerCase();
	Set<Character> set=new TreeSet<Character>();
	for(int i=0;i<st.length();i++) {
		set.add(st.charAt(i));
	}
	for(Character cou:set) {
		int count=0;
		for(int i=0;i<st.length();i++){
			if(cou==st.charAt(i)) {
				count++;
			}
		}
		System.out.println(cou+"is repeating"+count);
	}
	
	LinkedHashMap<Character, Object> map=new LinkedHashMap<Character, Object>();
	for(int i=0;i<st.length();i++) {
		map.put(st.charAt(i), i);
	}
	for(Entry<Character, Object> m:map.entrySet()) {
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(m.getKey()==s.charAt(i)) {
				count++;
			}
			
		}
		System.out.println(m.getKey()+" is repeating "+count+" times");
	}
	
}

@Test
public void countNoOfVowelsWithoutDuplicates() {
	String s="TestYantra";
	String st=s.toLowerCase();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<st.length();i++) {
		set.add(st.charAt(i));
	}
	int count=0;
	for(Character c:set) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
			count++;
			System.out.print(c);
		}
	}
	System.out.println(count);
}



@Test
public void reverseAgivenString() {
	String s="I am from bangalore";
	String[] st=s.split(" ");
	for(int i=st.length-1;i>=0;i--) {
		System.out.print(st[i]+" ");
	}
	
}
@Test
public void  addNumbers() {
	String s="1he2n4";
	int sum=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			int n=s.charAt(i)-48;
			sum=sum+n;
			
		}
	}
	System.out.println(sum);
}
@Test
public void set() {
	String s="I am test Enginner";
	char[] c=s.toCharArray();
	 String str = s.replaceAll("\\s+", ""); // Remove spaces
	Set<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
	}
	for(Character ch:set) {
	System.out.print(ch);	
}
}
@Test

public void pattern() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<n-i;j++) {
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
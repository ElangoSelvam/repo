package collectionPrograms;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Practice {
	
	// length of string
	@Test
	public void pra()
	{
		String s="kuresh in banga";
		int sh=s.length();
		System.out.println();
		int ch=sh/2;
		
		System.out.println(s.charAt(ch));
		//System.out.println(s.charAt(s.length()/2));
		
		
		StringBuffer st=new StringBuffer("Bangalore");
		System.out.println(st.reverse());
	}
	
	
	@Test
	public void num() {
		int x=5;
		//System.out.println(x++ + ++x);

		
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x++);
	}
	//reverse a string
	@Test
	public void rev() {
		String s="vicky";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	// words reverse
	@Test
	
	
	public void revs() {
		String s="Beleive in yourself";
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}
		
	}
	@Test
	
	public void words() {
		String s="I am Elangovan";
	String [] st=s.split(" ");
	int len=st.length;
	System.out.println(len);
	}
	
	@Test
	
	
	
	public void character() {
		String s="I am Elangovan";
		char[] ch=s.toCharArray();
		int len=ch.length;
		System.out.println(len);
	}
	
	@Test
	
	public void  reverseeachword() {
		String s="I am ELangovan";
		String[] st=s.split(" ");
		
	for(int i=0;i<s.length();i++) {
		String str=st[i];
		for(int j=str.length()-1;j>=0;j--) {
			System.out.print(str.charAt(j));
		}
		System.out.print(" ");
	}
		
	}
	
}



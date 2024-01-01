package collectionPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class StringPrograms {
	@Test
	public void reverseString() {
		
		
		int [] arr={1,0,0,1,0,1,0};
		for(int i=0;i<arr.length;i++){ 
		for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
		int temp=arr[i];
		    arr[i]=arr[j];
		    arr[j]=temp;
		}
		}
		}
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
//		//1
		String s="Bangalore ";
		char[] str=s.toCharArray();
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}
		String str="Bangalore";
		for(int i=str.length()-1;i>=0)
		
        		
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.print(rev+" ");
		
	
		// By Using String Buffe
	
	}
	@Test 
	
	
	public void reverse() { 
	StringBuffer st=new StringBuffer("i am from Bangalore");
	System.out.println(st.reverse());
	
	}
	
	@Test
	
	public void stringrev() {
		String s="Bangalore";

		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
		
//		@Test
	
		
		public void countOccuerance()//type--1
		{
			String s="testyantra";
			char[] c = s.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				int count=1;
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						count++;
						c[j] = ' ';
					}
					
				}
				if(c[i]!= ' ')
				{
					System.out.println(c[i]+"--------------------------->"+count);
		
				}
			}
		}
		


	@Test
	public void countOccurence()//through ascii value
	{
	String s="testyantra";
	for(int i=0;i<s.length();i++)
	{
		int l=s.charAt(i);
		System.out.print(l+",");
	}


	}
	//@Test
	public void stringPalindrom()
	{
		String s="malayalam";

		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("this is palindrom string");
		}
		else
		{
			System.out.println("this is not palindrom string");
		}
		
		
	}
	@Test
	
	public void countOccuranceUsingCollection()//not complited
	{
		String s="testyantra";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		
		
	}
	@Test
	
	public void reverseAGivenString()
	{
		String m="i am from Testyantra";//output will be---Testyantra from am i
		String[] s = m.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
	}
	//@Test
	public void reverseWordsInString()
	{
		String s="i am from testyantra";//out put will be--i ma morf artnaytset 

		String m[]=s.split(" ");
		for(int i=0;i<m.length;i++) 
		{
			String str=m[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	@Test

	
	public void swap1stAndLastWordInString()
	{
		String s="i am from testyantra";//output will be--[testyantra, am, from, i]
		String[] m=s.split(" ");
		String temp=m[0];
		m[0]=m[m.length-1];
		m[m.length-1]=temp;
		System.out.print(Arrays.toString(m));
		
	}
	@Test
	
	public void countNoOfVowelsInStringWithDuplicates()
	{
		String s="India";
		int count=0;
		String st = s.toLowerCase();
		char[] ch = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='u'||ch[i]=='o')
			{
				count++;
				System.out.println(ch[i]);
			}
		}
		System.out.println("total vowel is----------------->"+count);

	}
	@Test
	public void countNoOfVowelInAStringWithOutDuplicates()
	{
		String s="India";
		String m=s.toLowerCase();
		char[] ch = m.toCharArray();
		int count=0;
		TreeSet<Character> ts=new TreeSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			ts.add(ch[i]);
		}
		
		for (Character vowel:ts) {
		if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='u'||vowel=='o')
		{	count++;
			System.out.println(vowel+"------------>"+count);

			
		}
		}
		System.out.println(count);

	}
	//@Test
	public void setPractice()
	{
		Set<Object> ts=new TreeSet<Object>();
		ts.add('k');
		ts.add('u');
		ts.add('r');
		ts.add('e');
		ts.add('s');
		ts.add('h');
		
	}
	//@Test
	public void segregateAlphabetsNumbersAndSpecialCharacterFromString()
	{
		String s="ab2%c@3";
		char[] ch=s.toCharArray();
		String merge="";
		String numbers="";
		String special="";
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				merge= (merge+ch[i]);
			}
			else if(Character.isDigit(ch[i]))
			{
				numbers =numbers+ch[i];
			}
			else
			{
				special=special+ch[i];
			}
		}
		System.out.println(merge);
		System.out.println(numbers);
		System.out.println(special);
	}
	//@Test
	public void addingNumberOfAString()
	{
		String s="1he2m4";
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				int n=ch[i]-48;//ascii value starts from 49
				sum=sum+n;
				
			}
		}
		System.out.println(sum);
		
	}

	
	
	
	
	
	
}

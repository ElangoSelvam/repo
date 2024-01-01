package collectionPrograms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.testng.annotations.Test;

public class BasicPrograms {
	@Test
public void factorial() {
	 int a=5;
	 for(int i=a-1;i>0;i--) {
		 a=a*i;
	 }
	 System.out.println(a);
}
	@Test
public void fibonacci() {
	int a=0,b=1,c,count=10;
	for(int i=0;i<count;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
@Test 
	public void primeNumber() {
		for(int i=1;i<=30;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
			}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}


	@Test
	public void primeNumFormat() {
		int n=1;
		for(int i=0;i<=7;i++) {
			System.out.println(n+" ");
			n=(n*2)+1;
		}
	}
	
	
	
	@Test
	
	public void primeNot() {
		int a=7;
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime number a= "+a);
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}
	@Test
	public void string()
	{
		System.out.println("enter the string");
		Scanner scn=new Scanner(System.in);
		String k=scn.nextLine();
		String z[]=k.split(" ");
		for(int i=0;i<z.length;i++)
		{
		String s=z[i];
		for(int j=0;j<s.length();j++)
		{
		if(!(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'))
		{
		System.out.print(s.charAt(j));
		}
		}
		System.out.print(" ");
		}
	}
	
	
	
}

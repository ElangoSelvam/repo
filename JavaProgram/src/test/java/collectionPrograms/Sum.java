package collectionPrograms;

import org.testng.annotations.Test;

public class Sum {
	@Test
	
	
	    public void sum(){
	        String s = "i love india";
	        StringBuilder result = new StringBuilder();

	        int j = s.length() - 1;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == ' ') {
	                //result.append(' ');
	            	System.out.println(" ");
	            } else {
	                while (j >= 0 && s.charAt(j) == ' ') {
	                    j--;
	                }
	                result.append(s.charAt(j));
	                j--;
	            }
	        }

	        System.out.println(result.toString());
	    }
	



@Test
public void st() {
String s="i love india";//ou+tput will be-"a idni evoli"
//System.out.print("length is"+s.length());
int m=0;
int x=1;

for(int i=0;i<=s.length()-1;i++)
{
	m=s.length()-(i+x);
	if(s.charAt(i)==' ')
	{
		System.out.print(" ");
	x--;
	    
	}

	else
	{
		System.out.print(s.charAt(m));
	}
	if(m==0)
	{
		System.out.println(s.charAt(m));
	}

}
}

@Test
public void st1() {
    String s = "i love india";
    int m = 0;
    int x = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') {
            System.out.print(" ");
        } else {
            m = s.lastIndexOf(' ', i + x);
            System.out.print(s.charAt(m + 1));
        }
    }
}

}

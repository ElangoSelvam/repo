package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestClass3 {
	public static void main(String[] args) throws FindFailed, AWTException {
		
//		String s="i am from bangalore";
//		String []st=s.split(" ");
//		for(int i=0;i<st.length;i++) {
//			String str=st[i];
//			for(int j=str.length()-1;j>=0;j--) {
//				System.out.print(str.charAt(j));
//			}
//		}
//		System.out.println(" ");
//		
		
		String s="i am from bangalore";
StringBuffer str=new StringBuffer("i am from bangalore");
System.out.println(str.reverse());
		
String st="i am from bangalore";
String[] c=st.split(" ");
String temp=c[0];
c[0]=c[c.length-1];
c[c.length-1]=temp;
System.out.println(Arrays.toString(c));


		
	
		
		
//		Screen sc=new Screen();
//		Pattern p1=new Pattern("E:\\Automation\\ProjectGrid\\test-output\\minimize.png");
//        sc.click(p1);
//		Pattern p2=new Pattern("E:\\Automation\\ProjectGrid\\test-output\\searchBar.png");    
//		sc.click(p2);
//		sc.type(p2,"paint");
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		Pattern p1=new Pattern("E:\\Automation\\ProjectGrid\\test-output\\firefox.png");
//		sc.click(p1);
//		
//		Pattern p2=new Pattern("E:\\Automation\\ProjectGrid\\test-output\\kuresh.png");    
//		sc.click(p2);
//		sc.type(p2,"paint");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);

	}

}

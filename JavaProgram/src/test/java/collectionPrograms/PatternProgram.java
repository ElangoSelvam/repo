package collectionPrograms;

import org.testng.annotations.Test;

public class PatternProgram {
@Test

	public void pattern1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
@Test
public void pattern2() {
	
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
@Test

public void pattern3() {
	
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
@Test

public void pattern4() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
@Test
public void pattern5() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
@Test
public void pattern6() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
@Test

public void pattern7() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
@Test
public void pattern8() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("1 ");
		}
		System.out.println();
	}
}
@Test
public void pattern9() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern10() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern11() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++ ) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
@Test

public void pattern12() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
@Test

public void pattern13() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			
			System.out.print("  ");
			
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
@Test

public void pattern14() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern15() {
	int n=5;
	for(int i=1;i<=n;i++) {
		int k=5;
		for(int j=i;j<=n;j++) {
		System.out.print(k--+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern16() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
		if(i%2==0) {
			System.out.print("2 ");
		}else {
			System.out.print("1 ");
		}
		}
		System.out.println();
	}
}
@Test
public void pattern17() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern18() {
	int n=5;
    char ch='A';
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
}
@Test

public void pattern19() {
	int n=5;
   
	for(int i=1;i<=n;i++) {
		 char ch='A';
		for(int j=1;j<=n;j++) {
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
}
}

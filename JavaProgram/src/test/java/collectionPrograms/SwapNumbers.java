



package collectionPrograms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;




public class SwapNumbers {

//Swap tow numbers with variables
	public void swapWithoutVariable() {
		int a=10;
		int b=20;
		  System.out.println("Before swapping: a = " + a + ", b = " + b);
		int temp=a; // temp=10
		a=b;        // a=20
	    b=temp;     // b=10
		
		
		System.out.println(a);
		System.out.println(b);
		}



//Swap two numbers without variable
public void swapWithVariables() {
	int a=10;
	int b=20;
	a=a+b; // a=30
	b=a-b; // b=10
	a=a-b; // a=20
	System.out.println(a);
	System.out.println(b);
}


// Array print in asc order
public void sortArrayAscOrder() {
	int[] arr= {5,3,0,1,4};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	}
//BubbleOrder
@Test
// Array print in ascending order
public void sortArrayAscOrderMethod() {
	int[] arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	
}
@Test
//Array print in minimum 1st and 2nd number 
public void printArrayMinNumMethod() {
	int[] arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			}
		}
	}
	for(int i=0;i<2;i++) {
		System.out.println(arr[i]);
	}
	
//		System.out.println(arr[0]+"----> This is !st Minimum number");
//		System.out.println(arr[1]+"----> This is 2nd Minimum number");
	
	
}

// Array print in descending order
public void sortArrayDescOrderMethod() {
	int[] arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
			int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			}
		}
	
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}

@Test


// Array print in maxmimum 1st and 2nd number
public void printArrayMaxNumMethod() {
	int []arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			}
		}
	}
	System.out.println(arr[0]+"----> This  is a 1st Max number");
	System.out.println(arr[1]+"----> This is a 2nd Maximum Number");
}

//Sum of 1st three minimum number in array
public void sumOf1stThreeMinNum() {
	int []arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			}
		}
	}
	int sum=0;
	for(int i=0;i<3;i++) {
		sum=sum+arr[i];
	}
System.out.println(sum);
//
//		//System.out.println(arr[i]);
//		int sum=arr[0]+arr[1]+arr[3];
//		System.out.println(sum);
}	


// Sum of 1st three maximum number in array
public void sumOf1stThreeMaxNum() {
	int []arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			}
		}
	}
	int sum=0;
	for(int i=0;i<3;i++) {
		sum=sum+arr[i];
	}
System.out.println(sum);
//		//System.out.println(arr[i]);
//		int summ=arr[0]+arr[1]+arr[2];
//		System.out.println(summ);
}

// Multiple of 1st three minimum number in array
public void multipleOf1stThreeMinNum() {
	int []arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			}
		}
	}
	int sum=1;
	for(int i=0;i<3;i++) {
		sum=sum*arr[i];
	}
System.out.println(sum);
//		//System.out.println(arr[i]);
//		int sum=arr[0]*arr[1]*arr[2];
//		System.out.println(sum);
}

// Multiple 1st three maximum number in array
public void multipleOf1stThreeMaxNum() {
	int []arr= {5,3,0,1,4};
	for(int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			}
		}
	}
	int sum=1;
	for(int i=0;i<3;i++) {
		sum=sum*arr[i];
	}
       System.out.println(sum);
//
//		//System.out.println(arr[i]);
//		int sum=arr[0]*arr[1]*arr[2];
//		System.out.println(sum);
}
@Test
// Another easiest method to find the max number in array
public void firstMaxNumArray() {
	int [] arr= {5,3,0,1,4};
	int max=0;
	for (int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
			
		}
	}
	System.out.println(max + " The first max no in array");
}
@Test

//Another easiest method to find the min number in array
public void firstMinNumArray() {
	int [] arr= {5,3,0,1,4};
	int fmin=arr[0];// 5 3 0 1
			int smin=arr[0]; // 5 5 3 1
	for (int i=0;i<arr.length;i++) {
		if(arr[i]>fmin) { // 5<5f,3<5t,0<3t,1<0f,
		     smin=fmin;  //smin=5,smin=5,smin=3,smin= 0
			fmin=arr[i]; // fmin=5,fmin=3,fmin=0,fmin=1
			
		}else if(arr[i]>smin && arr[i]<fmin) { // 5<5f && 5!=5f,1<3 && 1!=0
			smin=arr[i]; // smin=1
		}	
	}
	
    System.out.println(fmin);
	System.out.println(smin);
////	
	//System.out.println(arr[0]+arr[1]);	
}
@Test
public void array() {
Integer[] arr= {1,5,6,8,9,0};
Arrays.sort(arr,Collections.reverseOrder());
System.out.println(Arrays.toString(arr));
int sum=0;
for(int i=0;i<3;i++) {
	sum=sum+arr[i];
}
System.out.println(sum);
}










@Test
public void combinationOfTwoNumbers() {
	int[] arr= {8,4,3,9,2,7,5,6,3};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			
		if(arr[i]+arr[j]==11) {
			
			System.out.println(arr[i]+arr[j]);
		}
		
	}
}



}
}


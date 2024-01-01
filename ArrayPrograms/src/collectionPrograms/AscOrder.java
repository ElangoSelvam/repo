package collectionPrograms;


public class AscOrder {
	
	

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
	
	
	
	}
	
	
	public void firstMinNumArray() {
		int [] arr= {5,3,0,1,4};
		int fmin=arr[0];// 5 3 0 1
				int smin=arr[0]; // 5 5 3 1
		for (int i=0;i<arr.length;i++) {
			// i=0 0<5t arr[i]=5
			// i=1 1<5t arr[i]=3
			// i=2 2<5t  arr[i]=0
			// i=3 3<5 arr[i]=1
			//i=4  4<5
			//i=5  5<5
			if(arr[i]<fmin) { // 5<5f,3<5t,0<3t,1<0f,
			     smin=fmin;  //smin=5,smin=5,smin=3,smin= 0
				fmin=arr[i]; // fmin=3,fmin=3,fmin=0,fmin=1
				
			}else if(arr[i]<smin && arr[i]!=fmin) { // 5<5f && 5!=5f,1<3 && 1!=0
				smin=arr[i]; // smin=1
			}
			
		}
		System.out.println(fmin);
		System.out.println(smin);

		//System.out.println(arr[0]+arr[1]);	
	}
	
	public void firstMaxNumArray1() {
		int [] arr= {5,3,0,1,4};
		int max=0;
		for (int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
		}
		System.out.println(max + " The first max no in array");
		
	}

	
	public void firstMinNumArray1() {
		int [] arr= {5,3,0,1,4};
		int max=arr.length;
		for (int i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				max=arr[i];
				
			}
		}
		System.out.println(max + " The first min no in array");
		
	}
	
	
	public void appendin0sAtLast() {
		int[] a= {5,0,4,0,0,9};
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				System.out.println(a[i]);
			}
		}
		
	}
	
	
	
}

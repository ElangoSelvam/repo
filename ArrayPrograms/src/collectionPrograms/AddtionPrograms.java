package collectionPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class AddtionPrograms {
	

	
	public void addtionOfArray() {
		int[] a= {4,2,6,1,7};
		int[] b= {3,1,7,2};
		int length=a.length;
	    if(a.length<b.length) { // 5<4
	    	length=b.length; 	
	    }
	    for(int i=0;i<length;i++) { //0<5t
	    	
	    	try {
	    		System.out.println(a[i]+b[i]+" ");
	    	}
	    	catch(Exception e) {
	    		if(a.length<b.length) {
	    			System.out.println(b[i]);
	    		}
	    		else {
	    			System.out.println(a[i]);
	    		}
	    	}
	    }
		
	}
	
	

	public void appendin0sAtLast() { 
		int[] a= {5,0,4,0,0,9};
		int[] b=new int[a.length];
		
		int m=0;
		int n=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[m]=a[i];
				m++;
			}else {
				b[n]=a[i];
				n--;
			}
			
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" ");
		}
	}
	// by using Collections remove the duplicates

	public void removeDuplicatsArray() {
		int[] a= {2,3,1,4,1,3,5,2};
		Set<Integer> arr=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			arr.add(a[i]);
		}
		System.out.println(arr);	
		

}

	public void removeDuplicatsArrayMap() {
		int[] a= {2,3,1,4,1,3,5,2};
Map<Object,Object> hs=new HashMap<Object,Object>();
		for(int i=0;i<a.length;i++) {
			hs.put(a[i],a[i]);
		}
		for(Entry<Object, Object> map:hs.entrySet()) {
		System.out.println(map.getKey()+" ");	
		
	}
}
	// find the duplicates

	public void countTheDupilcates() {
		int[] a= {2,3,1,4,1,3,5,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		
	}
	
	// count  how many times duplicates are repeating
	
	
	public void countDuplicatsArray() {
		int[] a= {2,3,1,4,1,3,5,2};
		Set<Integer> arr=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			arr.add(a[i]);
		}
		for(Integer cou:arr ) {
	    int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==cou) {
			count++;
	}	

		}
		System.out.println(cou+" is repating "+count +" times");
	}
}
	public void countDuplicatesArrayMap() {
		
	}
	
@Test
	public void countDuplicatsArrayMap() {
		int[] a= {2,3,1,4,1,3,5,2};
Map<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			hs.put(a[i],i);
		}
		for(Entry<Integer, Integer> map:hs.entrySet()) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				
				if(a[i]==map.getKey()) {
					count++;
				}
			}
		System.out.println(map.getKey()+ " "+ count);
		
	}
	
	
	}	
	
	
	
}

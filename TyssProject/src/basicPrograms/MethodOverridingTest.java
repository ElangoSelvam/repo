package basicPrograms;


	class Parent {
	    static void staticMethod() {
	        System.out.println("Static method in Parent");
	    }
	}

	class Child extends Parent {
	    static void staticMethod() {
	        System.out.println("Static method in Child");
	    }
	}

	public class MethodOverridingTest {
	    public static void main(String[] args) {
	        
	      Parent p=new Parent();
	      p.staticMethod();
	      
	    }
	}
	
	
//	class Vehicle{  
//		  //defining a method  
//		  void run(){System.out.println("Vehicle is running");
//		  }  
//		}  
//	
//		//Creating a child class  
//		class Bike2 extends Vehicle{  
//		  //defining the same method as in the parent class  
//		  void run(){System.out.println("Bike is running safely");
//		  }  
//		  
//		}
//		  public class MethodOverridingTest {
//		  public static void main(String args[]){  
//		 Vehicle obj=new Bike2();  
//		  obj.run(); 
//		  }  
//		}  
		


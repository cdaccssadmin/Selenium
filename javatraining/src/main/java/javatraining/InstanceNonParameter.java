package javatraining;

public class InstanceNonParameter {

	 public  void details() 
     { 
		 int a=10;
		 int b=20;
       System.out.println(a); 
       System.out.println(b); 
     } 
     public static void main(String[] args) 
     { 
    	 InstanceNonParameter obj=new InstanceNonParameter(); 
      obj.details();
}
}
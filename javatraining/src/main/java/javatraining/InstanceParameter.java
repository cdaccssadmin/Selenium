package javatraining;

public class InstanceParameter {

	public  void details(int a ,int b) 
    { 
	  System.out.println(a); 
      System.out.println(b); 
    } 
    public static void main(String[] args) 
    { 
   	 InstanceParameter obj=new InstanceParameter(); 
     obj.details(5,6);
}
}

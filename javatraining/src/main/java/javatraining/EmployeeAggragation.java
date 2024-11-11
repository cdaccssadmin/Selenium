package javatraining;

public class EmployeeAggragation {
	String book; 
 	CollegeAggragation agg; 
 	 
 	EmployeeAggragation(String book,CollegeAggragation agg) 
 	{ 
 		this.book=book; 
 		this.agg=agg; 
 	} 
  public void display() {
	
	  System.out.println(book);
	  System.out.println(agg.name);
	  System.out.println(agg.age);
  }
  
 	public static void main(String[] args)  
 	{ 
 		CollegeAggragation obj1=new CollegeAggragation("anu",10); 
 		EmployeeAggragation obj=new EmployeeAggragation("novel",obj1); 
 	obj.display();	 
 	}

		// TODO Auto-generated method stub

	}



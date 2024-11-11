package javatraining;

public class ThisMethod {
	void show() 
		{ 
			System.out.println("hello m"); 
		}   
		void display() 
		{   
		System.out.println("hello n");   
		  
		show();   
		//this.show();
		}   
		   
		 
		public static void main(String args[]) 
		{   
			ThisMethod  a=new ThisMethod ();   
		a.display();   
		}
	

	}



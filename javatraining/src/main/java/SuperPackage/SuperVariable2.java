package SuperPackage;

public class SuperVariable2 extends SuperVariable1 {
	String name="karnataka";
	public void show() 
	 { 
	 	System.out.println(super.name); 
	 	System.out.println(name); 
	 }
	public static void main(String[] args) {
		 SuperVariable2 obj=new SuperVariable2(); 
	 		obj.show();
	}

}

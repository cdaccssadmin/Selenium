package Interface;

public class InterfaceClass1 implements InterfaceEx1,InterfaceEx2 {

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("world");
	}


	public static void main(String[] args) {
		InterfaceClass1 obj=new InterfaceClass1();
		obj.display();
		obj.display1();
}
}
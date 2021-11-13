
public class superSubOverrise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	B b1 = new B();
	b1.show();
		

	}
	
	
class A{
	public void show()
	{
		System.out.println(" class A Superclass show");	
		}
}
	

	class B extends A
	{
		@override
		public void show()
		{
			System.out.println(" class B subclass show");
		
	}
}
}


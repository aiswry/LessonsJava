
public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]= new int[5];
		int v=1;
		for(int i=1;i<5;i++) {
			a[i]= v++;
			System.out.println("a[i] values are    "   +  a[i]);
		}
		
		
		for(int k:a)   //for each iteration value of a goes to k and is printed
		//on 1st iteration 1st value of a to k and is printed.and then on 2nd iteration second value
		{
			System.out.println(k);

		}
	}
	
	//git  cpmmitted the file then deleted again added and committed

}

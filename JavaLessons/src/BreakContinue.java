
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int i=1;i<10;i++)
 {
	 if(i==8)
	{
		continue;  // if i=8 continue for loop - go back to  for loop -wont execute next line
		
	}
	 System.out.println("CONTINUE: Values are " + i);
 }

 for(int i=1;i<10;i++)
 {
	if(i>5)
	{
		break;
		
	}
 
 System.out.println("BREAK: Values are " + i);
	}
}}

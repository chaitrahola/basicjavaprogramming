package andor;

public class AndOr {
	public static void main(String[] args) {
		int x=20;
		int y=-10;
		if(x>0 && y>0)
		{
			System.out.println("both num are +ve");
		}
		else if(x>0 || y>0)
		{
			System.out.println("atleast one num is negative");
	}
	else 
	{
		System.out.println("both num are -ve");
	}
	}
}
	

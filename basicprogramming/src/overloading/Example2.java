package overloading;

public class Example2 {
	
		  void result(int x,int y)
		  {
			  System.out.println(x+y);
		  }  
		  void result(int x,int y,int z)
		  {
			  System.out.println(x+y+z);
			  }  
		  
		  public static void main(String args[])
		  {  
			  Example2 obj=new Example2();  
		  obj.result(5,10,15);  
		  obj.result(60,30);  
		  
		  }  
		}  
/*even if the two methods are same depending upon the 
number of arguments complier decides which method has to 
passed which values */


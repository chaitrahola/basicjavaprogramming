package overloading;

public class example1 {
	  
		  void result(int x,int y)
		  {
			  System.out.println(x+y);
			  }  
		  void result(double x,double y)
		  {
			  System.out.println(x+y);
		  }  
		  
		  public static void main(String args[]){ 
			  
	      example1 obj=new example1();  
		  obj.result(2.4,2.4);  
		  obj.result(50,20);  
		  
		  }  
		}  
/*even if the two methods are same depending upon the 
type of arguments complier decides which method has to 
passed which values */





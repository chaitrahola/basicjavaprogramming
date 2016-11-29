package string;

public class Example1 {
	public static void main(String[] args) {
		
		String s="niit";//will check in heap/string constant pool
		                //if "niit" is available , it will not create new instance
		
		String s1= new String("niit");
		/*will  create new instance,string is immutable,immutable->will not modify*/
		
		s1= s1+"Technologies";
		/*it will create memory location for "niit" and for "technologies" and also
		 " niit technologies" */
		System.out.println(s1);
		//unnecessarily it is creating different memory location , so avoid using strings in loop.
		
	}

}

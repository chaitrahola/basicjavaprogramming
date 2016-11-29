package wrapperclasses;

public class WrapperClass {
	public static void main(String[] args) {
		String age="42";
		String salary="457895.54";
		/*When num is in the form of string it cannot be manipulated, so it is converted
		 * using wrapper classes*/ 
		 
		int a =Integer.parseInt(age)+2; //converts age into integer and pass it to a
		double s= Double.parseDouble(salary);
		int t= (int) (s+(s*0.30));
		System.out.println("age="+a);
		System.out.println("salary="+t);

	}

}

package array;

public class Array {
public static void main(String[] args) {
	//ineffient way
	/*int a=20;int b=30;int c=40;int d=50,int e=50;*/
	
	//efficient way to store large amount of uniform data
	
	int []a={10,20,30,40,50};
	System.out.println(a[2]+"  "+a[4]);
	System.out.println("-----------");
	
	//enhanced method to print all the values in array
	
	for(int temp:a)
	{
		System.out.println(temp); //all values in array will be printed
	}

	System.out.println("-------------");
	//can first declare array and can then assign values
	
	int []b=new int[4];
	b[0]=1;
		b[2]=20;
		for(int temp2:b)
		{
			System.out.println(temp2);
			
		}
		System.out.println("-------------");
		

		//string array
		/* for integer array by default the value will be "zero" but for string array
		 * the value will be "null" */
		 
		
		String [] st ={"one" ,"two","three","four"};
		for (String temp3:st)
		{
			System.out.println(temp3);
		}
		
		//declare string array and then assign
		
		String[] sty =new String[3];
		sty [0]="apple";
		sty [1]="bravo";
		for(String temp4:sty)
		{
		System.out.println("----------------");
			System.out.println(temp4);
		}
			
}
}

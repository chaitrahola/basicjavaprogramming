package string;

public class Example2 {
	public static void main(String[] args) {
		
	String s ="NIIT";
	
    Long startTime =System.currentTimeMillis();
	
	//it may take more than 100micro sec
	for(int i=1;i<=100000;i++)
	{
		s=s+"technologies";
	}
	Long endTime=System.currentTimeMillis();
	System.out.println("for Strings"+(endTime-startTime));
	
	//it may take 1 micro sec
	StringBuffer sb=new StringBuffer();
	
	for(int i=1;i<=100000;i++)
	{
		sb.append("technologies");
	}
	endTime=System.currentTimeMillis();
	System.out.println("for string buffer"+(endTime-startTime));
	}

}

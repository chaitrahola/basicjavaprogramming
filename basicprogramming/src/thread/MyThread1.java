package thread;

public class MyThread1 implements Runnable{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(2+ "*" +i+"="  +2*i);
		}
	}
	
	public static void main(String[] args) {
		
		MyThread t= new MyThread();
		t.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println(5+ "*"  +i+  "="  +5*i);
		}
	}
}

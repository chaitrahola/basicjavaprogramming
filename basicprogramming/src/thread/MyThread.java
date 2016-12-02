package thread;

public class MyThread extends Thread {
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		MyThread t= new MyThread();
		t.start();
		for (int j=100;j<=10000;j=j+100)
		{
			System.out.println(j);
		}
	}

}

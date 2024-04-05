
public class ThreadEx extends Thread {
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();
		t1.start();
		ThreadEx t2=new ThreadEx();
		t2.start();
		// TODO Auto-generated method stub

	}

}

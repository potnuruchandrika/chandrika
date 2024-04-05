
/*public class ThreadEx2 implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println( i );
		}
	}

	public static void main(String[] args) {
		ThreadEx2 ob1=new ThreadEx2();
		Thread t=new Thread(ob1);
		ThreadEx2 t1=new ThreadEx2 ();
		t.start();
		ThreadEx2 ob2=new ThreadEx2();
		Thread t3=new Thread(ob2);
		ThreadEx2  t2=new ThreadEx2 ();
		t3.start();
		// TODO Auto-generated method stub

	}

}*/

/*public class ThreadEx2 implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println( i );
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadEx2 ob1=new ThreadEx2();
		Thread t=new Thread(ob1);
		ThreadEx2 t1=new ThreadEx2 ();
		t.start();
		t.setName("Thread1");
		ThreadEx2 ob2=new ThreadEx2();
		Thread t3=new Thread(ob2);
		ThreadEx2  t2=new ThreadEx2 ();
		t3.start();
		t3.setName("Thread2");
		// TODO Auto-generated method stub

	}

}*/

public class ThreadEx2 implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println( i );
			System.out.println(Thread.currentThread().getName());
		}
	try {
		Thread.sleep(1000);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		ThreadEx2 ob1=new ThreadEx2();
		Thread t=new Thread(ob1);
		ThreadEx2 t1=new ThreadEx2 ();
		t.start();
		t.setName("Thread1");
		ThreadEx2 ob2=new ThreadEx2();
		Thread t3=new Thread(ob2);
		ThreadEx2  t2=new ThreadEx2 ();
		t3.start();
		t3.setName("Thread2");
		// TODO Auto-generated method stub

	}

}

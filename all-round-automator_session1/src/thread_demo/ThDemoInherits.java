package thread_demo;

public class ThDemoInherits {

	public static void main(String[] args) {
		
/*		ThreadInstance th1 = new ThreadInstance();
		th1.start();
		ThreadInstance th2 = new ThreadInstance();
		th2.start();
		ThreadInstance th3 = new ThreadInstance();
		th3.start();*/

		ThreadInstanceWithName th4 = new ThreadInstanceWithName("CustomName1");
		th4.start();
		ThreadInstanceWithName th5 = new ThreadInstanceWithName("CustomName2");
		th5.start();

	}
	
}

class ThreadInstance extends Thread{
	
	@Override
	public void run() {
		for(int i=1 ; i<=30 ; i++) {
			long thID = Thread.currentThread().getId();
			String name = Thread.currentThread().getName();
			System.out.println("For thread id: " + thID  + "("+ name +")"+ ", Value of i = " + i);
		}
	}
	
}

class ThreadInstanceWithName extends Thread{
	
	ThreadInstanceWithName(String name){
		super(name);
	}
	
		@Override
		public void run() {
			for(int i=1 ; i<=10 ; i++) {
				long thID = Thread.currentThread().getId();
				String name = Thread.currentThread().getName();
				System.out.println("For thread id: " + thID  + "("+ name +")"+ ", Value of i = " + i);
			}
		}
	
}
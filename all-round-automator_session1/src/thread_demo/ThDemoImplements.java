package thread_demo;

public class ThDemoImplements implements Runnable {

	public static void main(String[] args) {
		//ThDemoImplements th1 = new ThDemoImplements();
		Thread th1 = new Thread(new ThDemoImplements(), "Custom Name Runnable 1");
		th1.start();
		Thread th2 = new Thread(new ThDemoImplements());
		th2.start();
	}

	@Override
	public void run() {
		for(int i=1 ; i<=10 ; i++) {
			long thID = Thread.currentThread().getId();
			String name = Thread.currentThread().getName();
			System.out.println("For thread id: " + thID  + "("+ name +")"+ ", Value of i square = " + (i*i));
		}
	}

}

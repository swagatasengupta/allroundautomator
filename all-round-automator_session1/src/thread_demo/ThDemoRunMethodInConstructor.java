package thread_demo;

public class ThDemoRunMethodInConstructor {

	public static void main(String[] args) {

/*		We can create instances of different classes which inherit thread also...
 * 		ClassName instance1 = new ClassName();
		instance1.start();
		
		ClassName2 instance2 = new ClassName2();
		instance2.start();
		*/

/*
 * This is one more way of starting a thread while defining the functionality right here.
 * Only good for not too complicated classes/ functionalities.		
 */
		Thread th1 = new Thread(
				new Runnable() {
								@Override
									public void run() {
										for(int i=1 ; i<=200 ; i++) {
											long thID = Thread.currentThread().getId();
											String name = Thread.currentThread().getName();
											System.out.println("For thread id: " + thID  + "("+ name +")"+ ", Value of i = " + i);
										}
									}
							}
				);
		th1.start();
		
		Thread th2 = new Thread(
				new Runnable() {
								@Override
									public void run() {
										for(int i=1 ; i<=100 ; i++) {
											long thID = Thread.currentThread().getId();
											String name = Thread.currentThread().getName();
											System.out.println("For thread id: " + thID  + "("+ name +")"+ ", Value of iterator x 5 = " + i*5);
										}
									}
							}
				, "Custom Thread Name");
		th2.start();
	}

}

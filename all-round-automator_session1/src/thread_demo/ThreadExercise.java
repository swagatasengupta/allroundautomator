package thread_demo;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import lib.FrameworkUtil;

public class ThreadExercise {

	public static void main(String[] args) throws IOException, NumberFormatException {

		// Get properties file and load the required properties. Store them in
		// appropriate variables.
		// convert them to numbers as necessary
		Properties prop = FrameworkUtil.propUtil("src/resources/ThreadExercise.properties");
		String[] threadNames = prop.getProperty("Thread_Names").split(",");
		int infoDisplayInterval = Integer.parseInt(prop.getProperty("Info_Display_Interval", "1"));
		// may throw error in case string value is being converted to integer
		// default 1 will be used if no value is found
		int threadRunTime = Integer.parseInt(prop.getProperty("Thread_Run_Time", "10"));

		// If there is at least one thread name, create it as an array
		// initialize each array element with the properties ready from the file
		if (threadNames.length > 0) {
			ThreadToRun[] threads = new ThreadToRun[threadNames.length];
			for (int i = 0; i < threads.length; i++) {
				int currRunTime = threadRunTime;
				// Three lines below are optional.
				// This is just to add some randomness to the time interval for which the thread
				// will run
				// The threads will run for different times using this technique. Each time,
				// threadRunTime
				// will assume new value.
				Random rand = new Random();
				currRunTime = currRunTime + rand.nextInt(10);
				System.out.println("Initiating thread " + (i + 1) + " to run for " + currRunTime + " seconds");

				// Each new thread, as array elements will need to be initialized individually.
				// If not done, it will lead to null pointer exception.

				threads[i] = new ThreadToRun(threadNames[i].trim(), infoDisplayInterval, currRunTime);
				threads[i].start();
			}
		}

	}

}

class ThreadToRun extends Thread {

	int infoDisplayInterval, threadRunTime;
	long startTimeMillis;

	ThreadToRun(String name, int infoDisplayInterval, int threadRunTime) {
		super(name); // ass on the name to parent class Thread. Remaining elements are specific to
						// the current class and not super.
		// so not need to pass them on
		this.infoDisplayInterval = infoDisplayInterval;
		this.threadRunTime = threadRunTime;
	}

	@Override
	public void run() {

		startTimeMillis = System.currentTimeMillis(); // note the system time in milliseconds when the thread is
														// starting.
		long duration = elapsedTime();
		// run this thread until the duration of thread crosses the thread run time is
		// is initialized with
		while (duration <= (threadRunTime * 1000)) {

			System.out.println("Thread ID: " + Thread.currentThread().getId() + ", Thread Name: "
					+ Thread.currentThread().getName() + " has been running since " + duration + " milliseconds."
					+ (threadRunTime * 1000 - duration) + " ms more to go");
			duration = elapsedTime();

			// sleep for configured number of milliseconds
			try {
				Thread.sleep(infoDisplayInterval * 1000);
			} catch (InterruptedException e) {
				System.out.println("exception while trying to sleep in Thread: " + Thread.currentThread().getId());
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thread ID: " + Thread.currentThread().getId() + ", Thread Name: "
				+ Thread.currentThread().getName() + " has run for  " + duration + " milliseconds." + " exiting now");
	}

	// this function returns the elapsed time in milliseconds for the thread.
	public long elapsedTime() {
		return (System.currentTimeMillis() - startTimeMillis);
	}
}
package multithreading;
import java.util.*;

class printTask implements Runnable {
	private int sleepTime;
	private String threadName;
	private static Random generator = new Random();
	
	public printTask(String name,int sleep) {
		threadName = name;
		sleepTime = generator.nextInt(sleep);		
	}
	@Override
	public void run() {
		try {
			System.out.printf("%s dormindo por %d milisegundos.\n",threadName,sleepTime);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s thread dormindo!\n",threadName);
	}
	
}

package multithreading;
import java.util.concurrent.*;
public class mainPrintTask {

	public static void main(String[] args) {
		printTask task1 = new printTask("Thread 1", 10);
		printTask task2 = new printTask("Thread 2", 10);
		printTask task3 = new printTask("Thread 3", 10);
		System.out.println("Iniciando threads!");
		ExecutorService threads = Executors.newFixedThreadPool(3);
		threads.execute(task3);
		threads.execute(task1);
		threads.execute(task2);		
		threads.shutdown();
		System.out.println("threads executadas!");
	}

}

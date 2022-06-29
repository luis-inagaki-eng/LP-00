package multithreads;

import java.security.SecureRandom;
import java.util.Random;

public class readBuffer implements Runnable{
	private static final Random 
	generator = new Random();
	private final buffer sharedLocation;
	
	public readBuffer(buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		int sum = 0;
		for (int count =1;count <=10;count ++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.getBuffer();
				System.out.printf("\t\t\t%2d%n",sum);
				}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.printf("%n%s %d%n%s%n",
				"Leitura do total de valores: ", 
				sum, "Leitura finalizada!");
	}
}
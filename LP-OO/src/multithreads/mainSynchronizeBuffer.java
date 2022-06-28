package multithreads;

import java.nio.Buffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainSynchronizeBuffer {

	public static void main(String[] args) {
		ExecutorService threadRun = Executors.newFixedThreadPool(2);
		buffer sharedLocation = new sysnchronizedBuffer();
		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n","Operation","Buffer","Occupied","----------","-------\t\t----------");
		try {
			threadRun.execute(new writeBuffer(sharedLocation));
			threadRun.execute(new readBuffer(sharedLocation));
		}catch(Exception e) {
			e.printStackTrace();
		}
		threadRun.shutdown();
	}
	}

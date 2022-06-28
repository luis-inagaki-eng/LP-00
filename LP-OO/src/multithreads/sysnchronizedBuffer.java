package multithreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class sysnchronizedBuffer implements buffer {
	private Lock accessLock = new ReentrantLock();
	private Condition canWrite= accessLock.newCondition();
	private Condition canRead = accessLock.newCondition();
	private int buffer = -1;
	private boolean occupied = false;
	public void set(int value) {
		accessLock.lock();
		try {
			while(occupied) {
				System.out.println("Tentando escrever!");
				displayState("Tentando escrever!");
				canWrite.await();
			}
			buffer = value;
			occupied = true;
			displayState("Escrevito: "+ buffer);
			canRead.signal();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			accessLock.unlock();
		}
	}
	public int get() {
		int readValue = 0;
		accessLock.lock();
		try {
			while(!occupied) {
				System.out.println("Tentando leitura!");
				displayState("Aguardando leitura!");
				canRead.await();
			}
			occupied = false;
			readValue = buffer;
			canWrite.signal();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			accessLock.unlock();
		}
		return readValue;
	}
	public void displayState(String operation) {
		System.out.printf("%-40s%d\t\t%b\n\n",operation,buffer,occupied);;
	}
	@Override
	public void putBuffer(int value) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getBuffer() throws InterruptedException {
		// TODO Auto-generated method stub
		return 0;
	}

}

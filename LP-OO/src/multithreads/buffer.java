package multithreads;

public interface buffer {
	public void putBuffer(int value) 
			throws InterruptedException;
	public int getBuffer() throws InterruptedException;
}

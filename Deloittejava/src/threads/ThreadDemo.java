package threads;

public class ThreadDemo {
	
	public static void main(String[] args) {
		FeeThread feeThread = new FeeThread("feeQ");
		feeThread.start();
		
		HostelThread hostelThread = new HostelThread();
		
		Thread hThread = new Thread(hostelThread,"hostel");//wiring
		hThread.start();//clicking
	}

}

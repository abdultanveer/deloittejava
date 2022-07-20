package threads;

public class HostelThread implements Runnable {

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName()+"--standing in hostel que");
		for(int i=1;i<5;i++){  
			try {
				Thread.sleep(300);
				System.out.println(i);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

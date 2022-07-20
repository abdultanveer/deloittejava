package threads;

public class FeeThread extends Thread {

	public FeeThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<3 ; i++) {
			System.out.println(i+Thread.currentThread().getName()+"--im standing in fee que");
		}
	}

}

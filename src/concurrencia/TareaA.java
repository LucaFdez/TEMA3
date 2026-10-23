package concurrencia;

public class TareaA implements Runnable{ //extends Thread
	
	@Override 
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("A: " + i);
			//!Thread.currentThread().isInterrupted())
			try {
				Thread.sleep(1000); //Thread en mayúscula por STATIC ??
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

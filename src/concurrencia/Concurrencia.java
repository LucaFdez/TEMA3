package concurrencia;

public class Concurrencia {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Thread a = new TareaA();
		//Thread b = new TareaB();
		
		Runnable tareaA = new TareaA();
		Runnable tareaB = new TareaB();
		
		Thread a  = new Thread(tareaA);
		Thread b = new Thread(tareaB);
		
		a.start(); //NO run(), Lo estaríamos haciendo secuencial 
		b.start();
		//Si pongo el join justo después de a.start, irá primero a y luego b
		//no hago concurrencia
		
		//a.interrupt();
		//b.interrupt();
		
		//Thread.sleep(10000);
		
		a.join();
		b.join();
		
		System.out.println("trabajo terminado.");
		
	}	
	
}

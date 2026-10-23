package condicion.carrera;

public class Incrementador extends Thread{
	
	Contador c;
	//Object cerrojo = new Object(); 
	/*En este momento se están creando dos cerrojos
	 * uno para cada thread, por lo tanto el synchronized no funciona*/
	
	public Incrementador(Contador c) {
		this.c = c;
	}
	@Override
	public void run() {
		for(int i = 0; i < 100000; i++) {
			c.incrementar(/*cerrojo*/);
		}
	}
}

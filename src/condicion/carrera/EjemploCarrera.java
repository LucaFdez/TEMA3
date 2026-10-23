package condicion.carrera;

public class EjemploCarrera {
	
	public static void main(String[] args) throws InterruptedException {
		Contador c = new Contador();
		Thread i1 = new Incrementador(c);
		Thread i2 = new Incrementador(c);
		
		i1.start();
		i2.start();
		
		i1.join();
		i2.join();
		
		System.out.println(c.getValor());
	}
}

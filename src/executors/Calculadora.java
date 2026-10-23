package executors;

public class Calculadora {
	
	public static void main(String[] args) throws InterruptedException {
		HebraCalculo a = new HebraCalculo(4,5);
		HebraCalculo b = new HebraCalculo(4,5);
		
		a.start();
		b.start();
		
		a.join(); 
		b.join(); //lo necesitamos para que no imprima antes de terminar
		
		System.out.println(a.getRes() + b.getRes());
	}
}

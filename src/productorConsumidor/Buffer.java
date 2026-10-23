package productorConsumidor;

public class Buffer {
	//cosa que hacemos poco en la asignatura porque se da ya hecho
	
	/*Productor (Sensor)
	 * Consumidor(Sensor)
	 * Buffer -> Un dato ( int dato)
	 * 
	 * Guardar solo si Buffer vacío
	 * Sacar solo cuando Buffer lleno
	 * */
	
		private int dato = -1; //como dato nulo
		private boolean lleno = false;
		
		//Hebra Productora -> P
		public synchronized boolean guardar(int dato) {
			if(!lleno) {
				this.dato = dato;
				this.lleno = true;
				System.out.println("Guardado valor: " + dato);
				return true;
			}
			return false;
		}
		
		//Hebra consumidora ->C
		public synchronized int sacar() {
			if(lleno) {
				this.lleno = false;
				System.out.println("Sacado valor: " + dato);
				return dato;
			}
			return -1; //nos vemos obligado a ponerlo porque lo estamos haciendo con un int
			
		}
}

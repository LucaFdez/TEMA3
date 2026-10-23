package condicion.carrera;

public class Contador {

	private int valor = 0; 
	/*privado porque tenemos clases que van a intentar acceder de 
	 * forma simultánea y lo vamos a proteger para que no lo puedan
	 * acceder cuando sea
	 */
	
	public /*synchronized*/ void incrementar(/*Object cerrojo*/ ) {
		//cálculo costoso
		synchronized (/*cerrojo*/ this) { //ambos threads necesitan usar el mismo cerrojo (mismo objeto)
			//usar this es una forma común,
			valor++; //Región crítica -> Debo aplicar exclusión mutua
		}
		/* int tmp= valor; -> Leyendo valor
		 * tmp = tmp + 1; ->Calculando nuevo valor
		 * valor = tmp; -> Actualizando valor 
		 * 
		 * i1 leo 0; i2 leo 0
		 * i1 calculo 1; i2 calculo 1
		 * i1 actualizo valor; i2 actualizo valor 
		 * 
		 * Operación no atómica -> Condición de carrera
		 * 
		 * Cerrojo (lock) -> poniendo synchronized 
		 */
	}
	
	public int getValor() {
		return this.valor;
	}
	
}

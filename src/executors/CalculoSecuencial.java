package executors;

public class CalculoSecuencial {
	
	public static int calculo (int lo, int hi) {
		
		int res = 0;

		for(int i = 0; i < 10; i++) {
			res+= i * i;
		}
		return res;
	}
	

}

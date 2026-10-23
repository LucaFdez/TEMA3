package executors;

public class HebraCalculo extends Thread{
	
	private int lo;
	private int hi;
	private int res;
	
	public HebraCalculo(int lo, int hi) {
		this.lo = lo;
		this.hi = hi;
	}
	@Override
	public void run() {
		//res = CalculoSecuencial.calculo(lo, hi); UNA OPCIÓN
		res = 0;
		for(int i = lo; i < hi; i++) {
			res+= i * i;
		}
		//return res; //No puedo porque es un void 
	}
	
	
	public int getRes() {
		return res;
	}

}

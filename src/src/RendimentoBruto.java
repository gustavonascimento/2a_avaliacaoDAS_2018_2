package src;

public class RendimentoBruto {
	private double n;
	private double p;
	private double i;
	private double rb;
	

	public RendimentoBruto(double n, double p, double i) {
		this.n = n;
		this.p = p;
		this.i = i;
		}

	public static double gerarRendimentoBruto(double n, double p, double i) {
		
		double rb = (((i / 100)/365) * p) * n; 
		return rb;
	}
	
	public static double gerarImposto(int n, double p, double i) {
		return	gerarRendimentoBruto(n, p, i) * al(n);
	}
	
	private static double al(int dias) {
		if (dias <=180 ) {
			
			return 0.225;
		
		}else if(dias <= 360) {
		
			return 0.2;
		
		}else if(dias <= 720) {
		
			return 0.175;
		
		}else {
		
			return 0.15;
		}
	}

	

}

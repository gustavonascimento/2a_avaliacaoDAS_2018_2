package src;

public class RendimentoBruto {
	

	public static double gerarRendimentoBruto(double n, double p, double i) {
		
		double rb = (((i / 100)/365) * p) * n; 
		return rb;
	}
	

}

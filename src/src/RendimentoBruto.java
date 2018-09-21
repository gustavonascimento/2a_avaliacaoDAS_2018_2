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
	

}

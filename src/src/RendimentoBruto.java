package src;

public class RendimentoBruto {
	
	private double i;
	private double p;
	private double n;
	private static double rb;
	
	public RendimentoBruto(double i, double p, double n) {
		this.i = i;
		this.p = p;
		this.n = n;
	}

	public static RendimentoBruto gerarRendimentoBruto(double d, double p, double n) {
		rb = d * p * n;
		
		return null;
	}

}

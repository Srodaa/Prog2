package org.example;

public class HaromszogExcpetion extends Exception {
	private double a;
	private double b;
	private double c;

	private double alfa;
	private double beta;
	private double gamma;

	public HaromszogExcpetion(String message, double a, double b, double c, double alfa, double beta, double gamma) {
		super(message);
		this.a = a;
		this.b = b;
		this.c = c;
		this.alfa = alfa;
		this.beta = beta;
		this.gamma = gamma;
	}

	public HaromszogExcpetion(String message) {
		super(message);

	}

	public HaromszogExcpetion(String message, double a, double b, double c) {
		super(message);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HaromszogExcpetion [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append(", c=");
		builder.append(c);
		builder.append(", alfa=");
		builder.append(alfa);
		builder.append(", beta=");
		builder.append(beta);
		builder.append(", gamma=");
		builder.append(gamma);
		builder.append("]");
		return builder.toString();
	}
	
	

}

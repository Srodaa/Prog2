package org.example;

public class Haromszog {
	private double a;
	private double b;
	private double c;

	private double alfa;
	private double beta;
	private double gamma;

	private double szog(double oSz, double o1, double o2) {
		//System.out.println(oSz+" "+o1+" "+o2);
		return /*Math.toDegrees(*/ Math.acos((oSz * oSz - o1 * o1 - o2 * o2) / (-2*o1 * o2))/*)*/;
	}

	public Haromszog(double a, double b, double c) throws HaromszogExcpetion {
		super();
		if (a <= 0 || b <= 0 || c <= 0)
			throw new HaromszogExcpetion("az oldal kisebb, mint 0", a, b, c);

		if (!((a + b > c) && (a + c > b) && (b + c > a)))
			throw new HaromszogExcpetion("a hsz egyenlőtlenseg nem teljesul", a, b, c);

		this.a = a;
		this.b = b;
		this.c = c;

		if (this.c < this.a) {
			double cs = this.c;
			this.c = this.a;
			this.a = cs;
		}

		if (this.c < this.b) {
			double cs = this.c;
			this.c = this.b;
			this.b = cs;
		}

		if (this.b < this.a) {
			double cs = this.a;
			this.a = this.b;
			this.b = cs;
		}

		this.alfa = this.szog(a, b, c);
		this.beta = this.szog(b, a, c);
		this.gamma = this.szog(c, a, b);
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getAlfa() {
		return alfa;
	}

	public double getBeta() {
		return beta;
	}

	public double getGamma() {
		return gamma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Haromszog [a=");
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

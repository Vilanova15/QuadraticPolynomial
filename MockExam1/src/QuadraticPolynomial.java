public class QuadraticPolynomial {
	private double a; // quadratic coefficient
	private double b; // linear coefficient
	private double c; // constant coefficient

	//Constructors
	public QuadraticPolynomial(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		//Error fixed: Missing 'this' keyword to specify instance variables a,b,c
	}

	public QuadraticPolynomial(double abc) {
		this.a = abc;
		this.b = abc;
		this.c = abc;
	}

	//Getters
	public double getA() { return a; }
	public double getB() { return b; }
	public double getC() { return c; }

	// Setters
	public void setA(double a) { this.a = a; }
	public void setB(double b) { this.b = b; }
	public void setC(double c) { this.c = c; }

	//Instance method: evaluates target polynomial using the specified value x
	public double eval(double x) {
/*		double resultValue = (this.a * Math.pow(x, 2)) + (this.b * x) + this.c;
		return resultValue;*/
		return (this.a * Math.pow(x, 2)) + (this.b * x) + this.c;
	}

	//Instance method: calculates the discriminant of a polynomial
	public double discriminant() {
/*		double discriminant = (Math.pow(this.b, 2)) - (4 * this.a * this.c);
		return discriminant;*/
		return (Math.pow(this.b, 2)) - (4 * this.a * this.c);
	}

	//Instance method: creates a new polynomial, which is a scaled version of the original polynomial
	public QuadraticPolynomial scale(double scalar) {
		/*QuadraticPolynomial newPoly = new QuadraticPolynomial(this.a*scalar, this.b*scalar, this.c*scalar);
		return newPoly;*/
		return new QuadraticPolynomial(this.a*scalar, this.b*scalar, this.c*scalar);
	}

	//Instance method: creates a new polynomial, which is the addition of the original polynomial and a second polynomial p
	public QuadraticPolynomial add(QuadraticPolynomial p) {    
/*		QuadraticPolynomial newPoly = new QuadraticPolynomial(this.a+p.a, this.b+p.b, this.c+p.c);
		return newPoly;*/
		return new QuadraticPolynomial(this.a+p.a, this.b+p.b, this.c+p.c);
	}

}
package work01;

public class Circle extends Shape {
	double r;
	
//	 public Circle(double r) {
//		 this(new Point(0, 0), r);
//	 }
//	 public Circle(Point p, double r) {
//		 super(p);
//		 this.r = r;
//	 }
	public Circle() {
	}
	
	public Circle(double r) {
		this.r = r;
	}
		
	@Override
	public double calcArea() {
//		double s = r * r * Math.PI;
		return Math.PI * r * r;
	}

}

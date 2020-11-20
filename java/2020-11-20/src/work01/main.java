package work01;

public class main {
	public static void main(String[] args) {
		Shape circle = new Circle(3.0);
		System.out.println(circle.calcArea());
		
		Shape rect = new Rectangle(23, 34);
		System.out.println(rect.calcArea());
		System.out.println("정사각형: " + ((Rectangle)rect).isSquare());
		
		Point p = new Point(10,12);
		Shape base = new Shape(p) {	// 삼각형

			@Override
			double calcArea() {	
				return (p.getX() * p.getY())/2;
			}
		};
		System.out.println(base.calcArea());
	
	}
	
}

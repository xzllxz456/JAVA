package work01;

public class Rectangle extends Shape {
	int width;
	int height;
	
//	public Rectangle(int width, int height) {
//		this(new Point(0, 0), width, height);
//	}
//	public Rectangle(Point p, int width, int height) {
//		super(p);
//		this.height = height;
//		this.width = width;
//	}
	public Rectangle() {
	}
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double calcArea() {
		return width * height;
	}
	
	public boolean isSquare() {
//		if(width == height) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return (width == height) && width * height != 0;
	}

}

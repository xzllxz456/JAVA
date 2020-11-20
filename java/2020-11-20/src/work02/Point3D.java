package work02;

public class Point3D {
	int x,y,z;
	Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	Point3D() {
		this(0,0,0);
	}

	public boolean equals(Object obj) {
		/*
	(1) 인스턴스변수 x, y, z를 비교하도록 오버라이딩하시오.
		 */
		Point3D p = (Point3D) obj;
//		if(p.x == this.x && p.y == this.y && p.z == this.z) {
//			return true;
//		}
//		return false;
		return p.x == this.x && p.y == this.y && p.z == this.z;
	}
	public String toString() {
		/*
		(2) 인스턴스변수 x, y, z의 내용을 출력하도록 오버라이딩하시오.
		*/
		String toString = x + "" + y + "" + z + "";
		return toString;
	}
}

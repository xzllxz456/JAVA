package Function;


public class FuncEx {
//	static double getDistance(int x1, int y1, int x2, int y2) {
//		double func = (double)(((y2-y1) * (y2-y1)) + ((x2 - x1) * (x2 - x1)));
//		
	//루트: Math.sqrt
	//승수: Math.pow
//		return Math.sqrt(func);
//	}
	static double getDistance(int x1, int y1, int x2, int y2) {
//		double value;
//		value = Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2);
//		value = Math.sqrt(value);
//		return value;
		
		return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
	}
	public static void main(String[] args) {
		/*
		 	(x1,y1) (x2,y2)
		 	
		 	루트((y2-y1) 제곱 + (x2 - x1)제곱)
		 	함수			함수
		 */
		int x1, y1, x2, y2;
		double result;
		x1= 0;
		y1= 0;
		x2= 1;
		y2= 1;
		result = getDistance(x1, y1, x2, y2);
		System.out.println("두점의 거리: " + result);
		System.out.println(getDistance(1,1,2,2));
		
	}
}

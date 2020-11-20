package Tree;

public class mainClassss {
	public static void main(String[] args) {
		
//		Integer i = new Integer(123);
//		int num = i;
//		System.out.println("num = " + num);		// 인스턴스에 바로 값을 넣을려고 래퍼클래스 사용
		
//		NodeTreeClass nodeTr1 = new NodeTreeClass(1);
		NodeTreeClass nodeTr1 = new NodeTreeClass(new Integer(111));
		
		NodeTreeClass nodeTr2 = new NodeTreeClass(222);
		
		nodeTr1.makeLeftSubTree(nodeTr2);	// 왼쪽에 넣기
		
		NodeTreeClass nodeTr3 = new NodeTreeClass(333);
		
		nodeTr1.getLeftSubTree().makeRightSubTree(nodeTr3); 	// 222오른쪽에 333넣기!
		
	}
}

package Tree;

public class NodeTreeClass {
	private Object data;		// 제일 꼭대기
	private NodeTreeClass left;
	private NodeTreeClass right;	
	
	// 재귀호출로 자기 자신을 부름
	
	public NodeTreeClass(Object data) {
		left = null;
		right = null;
		this.data = data;
	}
	
	// 왼쪽 자식 Node와 연결해주는 메소드
	public void makeLeftSubTree(NodeTreeClass sub) {
		this.left = sub;
	}
	
	public void makeRightSubTree(NodeTreeClass sub) {
		this.right = sub;
	}

	public Object getData() {
		return data;
	}
	
	public NodeTreeClass getLeftSubTree() {
		return this.left;
	}
	
	public NodeTreeClass getRightSubTree() {
		return this.right;
	}
	
}

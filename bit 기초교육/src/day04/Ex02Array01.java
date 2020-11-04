package day04;
// 배열
// 배열은 지정된 크기만큼 똑같은 데이터타입의 변수를 관리하는
// 하나의 커다란 변수이다.

public class Ex02Array01 {
	public static void main(String[] args) {
		//배열 선언 방법
		//데이터타입[] 이름 = new 데이터타입[크기];
		int[] array = new int[5];
		
		//생성자와 마찬가지로
		//배열도 기본형 데이터타입의 배열은
		//각 요소를 0으로 초기화하고
		//참조형 데이터타입의 배열은
		//각 요소를 null로 초기화한다.
		
		//배열의 크기는
		//배열이름.length로 알수 있다.
		
		for(int i = 0; i < array.length; i++) {
			//배열의 각 위치에 접근하기 위해서는
			//배열이름[위치 번호] 로 접근 가능하다.
			//위치 번호는 앞으로 index라고 부르자
			System.out.println(array[i]);
		}
		
		//배열이름[인덱스]는 하나의 변수이름처럼 사용가능하다
		//"어이 3번학생"
		
		array[0] = 3;
		array[1] = 23;
		array[2] = 4;
		array[3] = 6;
		array[4] = 12;
		//인덱스의 경우
		//범위가 0~크기-1까지이다.
		//만약 범위를 벗어나면 에러가 난다.
		//array[5] = 20; array의 크기가 5이므로 가장 마지막 인덱스는 4이기
		//때문에 에러가 난다.
		
		//하지만 배열은 더이상 쓰이지 않는다.
		//왜냐하면 배열은 크기가 고정되어있기 때문에
		//사용할때 불편하다
		//예시: 학생이 5명이었는데 6명으로 늘어나면...?
		//위의 예시는 임시배열을 만들어서 현재 배열의 내용을 
		//복사하고 
		//그리고 기존 배열의 크기를 늘린 후에
		//임시 배열의 내용을 다시 늘어난 배열에 복사해와야됨
		
		//또한 크기가 고정되어있다 + 빈칸에 0이나 null로 초기화한다.
		//이 두가지 이유 때문에 배열에서 빈칸을 찾아서 새로운 값을 넣어줄때도
		//불편한다.
		//for문을 돌려서 해당 칸이 0이거나 null이면 해당 index에 
		//새로운 값 입력
		
		//또한 배열의 개념은 2세대 언어에서 나왔기 때문에
		//객체의 배열 같은 경우에는 배열 선언 초기화 이후에
		//for문을 이용해서 각 칸에 생성자를 호출해주어야 한다.
		//즉 불편하다.
		
		Student[] studentArray = new Student[5];
		for(int i = 0; i < studentArray.length; i++) {
			System.out.printf("studentArray[%d]: "+studentArray[i]+"\n", i);   
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			studentArray[i] = new Student();
		}
		
		studentArray[0].setName("조재영");
		
		//그렇다면 우리가 배열 대신 쓸 친구는 누구일까......
		
	}
}









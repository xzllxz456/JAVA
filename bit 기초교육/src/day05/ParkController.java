package day05;
// 컨트롤러 클래스는
// 뷰로부터 들어온 요청에 맞추어 
// 메소드를 실행해서 데이터베이스로부터 데이터를 받아와서
// 뷰로 데이터를 가공해서 보내준다.
// 하지만 우리는 데이터베이스가 없기 때문에
// 여러개의 데이터를 관리할 수 있는
// 어레이리스트를 필드로 하나 가지고 있고
// 그 필드에 추가, 삭제, 불러오기 등의 기능을 컨트롤러 메소드를 통해서
// 만들어주자

import java.util.ArrayList;

public class ParkController {
	private ArrayList<ParkVO> list;
	
	//생성자를 만들어서 그 생성자가 
	//ArrayList의 생성자를 불러오게 해주자
	public ParkController() {
		list = new ArrayList<>();
	}
	
	//1. 현재 리스트의 크기를 반환하는 size() 메소드
	public int size() {
		return list.size();
	}
	
	//2. 파라미터로 넘어온 ParkVO 객체가 존재하는지 체크하는
	//   contains() 메소드
	public boolean contains(ParkVO p) {
		return list.contains(p);
	}
	
	//3. 파라미터로 넘어온 ParkVO 객체를 리스트에 추가하는
	//   add() 메소드
	public void add(ParkVO p) {
		list.add(p);
	}
	
	//4. 입력된 시간이 유효한지 체크하는 
	//   validateTime()
	public boolean validateTime(int time) {
		int hour = time / 100;
		int minute = time % 100;
		
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			return true;
		}else {
			return false;
		}
	}
	
	//5. 파라미터로 넘어온 객체에
	//   해당 객체와 일치하는 리스트의 객체의 inTime을
	//   입력하는 insertInTime() 메소드
	public void insertInTime(ParkVO p) {
		// 1. list에서 현재 객체와 일치하는 객체의 index를 찾는다.
		int index = list.indexOf(p);
		// 2. 해당 객체의 inTime을 p의 inTime에 넣는다.
		p.setInTime(list.get(index).getInTime());
	}
	
	// 6. 파라미터로 넘어온 ParkVO 객체 p를
	//    리스트에서 삭제하는 remove() 메소드
	public void remove(ParkVO p) {
		list.remove(p);
	}
}


















package day05;
// MVC 패턴

// MVC 패턴이란 
// 클래스를 크게 Model, View, Controller 3가지 분류로 나누어서
// 프로젝트의 유지보수를 쉽게 하는 프로그래밍 개발 방법이다.
// 모델: 컨트롤러가 요청한 데이터를 데이터베이스로부터 받아와서
//      클래스의 형태로 만들어준다.
// 뷰: 사용자가 보는 화면. 사용자가 요청을 보내는 지점이다.
// 컨트롤러: 사용자가 보낸 요청을 받아서 데이터를 가공하는 중간다리

public class ParkVO {
	// 모델 클래스
	// 모델의 경우 주로 Value Object를 줄여서 VO나
	// Data Transfer Object를 줄여서 DTO 라는 접미사가 붙는다.
	// 또한 모델의 경우에는 필드, 겟터/셋터, java.lang.Object 메소드를 오버라이드한
	// 메소드 정도만 들어가는 매우 간단한 형태가 된다.

	private String number;
	private int inTime;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public boolean equals(Object o) {
		if (o instanceof ParkVO) {
			ParkVO p = (ParkVO) o;
			if (this.number.equals(p.number)) {
				return true;
			}
		}

		return false;
	}
}

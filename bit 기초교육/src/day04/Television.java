package day04;
// 텔레비젼 클래스
public class Television {
	//필드
	private int channel;
	private int volume;
	private String serialNumber;
	//메소드
	//1. 볼륨 높이기
	void increaseVolume() {
		volume++;
	}
	//2. 리모콘으로 숫자를 누르면 그 숫자로 채널을 변경하는 기능
	void changeChannel(int newChannel) {
		channel = newChannel;
	}
	//3. 사용자가 현재 채널과 현재 볼륨의 수치를 알려달라고 하면
	//   스트링으로 보내주는 showInfo() 기능
	String showInfo() {
		return "현재 볼륨: "+volume+", 현재 채널: "+channel;
	}
	
	//생성자
	public Television(String serialNumber, int channel, int volume) {
		System.out.println("생성자 호출");
		this.channel = channel;
		this.volume = volume;
		this.serialNumber = serialNumber;
		System.out.println("생성자 종료");
	}
	
	public Television() {
		channel = -1;
		volume = -1;
		serialNumber = "아직 부여 안됨";
	}
	
	//getter/setter 만들기
	//channel getter/setter
	//setter
	public void setChannel(int channel) {
		this.channel = channel;
	}
	//getter
	public int getChannel() {
		return channel;
	}
	
	//volume getter/setter
	//setter
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//getter
	public int getVolume() {
		return volume;
	}
	
	//serialNumber getter/setter
	//setter
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	//getter
	public String getSerialNumber() {
		return serialNumber;
	}
	
	//equals() 오버라이드하기
	public boolean equals(Object o) {
		//equals() 메소드는
		//파라미터로 모든 클래스의 객체를 받을수 있다.
		//단, 메소드 내부에서는 다음과 같은 과정을 거친다.
		//1. 파라미터로 넘어온 오브젝트 객체가
		//   해당 클래스의 객체인지 확인
		//2. 파라미터로 넘어온 객체가 똑같은 클래스의 객체이더라도
		//   Object가 데이터타입이기 때문에, 우리가 해당 객체의 필드에
		//   접근하기 위해서는 명시적 형변환을 통해서 껍질을 덮어씌어야 하므로
		//   클래스 객체 = (클래스)o; 라고 적어주낟.
		//3. 이렇게 타입캐스팅을 통해서 해당 클래스 객체로 바꾸고 나서는
		//   정말 필요한 필드의 값들이 같다면 return true한다.
		//4. 그 외의 모든 경우는 아무런 작업도 안해준다!
		//   왜냐하면 가장 마지막줄에 우리가 return false를 적어줄 거기 때문이다.
		
		//1. 같은 클래스 객체인지 확인하기
		//이때는 instanceof 라는 예약어를 통해서 
		//null이 아니고 Television 클래스 객체이면 true,
		//그 외에는 모두 false가 나온다.
		if(o instanceof Television) {
			//2. o를 Television 객체로 바꾸기
			Television t = (Television)o;
			//3. 특정 필드값 비교하기
			if(this.channel == t.channel 
					&& this.serialNumber.equals(t.serialNumber)) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
	
	
	//toString() public String toString()으로 선언되어있다.
	public String toString() {
		//우리가 이 안에서 필요한 형태의 
		//스트링을 만들어서 리턴해주면 된다.
		return "serialNumber: "+serialNumber+
				", channel: "+channel+
				", volume: "+volume;
	}
}











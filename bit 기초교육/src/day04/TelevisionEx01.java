package day04;

public class TelevisionEx01 {
	public static void main(String[] args) {
		// Television 객체 tv1을 만들어보자
		Television tv1 = new Television("파라미터", 100, 100);
		// 초기값 확인
		System.out.printf("채널: %d, 볼륨 %d, 시리얼 번호: %s\n", tv1.getChannel(), tv1.getVolume(), tv1.getSerialNumber());
		System.out.println(tv1.getSerialNumber().equals(""));
		// 객체의 메소드나 필드에 접근할땐
		// 객체. 으로 접근할 수 있다.

		// tv1 필드에 데이터를 넣어보자
		tv1.setChannel(9);
		tv1.setVolume(15);
		tv1.setSerialNumber("00가 0000");

		// tv1의 정보를 출력해보자
		// 우리가 Television 클래스에
		// showInfo()라는 현재 정보를 String으로 만들어서 보내주는
		// 메소드가 있으므로
		// System.out.println()의 파라미터에
		// tv1.showInf()를 넣어주면 된다.
		System.out.println("tv1: " + tv1.showInfo());

		// tv1의 볼륨 높이기 기능을 실행해보자
		tv1.increaseVolume();
		System.out.println("볼륨 높인 후");
		System.out.println("tv1: " + tv1.showInfo());

		// 채널을 바꿔보자
		tv1.changeChannel(6);
		System.out.println("채널 변경 후");
		System.out.println("tv1: " + tv1.showInfo());

		// 새로운 tv를 만들업자
		Television tv2 = new Television();
		tv2.setChannel(35);
		tv2.setVolume(100);
		tv2.setSerialNumber("11나 1111");

		// tv2의 볼륨을 높여보자
		tv2.increaseVolume();
		System.out.println("tv2 볼륨 증가");
		System.out.println("tv1: " + tv1.showInfo());
		System.out.println("tv2: " + tv2.showInfo());
		
		// 객체의 비교
		System.out.println("tv1.equals(tv2): "+tv1.equals(tv2));
		
		Television tv3 = new Television("99타 9999", 0, 0);
		Television tv4 = new Television("99타 9999", 0, 0);
		System.out.println("tv3.equals(tv4): "+tv3.equals(tv4));
		
		//System.out.println()의 파라미터로 객체를 주면 무슨일이 발생할까?
		System.out.println(tv3);
		//System.out.println()의 파라미터로 객체를 넘겨주면
		//해당 메소드가 파라미터로 넘어온 객체의 toString() 메소드의 결과값을
		//화면에 출력하게 한다.
		//하지만 우리가 toString()을 오버라이드 하지 않은 상태이면
		//java.lang.Object가 구현해놓은
		//패키지.클래스이름@메모리주소 가 출력되므로
		//우리가 원하는 결과가 아니다.
		//따라서 화면에 편하게 출력하기 위해서는
		//toString() 메소드를 클래스에 오버라이드 해야한다.
	}
}














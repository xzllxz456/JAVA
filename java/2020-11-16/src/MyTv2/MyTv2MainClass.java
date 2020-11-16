package MyTv2;

public class MyTv2MainClass {
	public static void main(String[] args) {

		MyTv2Class t = new MyTv2Class();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}
}

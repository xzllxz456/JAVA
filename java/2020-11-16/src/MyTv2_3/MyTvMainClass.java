package MyTv2_3;

public class MyTvMainClass {
	public static void main(String args[]) {
		MyTvClass t = new MyTvClass();
		t.setChannel(10);	// prevChannel = 0		channel = 10
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);	// prevChannel = 10		channel = 20
		System.out.println("CH:"+t.getChannel());
		
		
		t.gotoPrevChannel();// prevChannel == 20, channel = 10
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();// prevChannel == 10, channel = 20
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();// prevChannel == 20, channel = 10
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();// prevChannel == 10, channel = 20
		System.out.println("CH:"+t.getChannel());

	}

}


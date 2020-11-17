package OOP_Extends_Ex3;

public class mainClass {
	static void action(Robot action) {
		if(action instanceof DanceRobot) {
			((DanceRobot) action).dance();
//			DanceRobot a = (DanceRobot)action;
//			a.dance();
		}
		if(action instanceof SingRobot) {
			((SingRobot)action).sing();
//			SingRobot a = (SingRobot)action;
//			a.sing();
		}
		if(action instanceof DrawRobot) {
			((DrawRobot) action).draw();
//			DrawRobot a = (DrawRobot)action;
//			a.draw();
		}
	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(),
				new DrawRobot()};

		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
	}
}

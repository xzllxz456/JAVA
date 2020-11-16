package dice02;

public class diceMainClass {
	public static void main(String[] args) {
		/*
		 	필효한 요소(element)
		 	dice: 2개
		 		random(1 ~ 6)
		 		
		 	game loop
		 */
		Game g = new Game();
		g.gamePlay();
	}
}

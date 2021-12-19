import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		GameRuler gr = new GameRuler(new GameView(), new GuessTheNumberInner());
		
		gr.play();
		
	}
	
}

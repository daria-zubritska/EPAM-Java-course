import java.util.Scanner;

public class GameRuler {
	
	private Scanner sc = new Scanner(System.in);
	private GuessTheNumberInner gtn;
	private int correct = 0;
	
	public GameRuler(int min, int max){
		if(min == max) return;
		if(max > min) {
			gtn = new GuessTheNumberInner(min, max);
		}
		else {
			gtn = new GuessTheNumberInner(max, min);
		}
	}
	
	public GameRuler(){
		gtn = new GuessTheNumberInner();
	}
	
	public int checkAnswer(int answer) {
		if(gtn.getNum() - answer > 0) correct = 1;
		else if(gtn.getNum() - answer == 0) correct = 0;
		else correct = -1;
		return correct;
	}
	
	public void play() {
		int i = 1;
		
		
		
		do {
			System.out.println("Round " + i + "\nPlease write your answer:");
			int answer = 0;
			
			while(sc.hasNext()) {
				if(sc.hasNextInt()) {
					answer = sc.nextInt();
					
					if(gtn.inRange(answer)) break;
					else {
						System.out.println("Your answer should be in range");
						continue;
					}
				}
				
				System.out.println("Please write an integer value");
				String dummy = sc.next();
				continue;
				
			}
			
			checkAnswer(answer);
			
			if(correct == 1) {
				gtn.setNewMin(answer);
			}
			else if(correct == -1) {
				gtn.setNewMax(answer);
			}
			
			System.out.println(this.toString());
			
			i++;
			
		}while(correct != 0);
		
		System.out.println("You used " + i + " rounds to guess number " + gtn.getNum());
		
	}
	
	public String toString() {
		
		String ans = "the same! Congratulations!";
		
		if(correct == 1) {
			ans = "higher";
		}
		else if(correct == -1) {
			ans = "lower";
		}
		
		return gtn.toString() + " my number is " + ans;
	}

}

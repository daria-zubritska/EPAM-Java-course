import java.util.ArrayList;

public class GuessTheNumberInner {
	
	static final int MAX = 100;
	static final int MIN = 0;
	
	private int numToGuess;
	
	private int min = 0;
	private int max = 100;
	private ArrayList<Integer> arr = new ArrayList<>();
	
	public void setMinMax(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public void setValue() {
		numToGuess = (int)Math.ceil(Math.random()*(max - min - 1) + min);
	}
	
	public int getNum() {
		return numToGuess;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	public ArrayList<Integer> getStat() {
		return arr;
	}
	
	public boolean checkAnswer(int answer) {
		arr.add(answer);
		
		if(this.numToGuess - answer == 0) return true;
		else if(this.numToGuess < answer) {
			max = answer;
		}
		else{
			min = answer;
		}
		return false;
	}
	
}

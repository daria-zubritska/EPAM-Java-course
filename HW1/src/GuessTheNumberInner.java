import java.util.Random;

public class GuessTheNumberInner {
	
	static final int RAND_MAX = 32767;
	
	private Random rand;
	private int numToGuess;
	private int min = 0;
	private int max = 100;
	
	GuessTheNumberInner(int min, int max){
		rand = new Random();
		numToGuess = rand(min, max);
		this.min = min;
		this.max = max;
	}
	
	GuessTheNumberInner(){
		rand = new Random();
		numToGuess = rand();
		this.max = RAND_MAX;
	}
	
	public int rand(int bottom, int top) {
		return rand.nextInt(top - bottom + 1) + bottom;
	}
	
	public int rand() {
		return rand.nextInt(RAND_MAX);
	}
	
	public int getNum() {
		return numToGuess;
	}
	
	public void setNewMin(int newMin) {
		this.min = newMin;
	}
	
	public void setNewMax(int newMax) {
		this.max = newMax;
	}
	
	public boolean inRange(int n) {
		if(n >= min && n <= max) return true;
		return false;
	}
	
	public String toString() {
		return "Range[" + min + "; " + max + "]";
	}
	
}

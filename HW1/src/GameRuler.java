import java.util.Scanner;

public class GameRuler {
	
	private GuessTheNumberInner module;
	private GameView view;
	
	public GameRuler(GameView view, GuessTheNumberInner module){
		this.view = view;
		this.module = module;
	}
	
	public void play() {
		Scanner in = new Scanner(System.in);
		
		module.setMinMax(module.MIN, module.MAX);
		module.setValue();
		
		while(!module.checkAnswer(input(in)));
		
		view.printMessage(view.WIN_MESSAGE + module.getNum());
        view.printMessage(view.STATISTICS + module.getStat().toString());
		
	}
	
	private int input(Scanner in) {
		int val = 0;
		
		view.printMessage(getInputMess());
		
        while (true) {
            while (!in.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_MESSAGE + getInputMess());
                in.next();
            }
            if ((val = in.nextInt()) <= module.getMin() ||
                    val >= module.getMax()) {
                view.printMessage(view.WRONG_INPUT_MESSAGE + getInputMess());
                continue;
            }
            break;
        }
        
        return val;
	}
	
	private String getInputMess() {
        return view.concatenationString(
                view.INPUT_INT_MESSAGE, view.OPENING_BRACKET,
                String.valueOf(module.getMin()), view.SPACE,
                String.valueOf(module.getMax()),
                view.CLOSING_BRACKET, view.SPACE,
                view.EQUAL, view.SPACE );
    }

}

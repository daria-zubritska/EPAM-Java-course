
public class GameView {
    public static final String EQUAL = "=";
    public static final String SPACE = " ";
    public static final String OPENING_BRACKET = "[";
    public static final String CLOSING_BRACKET = "]";

    public static final String INPUT_INT_MESSAGE = "Input Integer value ";
    public static final String WRONG_INPUT_MESSAGE = "Wrong input! Repeat please! ";
    public static final String WIN_MESSAGE = "Congratulations! Secret value was indeed ";
    public static final String STATISTICS = "Your guesses were: ";
    
    public void printMessage(String message) {
    	System.out.println(message);
    }
    
    public String concatenationString (String... message){
        StringBuilder result = new StringBuilder();
        for (String v : message){
            result.append(v);
        }
        return result.toString();
    }
}

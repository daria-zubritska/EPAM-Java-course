import java.util.Scanner;

public class Utility {

	private Scanner in;
    private View view;

    public Utility(Scanner in, View view) {
        this.in = in;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        
        while( !(in.hasNext() && (res = in.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        
        return res;
    }
    
}

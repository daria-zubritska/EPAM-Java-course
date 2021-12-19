import java.util.Locale;
import java.util.ResourceBundle;

public class View {
	
	static String INPUT_STRING_DATA = "input.string.data";
	static String FIRST_NAME = "input.first.name.data";
	static String WRONG_INPUT_DATA = "input.wrong.data";
	static String LOGIN_DATA = "input.login.data"; 
	static String EXISTING_LOGIN_DATA = "input.login.exists.data"; 
	static String SUCCESSFUL_LOGIN_DATA = "successful.login.data"; 
	
	static String MESSAGES_BUNDLE_NAME = "resources.messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME);//, new Locale("ua", "UA"));
    
    public void printMessage(String message){
        System.out.println(message);
    }
    
    public String concatenationString (String... message){
        StringBuilder result = new StringBuilder();
        for (String v : message){
            result.append(v);
        }
        return result.toString();
    }
    
    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}

import java.util.Scanner;

public class Controller {
	
	private Module module;
	private View view;
	
	private final String ENTER_NAME = "enter your name";
	private final String ENTER_USERNAME = "enter your username";
	private final String NAME_PROB = "use english letters starting with one capital only";
	private final String USERNAME_PROB = "use english letters, numbers and _- only";
	private final String REG_NAME = "^[A-Z][a-z]+$";
	private final String REG_USERNAME = "[A-Za-z0-9_-]*";

	public Controller(Module module, View view) {
		
		this.module = module;
		this.view = view;
		
	}

	public void process() {
		Scanner in = new Scanner(System.in);
		view.message(ENTER_NAME);
		System.out.println("Please enter your name.");
		
		String name;
		String pass;
		
		while(!checkEnter(name = enter(in), REG_NAME, NAME_PROB));
		
		view.message(ENTER_USERNAME);
		
		while(!checkEnter(pass = enter(in), REG_USERNAME, USERNAME_PROB));
		
		module.addPerson(name, pass);
		
	}
	
	private boolean checkEnter(String ent, String reg, String problem) {
		boolean res = ent.matches(reg);
		
		if(!res) view.message(problem);
		return res;
	}
	
	private String enter(Scanner in) {
		String result = in.next();
		return result;
	}

}

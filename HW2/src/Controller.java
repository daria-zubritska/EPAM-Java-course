import java.util.Scanner;

public class Controller {
	
	private Model model;
	private View view;
	
    Scanner in = new Scanner(System.in);
	
	static String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
	static String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
	static String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

	public Controller(Model model, View view) {
		
		this.model = model;
		this.view = view;
		
	}
	
    public void process() {
        input();
    }
    
    public void input() {
        Utility utilityController =
                new Utility(in, view);
        
        String name;
        String login;
        
        //выбираем регекс в зависимости от языка пропертис
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? Controller.REGEX_NAME_UKR : Controller.REGEX_NAME_LAT;
        
        do {

        name = utilityController.inputStringValueWithScanner
                (View.FIRST_NAME, str);
        
        login = utilityController.inputStringValueWithScanner
                        (View.LOGIN_DATA, Controller.REGEX_LOGIN);
        
        try {
			model.addUser(name, login);
			
			view.printMessage(View.bundle.getString(View.SUCCESSFUL_LOGIN_DATA));
			
			break;
		} catch (ExistingLoginException e) {
			view.printMessage(e.getMessage());
		}
        
        }while(true);
    }

}

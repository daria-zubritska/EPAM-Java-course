import java.util.HashMap;

public class Model {
	private String firstName;
    private String login;
    
    private HashMap<String, String> map = new HashMap<>();
    
    public Model(){
    	map.put("tarasik123", "Taras");
    	map.put("karasik777", "Taras");
    	map.put("kakakaksha", "Nikola");
    }
    
    public void addUser(String name, String login) throws ExistingLoginException{
    	if(map.containsKey(login)) throw new ExistingLoginException(View.bundle.getString(View.EXISTING_LOGIN_DATA));
    	
    	map.put(login, name);
    }
    
    
}

class ExistingLoginException extends Exception{
	
    public ExistingLoginException (String str){  
        super(str);  
    }  
}
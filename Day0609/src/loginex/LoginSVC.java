package loginex;

import java.util.*;

public class LoginSVC {

	private HashMap<String, String> loginDatum;
	private HashMap<String, UserVO> userDatum;
	
	public LoginSVC() {
		
		loginDatum = new HashMap<String, String>();
		userDatum = new HashMap<String, UserVO>();
		
		loginDatum.put("gamja", "gamja");
		userDatum.put("gamja", new UserVO("gamja", "gamja", "daelim", 22, "JangIBin"));
		
	}
	
	public UserVO login(String id, String passwd) {
		
		UserVO user = null;
		
		if(loginDatum.containsKey(id)) {
			if(loginDatum.get(id).equals(passwd)) {
				user = userDatum.get(id);
			}
		}
		return user;
	}
	
}

package Concrete;

import Abstracts.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService{

	public boolean CheckIfRealPerson(User user)  {
		return true;
	}
		
}

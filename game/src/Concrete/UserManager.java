package Concrete;

import Concrete.UserCheckManager;
import Abstracts.UserCheckService;
import Abstracts.UserService;
import Entities.User;
import game.MernisServiceAdapter;

public class UserManager implements UserService {
	private UserCheckManager userCheckManager;
	
	public UserManager(MernisServiceAdapter mernisServiceAdapter) {

	}

	public void addUser(User user)  {
	       
		System.out.println(user.getName() + " kullanicisi eklendi.");
	       
	     
	}
	
	public void deleteUser(User user) {
		
		System.out.println(user.getName() + " kullanicisi silindi.");
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getName() + " kullanicisi guncellendi.");

	}
	
}

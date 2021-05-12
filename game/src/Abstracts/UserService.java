package Abstracts;

import Entities.User;

public interface UserService {

	void addUser(User user)  ;
	void deleteUser(User user);
	void updateUser(User user);
}

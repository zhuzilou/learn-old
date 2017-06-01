package service;

import model.User;

public interface IUserService {
	User getUserById(int userId);

	int saveUser(User user);

	int deleteUser(User user);
}

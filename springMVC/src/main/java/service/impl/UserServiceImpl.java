package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserMapper;
import model.User;
import service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	public int saveUser(User user) {
		return this.userDao.insert(user);
	}

	@Override
	public int deleteUser(User user) {
		return this.userDao.deleteByPrimaryKey(user.getId());
	}
}

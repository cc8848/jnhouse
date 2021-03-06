package com.jnhouse.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jnhouse.app.bean.User;
import com.jnhouse.app.dao.UserDao;
import com.jnhouse.app.dao.UserInfoDao;
import com.jnhouse.app.dto.UserInfoDto;
import com.jnhouse.app.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Resource
	private UserDao userDao;
	
	@Resource
	private UserInfoDao userInfoDao;
	
	@Override
	public int save(User entity) {
		// TODO Auto-generated method stub
		return userDao.save(entity);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

	@Override
	public int update(User entity) {
		// TODO Auto-generated method stub
		return userDao.update(entity);
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return userDao.findUser(user);
	}

	@Override
	public List<UserInfoDto> findUserByName(String username) {
		// TODO Auto-generated method stub
		return userInfoDao.findUserByName(username);
	}

}

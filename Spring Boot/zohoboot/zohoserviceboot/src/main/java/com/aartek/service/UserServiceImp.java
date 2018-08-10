package com.aartek.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.interfacerepository.UserRepositories;
import com.aartek.model.User;
import com.aartek.serv.dao.UserServiceInt;

@Service
@Transactional
public class UserServiceImp implements UserServiceInt{
	
	@Autowired
	private UserRepositories userrepositories; 
	
	final static Logger logger = Logger.getLogger(UserServiceImp.class);

	public String addUser(User user) {

		logger.warn("Inside Service : createUser");
		logger.warn(user.getEmail());
		logger.warn(user.getPassword());
		
		userrepositories.save(user);
		return "Record Inserted";
	}

	public List<User> checkLogin(User user) {
		List<User> list = userrepositories.findByEmailAndPassword(user.getEmail(), user.getPassword());

		return list;
	}

	public List<User> findAll() {
		return (List<User>) userrepositories.findAll();
	}

	
}

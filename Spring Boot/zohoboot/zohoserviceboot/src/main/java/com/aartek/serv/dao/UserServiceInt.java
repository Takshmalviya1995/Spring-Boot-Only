package com.aartek.serv.dao;

import java.util.List;

import com.aartek.model.User;

public interface UserServiceInt{

	 public String addUser(User user);
	  public List<User> checkLogin(User user);
	  public List<User> findAll();
}

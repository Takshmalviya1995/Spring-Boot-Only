package com.aartek.interfacerepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aartek.model.User;

public interface UserRepositories extends CrudRepository<User, Long>{
	List<User> findByEmailAndPassword(String email,String password);
}

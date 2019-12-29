package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Users;

public interface UsersService {
	public int register(Users users);
	public List<Users> getUsersList();
	public int login(Users users);
}

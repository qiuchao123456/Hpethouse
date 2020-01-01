package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Users;


@Mapper
public interface UsersMapper {
	
	public Users selectUsersByUsersname(String uName);
	
	public int inserUsers(Users users);
	
	public List<Users> selectAllUsersList();
	
	public int loginUsers(Users users);
	
}

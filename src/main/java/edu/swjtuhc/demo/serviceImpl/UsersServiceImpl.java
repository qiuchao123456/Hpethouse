package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UsersMapper;
import edu.swjtuhc.demo.model.Users;
import edu.swjtuhc.demo.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersMapper usersMapper;//注入usersMapper对象
	
	@Override
	public int register(Users users) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
				Users u0 = usersMapper.selectUsersByUsersname(users.getuName());
				int i=-1;
				if(u0==null) {
					i=usersMapper.inserUsers(users);
				}else {
					i = 2;
				}
				
				return i;
			}
	
	//调用mapper实现查询语句
	@Override
	public List<Users> getUsersList() {
		// TODO Auto-generated method stub
		return usersMapper.selectAllUsersList();
	}

	@Override
	public int login(Users users) {
		// TODO Auto-generated method stub
		//调用mapper实现登录
		Users u0=usersMapper.selectUsersByUsersname(users.getuName());
		int i=-1;
		if(u0==null) {
			i=2;
		}else {
			i=1;
		}
		
		return i;
	}
}
package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Users;
import edu.swjtuhc.demo.service.UsersService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	UsersService usersService;//注入usersService对象
	
	//用户注册
		@RequestMapping("/register")
		public JSONObject register(@RequestBody Users users) {
			JSONObject result = new JSONObject();
			
			//调用Service层
			int i=usersService.register(users);
			result.put("state", i);
			return result;
		}
	//获取用户列表
		@RequestMapping("/getList")
		public List<Users> getList(){
			
			//调用Service层
			return usersService.getUsersList();
		}
	//用户登录
		@RequestMapping("/login")
		public JSONObject login(@RequestBody Users users) {
			JSONObject result = new JSONObject();
			
			//调用Service层
			int i = usersService.login(users);
			result.put("state", i);
			return result;
		}
}

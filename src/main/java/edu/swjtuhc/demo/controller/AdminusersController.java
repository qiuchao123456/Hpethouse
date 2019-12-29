package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Adminusers;
import edu.swjtuhc.demo.service.AdminusersService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/adminusers")
public class AdminusersController {
	@Autowired
	AdminusersService adminusersService;//注入adminusersService对象
	
	//管理员登录
	@RequestMapping("/adminlogin")
	public JSONObject adminlogin(@RequestBody Adminusers adminusers) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = adminusersService.adminlogin(adminusers);
		result.put("state", i);
		return result;
	}
	//获取管理员列表
	@RequestMapping("/getList")
	public List<Adminusers> getList(){
		
		//调用Service层
		return adminusersService.getAdminusersList();
	}
}

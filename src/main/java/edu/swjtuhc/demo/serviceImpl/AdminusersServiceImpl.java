package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AdminusersMapper;
import edu.swjtuhc.demo.model.Adminusers;
import edu.swjtuhc.demo.service.AdminusersService;


@Service
public class AdminusersServiceImpl implements AdminusersService{

	@Autowired
	AdminusersMapper adminusersMapper;//注入adminusersMapper对象
	
	@Override
	public int adminlogin(Adminusers adminusers) {
		// TODO Auto-generated method stub
		//调用mapper实现登录
		Adminusers u0=adminusersMapper.selectAdminusersByAdminusersname(adminusers.getaName());
		int i=-1;
		if(u0==null) {
			i=2;
		}else {
			i=1;
		}	
		return i;
	}

	@Override
	public List<Adminusers> getAdminusersList() {
		// TODO Auto-generated method stub
		//调用mapper实现查询语句
		return adminusersMapper.selectAllAdminusersList();
	}
	
}

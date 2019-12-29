package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Adminusers;

@Mapper
public interface AdminusersMapper {
	public Adminusers selectAdminusersByAdminusersname(String aName);
	
	public List<Adminusers> selectAllAdminusersList();
}

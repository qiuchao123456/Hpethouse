package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Adminusers;

public interface AdminusersService {
	public int adminlogin(Adminusers adminusers);
	public List<Adminusers> getAdminusersList();
}

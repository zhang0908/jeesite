package com.thinkgem.jeesite.usrmng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkgem.jeesite.modules.sys.entity.Role;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.usrmng.dao.RoleMngDao;
import com.thinkgem.jeesite.usrmng.dao.UserMngDAO;

@Service
public class TaskMngService {
	
	@Autowired
	public UserMngDAO userMngDao;
	
	@Autowired
	public RoleMngDao roleMngDao;
	
	public String getTaskByIdSvr(String userId) {
		
		Role role = new Role();
		role.setName("aaaa");
		
		role = roleMngDao.getByName(role);
		
		User user = userMngDao.getUserByIdDAO(userId);
		
		return "asdf";
		
	}

}

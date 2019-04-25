package com.thinkgem.jeesite.usrmng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkgem.jeesite.modules.sys.dao.LogDao;
import com.thinkgem.jeesite.modules.sys.dao.UserDao;
import com.thinkgem.jeesite.modules.sys.entity.Log;
import com.thinkgem.jeesite.modules.sys.entity.Role;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.usrmng.dao.RoleMngDao;
import com.thinkgem.jeesite.usrmng.dao.UserMngDAO;

@Service
public class UserMngService {
	
	@Autowired
	public UserMngDAO userMngDao;
	
	@Autowired
	public RoleMngDao roleMngDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private LogDao logDao;
	
	public String getUserNameByIdSvr(String userId) {
		
//		Role role = new Role();
//		role.setName("aaaa");
//		
//		role = roleMngDao.getByName(role);
		
		Log log = new Log();
		
		log.setId("adsfasdfafd");
		
		log.setDelFlag("asdfsadf");
		
		logDao.insert(log);
		
		User user = userMngDao.getUserByIdDAO(userId);
		
		List<User> list = userDao.findList(user);
		
		return user.getName();
		
	}

}

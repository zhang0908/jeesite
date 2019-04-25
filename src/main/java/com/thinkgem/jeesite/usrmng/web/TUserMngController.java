package com.thinkgem.jeesite.usrmng.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.modules.sys.entity.Role;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.service.SystemService;
import com.thinkgem.jeesite.usrmng.service.UserMngService;

@Controller
@RequestMapping(value = "tusermng")
public class TUserMngController {
	
	@Autowired
	public UserMngService userService;
	
//	@Autowired
//	private SystemService systemService;

	@RequestMapping(value = {"getUserNameById"})
	public String getUserNameByIdCtrl(String userId) {
		
//		System.out.println("zhangjian111111111111");
		

//		List<User> userList = systemService.findUser(new User(new Role("111111111111")));
		
		return userService.getUserNameByIdSvr(userId);
		
	}
	
}

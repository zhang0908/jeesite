package com.thinkgem.jeesite.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "usermng")
public class UserMngController {

	@RequestMapping(value = {"getUserNameById"})
	public String getUserNameById(String id) {
		
		System.out.println("zhangjian111111111111");
		
		return "zhangjian";
		
	}
	
}

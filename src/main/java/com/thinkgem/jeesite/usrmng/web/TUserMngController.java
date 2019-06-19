package com.thinkgem.jeesite.usrmng.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.modules.sys.entity.ModuleInfo4Kieker;
import com.thinkgem.jeesite.usrmng.service.UserMngService;

import kieker.monitoring.probe.spring.executions.SqlParserUtility;

@Controller
@RequestMapping(value = "${adminPath}/tusermng")
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
	
	@RequestMapping(value = {"showModuleNameView"})
	public String showModuleNameView(Model model) {
		
		ModuleInfo4Kieker moduleInfo = new ModuleInfo4Kieker();
		
		model.addAttribute("modelInfo", moduleInfo);
		
		return "modules/sys/showModuleNameView";
		
	}
	
	@RequestMapping(value = {"setModuleName"})
	public String setModuleName(ModuleInfo4Kieker moduleInfo, Model model) {
		
		SqlParserUtility.currentModuleName = moduleInfo.getModuleName();
		
		moduleInfo.setModuleName("");
		
		model.addAttribute("modelInfo", moduleInfo);
		
		return "modules/sys/showModuleNameView";
		
	}
	
}

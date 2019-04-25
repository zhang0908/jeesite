package com.thinkgem.jeesite.usrmng.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.usrmng.service.TaskMngService;

@Controller
@RequestMapping(value = "ttaskmng")
public class TTaskMngController {
	
	@Autowired
	public TaskMngService taskService;

	@RequestMapping(value = {"getTaskById"})
	public String getTaskById(String userId) {
		
//		System.out.println("zhangjian111111111111");
		
		return taskService.getTaskByIdSvr(userId);
		
	}
	
}

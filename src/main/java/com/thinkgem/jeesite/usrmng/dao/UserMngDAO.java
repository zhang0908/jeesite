package com.thinkgem.jeesite.usrmng.dao;

import org.apache.ibatis.annotations.Select;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.sys.entity.User;

@MyBatisDao
public interface UserMngDAO {
	
	@Select("SELECT * FROM sys_user WHERE id = #{userId}")
	public User getUserByIdDAO(String userId);

}

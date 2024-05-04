package com.jbk.dao;

import java.sql.Date;
import java.util.List;

import com.jbk.entity.User;
import com.jbk.security.CustomUserDetail;

public interface UserDao {
	public CustomUserDetail loadUserByUserId(String userId);
	public User loginUser(User user);

}

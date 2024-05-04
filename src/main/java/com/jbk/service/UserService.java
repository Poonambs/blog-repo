package com.jbk.service;

import org.springframework.transaction.annotation.Transactional;

import com.jbk.entity.User;
import com.jbk.security.CustomUserDetail;

@Transactional
public interface UserService {
	CustomUserDetail loadUserByUserId(String userId);

	User loginUser(User user);

}

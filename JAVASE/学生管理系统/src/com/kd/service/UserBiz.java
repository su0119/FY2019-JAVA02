package com.kd.service;

import com.kd.exception.LoginException;

public interface UserBiz {

	public void login(String username, String password) throws LoginException;

	public boolean isusernameexits(String username) throws LoginException;

	

	
}

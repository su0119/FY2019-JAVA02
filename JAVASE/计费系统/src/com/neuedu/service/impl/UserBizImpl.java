package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz{
	
	private User[] users=new User[5];
    public UserBizImpl() {
	User user1=new User("admin","admin", "Administrator","admin@123.com");
	User user2=new User("tom","cat","tomcat","tomcat@cat.com");
    this.users[0]=user1;
    this.users[1]=user2;
}
	
	@Override
	public void register(String username, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub	
	}

	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		boolean usernameexits=false;//默认用户不存在
		for(int i=0;i<users.length;i++) {
			User user=users[i];
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username)) {//用户名存在
				usernameexits=true;
				
				if(_password.equals(password)) {
					System.out.println("登录成功！！！");
				}else {// username password 不匹配
					throw new LoginException("用户名与密码不匹配!!");
				}
			}
		}
		if(!usernameexits) {
			throw new LoginException("用户名不存在!! ");
		}
	}

	@Override
	public boolean isusernameexits(String username) throws LoginException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			if(_username.equals(username)) {
				return true;
			}
		}
		throw new LoginException("用户名不存在!!!");
	}

	@Override
	public boolean isusernameexits1(String username) throws RegisterException {
		// TODO Auto-generated method stub
			for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			if(_username.equals(username)) {
				throw new RegisterException("用户名已存在!!!");
			}
			
		}
		return true;
	}

	@Override
	public boolean ispasswordexits(String password) throws RegisterException {
		// TODO Auto-generated method stub
		if(password.length()==0) {
			throw new RegisterException("密码不能为空！！");
		}
		return true;
	}

	@Override
	public boolean ispasswordexits1(String password, String password2) throws RegisterException {
		// TODO Auto-generated method stub
		if(password.equals(password2)) {
			return true;
		}
		throw new RegisterException("两次输入的密码不一致！！");
	}
}

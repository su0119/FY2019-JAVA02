package com.kd.viewimpl;

import java.util.Scanner;

import com.kd.exception.LoginException;
import com.kd.service.UserBiz;
import com.kd.service.impl.UesrBizImpl;
import com.kd.view.UserView;

public class UserViewImpl implements UserView{
	
	UserBiz userbiz=new UesrBizImpl();

	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username=s.nextLine();
		boolean a=userbiz.isusernameexits(username);
		if(a) {
			System.out.print("请输入密码:");
			String password=s.nextLine();
			userbiz.login(username, password);
			}
		}
	}




package com.kd.service.impl;

import com.kd.exception.LoginException;
import com.kd.pojo.Admin;
import com.kd.service.UserBiz;
import com.kd.pojo.Admin;

public class UesrBizImpl implements UserBiz {
	
	public Admin[] admins=new Admin[5];
	public UesrBizImpl() {
		Admin admin1=new Admin("admin1","admin1");
		Admin admin2=new Admin("admin2","admin2");
		this.admins[0]=admin1;
		this.admins[1]=admin2;
	}
	
	@Override
	public boolean isusernameexits(String username) throws LoginException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<admins.length;i++) {
			
			Admin user=admins[i];
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			if(_username.equals(username)) {
				return true;
			}
		}
		throw new LoginException("�û���������!!!");
	}
	

	@Override
	public void login(String username,String password) throws LoginException{
		// TODO Auto-generated method stub
		boolean isusernameexits=false;
       for(int i=0;i<admins.length;i++){
    	 Admin admin=admins[i];
    	   if(admin==null) {
    		   continue;
    	   }
    	   String _username=admin.getUsername();
			String _password=admin.getPassword();
			if(_username.equals(username)) {//�û�������
				isusernameexits=true;
				
				if(_password.equals(password)) {
					System.out.println("��¼�ɹ�������");
					System.out.println("��ӭ��"+username);
				}else {// username password ��ƥ��
					throw new LoginException("�û��������벻ƥ��!!");
				}
			}
		}
		if(!isusernameexits) {
			throw new LoginException("�û���������!! ");
		}
       }
	}


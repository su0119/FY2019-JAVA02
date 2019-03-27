package com.neuedu.service;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User; 

public interface UserBiz{
     void register(String username, String password, String password2,
    		       String name, String email)throws RegisterException; //用户注册;
     void login(String username, String password)throws LoginException; //用户登录;
     /**
      * 判断用户是否存在
      */
	boolean isusernameexits(String username) throws LoginException; 
	boolean isusernameexits1(String username) throws RegisterException; 
	boolean ispasswordexits(String password) throws RegisterException; 
	boolean ispasswordexits1(String password,String password2) throws RegisterException;
     
}

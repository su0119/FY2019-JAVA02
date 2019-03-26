package com.neuedu;

import java.util.Scanner;

public interface UserBiz{
     void register(String username, String password, String password2,
    		       String name, String email);
     void login(String username, String password);
}
abstract class UserBizimpl implements UserBiz{
	public User[] user;
	
	User[] users=new User[2];
	
	public static void initData(User[] user){
		User user1=new User("admin","admin", "Administrator","admin@123.com");
		User user2=new User("tom","cat","tomcat","tomcat@cat.com");
		}
	
	 void register() {
		 
	 }
	 void login(){
		  
	 }
}

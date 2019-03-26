package com.neuedu;

import java.util.Scanner;

public class UserViewimpl implements UserView{
	public void login() {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username=s.nextLine();
		 System.out.println("请输入密码");
		 String password=s.nextLine();
	};
   public void register() {
	   Scanner s=new Scanner(System.in);
	    System.out.println("请输入用户名:");
	    String username=s.nextLine();
	    System.out.println("请输入密码");
	    String password=s.nextLine();
	    System.out.println("请重复密码");
	    String password2=s.nextLine();
	    System.out.println("请输入真实姓名");
	    String name=s.nextLine();
	    System.out.println("请输入电子邮件地址");
	    String email=s.nextLine();
   };
}

package com.kd;

import java.util.Scanner;

import com.kd.exception.LoginException;
import com.kd.view.UserView;
import com.kd.viewimpl.UserViewImpl;

public class StudentManagerSystem {
	public static void main(String[] args) {
	
	welcome();
	}
	
	public static void welcome(){
		System.out.println("---------------欢迎登录学生信息管理系统-------------------");
		Scanner s= new Scanner(System.in);
		System.out.println("1.登录    2.退出");
		int num=s.nextInt();
		UserView userview=new UserViewImpl();
		if(num==1) {
			//登录
			try {
				userview.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println( e.getMessage());
			}
		}else if(num==2) {
			//退出
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入！！！");
		} 
	}
}

package com.kd;

import java.util.Scanner;

import com.kd.exception.AddException;
import com.kd.exception.DeleteException;
import com.kd.exception.LoginException;
import com.kd.exception.SetException;
import com.kd.pojo.Student;
import com.kd.view.UserView;
import com.kd.view.impl.UserViewImpl;

public class Application {
	static UserView userview=new UserViewImpl();
	public static void main(String[] args) {
	
		Application app=new Application();
		app.welcome();
		try {
			app.operation();
			app.operationInfo();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public void welcome(){
		System.out.println("---------------欢迎登录学生信息管理系统-------------------");
		System.out.println("1.登录    2.退出");
		System.out.println("***************************************************");
	}
	
	public void choice() {
		try {
			userview.login();
		}catch(LoginException e) {
			System.out.println(e.getMessage());
			choice();
		}
	}
	
	public static void add() {
		try {
			userview.addStudent();
		} catch (AddException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			add();
		}
	}
	
	public static void delete() {
		try {
			userview.deleteStudent();
		} catch (DeleteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			delete();
		}
	}
	
	private void set1() {
		// TODO Auto-generated method stub
		try {
			userview.setStudent();
		} catch (SetException e) {
			// TODO: handle exception.
			System.out.println(e.getMessage());
			set1();
		}
	}
	
	public void operation() throws LoginException {
		Scanner s= new Scanner(System.in);
		String num=s.nextLine();
		if(num.equals("1")) {
			//登录
			choice();
		}else if(num.equals("2")) {
			//退出
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入！！！");
			operation();
		} 
	}
	
	
	public  void operationInfo() {
		System.out.println("***************请选择要操作的信息对应数字***************");
		System.out.print("*1.查看学生信息"+"\t");
		System.out.print("2.添加学生信息"+"\t");
		System.out.print("3.删除学生信息"+"\t");
		System.out.print("4.修改学生信息"+"\t");
		System.out.println("5.退出"+"\t"+"*");
		System.out.println("***************************************************");
		System.out.print("请选择：");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num==1){
			//查看
			userview.viewStudent();
			operationInfo();
		}else if(num==2){
			//添加
			add();
			operationInfo();
		}else if(num==3){
			//删除
			delete();
			operationInfo();
		}else if(num==4){
			//修改
			set1();
			operationInfo();
		}else if(num==5){
			//退出
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入");
		}
	}

}

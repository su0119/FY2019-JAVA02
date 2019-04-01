package com.kd.view.impl;

import java.util.Scanner;

import com.kd.Application;
import com.kd.exception.AddException;
import com.kd.exception.DeleteException;
import com.kd.exception.LoginException;
import com.kd.exception.SetException;
import com.kd.pojo.Student;
import com.kd.service.UserBiz;
import com.kd.service.impl.UesrBizImpl;
import com.kd.view.UserView;

public class UserViewImpl implements UserView{
	
	UserBiz userbiz=new UesrBizImpl();
	Application app=new Application();
	//登录
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
	
	//添加学生信息
	public void addStudent() throws AddException{
		System.out.println("*********************添加学生信息***************");
		Scanner s=new Scanner(System.in);
		System.out.print("请输入学生id:");
		int id=s.nextInt();
		boolean a=userbiz.isidexits(id);
		if(a) {
			System.out.print("请输入学生姓名:");
			String n=s.nextLine();
			s.nextLine();
			System.out.print("请输入性别:");
			String sex=s.nextLine();
			System.out.print("请输入学生年龄(只能1-120之间的数字):");
			int age=s.nextInt();
			System.out.print("请输入学生所属年级(只能初级、中级、高级):");
			String grade=s.nextLine();
			System.out.print("请输入学生地址:");
			String add=s.nextLine();
			System.out.print("请输入学生联系方式(11位手机号码):");
			String phone=s.nextLine();
			System.out.print("请输入学生电子邮箱(包含@和.com):");
			String ema=s.nextLine();
			System.out.print("请输入学生成绩:");
			int score=s.nextInt();
			System.out.println("数据保存成功，系统将自动返回上层目录~");
			userbiz.addStudent(id,n,sex,age,grade,add,phone,ema,score);
		}
	}

	//查看学生信息
	public void viewStudent(){
		Scanner s= new Scanner(System.in);
		/*System.out.print("请选择:");
		String a=s.nextLine();*/
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.print("1.查看所有学生信息"+"\t");
		System.out.print("2.根据id查询学生信息"+"\t");
		System.out.print("3.根据id查询学生姓名"+"\t");
		System.out.println("4.返回上一层"+"\t");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.print("请选择菜单:");
		int num=s.nextInt();
		if(num==1) {
			//查看所有学生信息
			System.out.print("id"+"\t");
			System.out.print("name"+"\t");
			System.out.print("sex"+"\t");
			System.out.print("age"+"\t");
			System.out.print("class"+"\t");
			System.out.print("address"+"\t");
			System.out.print("phone"+"\t\t");
			System.out.print("emil"+"\t\t");
			System.out.println("score"+"\t");
			userbiz.viewStudent();
		}else if(num==2) {
			//根据id查询学生信息
			System.out.print("请输入要查询的id:");
			int id=s.nextInt();
			userbiz.viewPartStudent(id);
		}else if(num==3) {
			//根据id查询学生姓名
			System.out.print("请输入要查询的id:");
			int id=s.nextInt();
			userbiz.viewStudentName(id);
		}else if(num==4) {
			//返回上一层
			
			app.operationInfo();
		}else {
			System.out.println("输入有误，请重新输入");
		}
		System.out.println("数据查询完毕，系统将自动返回上层~");
		viewStudent();
}
	
	//删除学生信息
	public void deleteStudent() throws DeleteException {
		Scanner s=new Scanner(System.in);
		System.out.print("请选择要删除的学生id:");
		int id=s.nextInt();
		boolean a=userbiz.isidexits1(id);
		if(a) {
			/*int num=id;*/
			userbiz.deleteStudent(id);
		}
	}
	
	//修改学生信息
	public void setStudent() throws SetException {
		System.out.println("---------------------------");
		System.out.print("1.根据id修改学生全部信息"+"\t");
		System.out.print("2.根据id修改学生部分信息"+"\t");
		System.out.print("3.返回上层目录"+"\t");
		System.out.println("4.系统退出");
		System.out.println("---------------------------");
		Scanner s=new Scanner(System.in);
		System.out.print("请选择:");
		int num=s.nextInt();
		if(num==1) {
			//修改学生全部信息
			System.out.print("请输入要修改的id:");
			int id=s.nextInt();
			boolean a=userbiz.isidexits2(id);
			if(a) {
				userbiz.setAllStudent(id);
			}
		}else if(num==2){
			//根据id修改学生部分信息
			System.out.print("请输入要修改的id:");
			int id=s.nextInt();
			boolean a=userbiz.isidexits2(id);
			if(a) {
				userbiz.setpartStudent(id);
			}
		}else if(num==3) {
			//返回上层目录
			app.operationInfo();
		}else if(num==4) {
			//系统退出
			System.exit(0);
		}else {
			System.out.println("输入有误，请重新输入");
		}
		setStudent();
	}


	
}




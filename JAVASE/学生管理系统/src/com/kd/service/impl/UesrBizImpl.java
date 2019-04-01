package com.kd.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.kd.exception.AddException;
import com.kd.exception.DeleteException;
import com.kd.exception.LoginException;
import com.kd.exception.SetException;
import com.kd.pojo.Admin;
import com.kd.pojo.Student;
import com.kd.service.UserBiz;
import com.kd.pojo.Admin;

public class UesrBizImpl implements UserBiz {
	
	public Admin[] admins=new Admin[5];
	public Student[] students=new Student[100];
	public UesrBizImpl() {
		Admin admin1=new Admin("admin","admin");
		Admin admin2=new Admin("admin2","admin2");
		admins[0]=admin1;
		admins[1]=admin2;
		Student stu1=new Student(1,"张三","男",18,"3","北京", "15261", "1632324",80);
		Student stu2=new Student(2,"李四","女",19,"3","天津", "156893", "19654",60);
		Student stu3=new Student(3,"王五","男",20,"3","北京", "1745", "15553",50);
		students[0]=stu1;
		students[1]=stu2;
		students[3]=stu3;
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
		throw new LoginException("用户名不存在!!!");
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
			if(_username.equals(username)) {//用户名存在
				isusernameexits=true;
				
				if(_password.equals(password)) {
					System.out.println("登录成功！！！");
					System.out.println("欢迎您"+username);
				}else {// username password 不匹配
					throw new LoginException("用户名与密码不匹配!!");
				}
			}
		}
		if(!isusernameexits) {
			throw new LoginException("用户名不存在!! ");
			}
		}

	@Override
	public boolean isidexits(int id) throws AddException {
		// TODO Auto-generated method stub
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].getId();
			if(_id==id) {
				throw new AddException("此id已存在，请重新输入！！");
			}
		}
		return true;
	}
	
	//添加学生信息
	public void addStudent(int id, String name, String sex, int age, String _class, String address, String phone,
			String email,int score){
		Student student=new Student(id,name,sex,age,_class,address,phone,email,score);
		students[id-1]=student;
	}
	
	//查看学生信息
	public void viewStudent() {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
				}else {
					System.out.print(students[i].id+"\t");
					System.out.print(students[i].name+"\t");
					System.out.print(students[i].sex+"\t");
					System.out.print(students[i].age+"\t");
					System.out.print(students[i]._class+"\t");
					System.out.print(students[i].address+"\t");
					System.out.print(students[i].phone+"\t\t");
					System.out.print(students[i].email+"\t\t");
					System.out.println(students[i].score+"\t");
				}
		}
	}
		
	//根据id查询学生信息
	public void viewPartStudent(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].id;
			if(_id==id) {
				System.out.print(students[i].id+"\t");
				System.out.print(students[i].name+"\t");
				System.out.print(students[i].sex+"\t");
				System.out.print(students[i].age+"\t");
				System.out.print(students[i]._class+"\t");
				System.out.print(students[i].address+"\t");
				System.out.print(students[i].phone+"\t\t");
				System.out.println(students[i].email+"\t");
				//System.out.println(students[i].score+"\t");
			}
		}
	}

	//根据id查询学生姓名
	public void viewStudentName(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].id;
			if(_id==id) {
				System.out.println(students[i].name+"\t");
			}
		}
	}

	@Override
	public boolean isidexits1(int id) throws DeleteException {
		// TODO Auto-generated method stub
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].getId();
			if(_id==id) {
				return true;
			}
	}
		throw new DeleteException("此id不存在！！");
	}

	//删除学生信息
	public void deleteStudent(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].getId();
			if(_id==id) {
				students[i]=null;
				}
			}
		}
	
	@Override
	public boolean isidexits2(int id) throws SetException {
		// TODO Auto-generated method stub
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].getId();
			if(_id==id) {
				return true;
			}
	}
		throw new SetException("此id不存在！！");
	}
	//修改全部学生信息
	public void setAllStudent(int id) throws SetException{
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].id;
			if(_id==id) {
				System.out.print(students[i].id+"\t");
				System.out.print(students[i].name+"\t");
				System.out.print(students[i].sex+"\t");
				System.out.print(students[i].age+"\t");
				System.out.print(students[i]._class+"\t");
				System.out.print(students[i].address+"\t");
				System.out.print(students[i].phone+"\t\t");
				System.out.println(students[i].email+"\t");
				System.out.print("请输入修改后学生的姓名：");
				Scanner n = new Scanner(System.in);
				String name= n.nextLine();
				students[i].setName(name);
				System.out.print("请输入修改后学生的性别：");
				Scanner s1 = new Scanner(System.in);
				String sex= s1.nextLine();
				students[i].setSex(sex);
				System.out.print("请输入修改后学生的年龄：");
				Scanner g = new Scanner(System.in);
				int age= g.nextInt();
				students[i].setAge(age);
				System.out.print("请输入修改后学生的班级：");
				Scanner c = new Scanner(System.in);
				String _class= c.nextLine();
				students[i].set_class(_class);
				System.out.print("请输入修改后学生的住址：");
				Scanner d = new Scanner(System.in);
				String address= d.nextLine();
				students[i].setAddress(address);
				System.out.print("请输入修改后学生的电话：");
				Scanner p = new Scanner(System.in);
				String phone= p.nextLine();
				students[i].setPhone(phone);
				System.out.print("请输入修改后学生的邮箱：");
				Scanner e = new Scanner(System.in);
				String emil= e.nextLine();
				students[i].setEmail(emil);
				System.out.print("请输入修改后学生的成绩：");
				Scanner so = new Scanner(System.in);
				int score= so.nextInt();
				students[i].setScore(score);
				System.out.println("修改成功！！！");
			}
	}
	
}	
	
	
	//修改部分学生信息
	public void setpartStudent(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].id;
			if(_id==id) {
				Scanner s=new Scanner(System.in);
				System.out.print("请输入要修改的属性:");
				String a=s.nextLine();
				System.out.print("请输入修改后的数据:");
				String b=s.nextLine();
				if(a.equals("name")) {
					students[i].setName(b);
				}else if(a.equals("sex")) {
					
					students[i].setSex(b);
				}else if(a.equals("age")) {
				
					int d=Integer.valueOf(b);
					students[i].setAge(d);
				}else if(a.equals("class")) {
					
					students[i].set_class(b);
				}else if(a.equals("address")) {
					
					students[i].setAddress(b);
				}else if(a.equals("phone")) {
					
					students[i].setPhone(b);
				}else if(a.equals("email")) {
				
					students[i].setEmail(b);
				}
				System.out.println("修改成功");
				System.out.println("系统自动返回上层目录~");
			}
			
		}
		
	}


	


	
}

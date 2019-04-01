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
		Student stu1=new Student(1,"����","��",18,"3","����", "15261", "1632324",80);
		Student stu2=new Student(2,"����","Ů",19,"3","���", "156893", "19654",60);
		Student stu3=new Student(3,"����","��",20,"3","����", "1745", "15553",50);
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

	@Override
	public boolean isidexits(int id) throws AddException {
		// TODO Auto-generated method stub
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].getId();
			if(_id==id) {
				throw new AddException("��id�Ѵ��ڣ����������룡��");
			}
		}
		return true;
	}
	
	//���ѧ����Ϣ
	public void addStudent(int id, String name, String sex, int age, String _class, String address, String phone,
			String email,int score){
		Student student=new Student(id,name,sex,age,_class,address,phone,email,score);
		students[id-1]=student;
	}
	
	//�鿴ѧ����Ϣ
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
		
	//����id��ѯѧ����Ϣ
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

	//����id��ѯѧ������
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
		throw new DeleteException("��id�����ڣ���");
	}

	//ɾ��ѧ����Ϣ
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
		throw new SetException("��id�����ڣ���");
	}
	//�޸�ȫ��ѧ����Ϣ
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
				System.out.print("�������޸ĺ�ѧ����������");
				Scanner n = new Scanner(System.in);
				String name= n.nextLine();
				students[i].setName(name);
				System.out.print("�������޸ĺ�ѧ�����Ա�");
				Scanner s1 = new Scanner(System.in);
				String sex= s1.nextLine();
				students[i].setSex(sex);
				System.out.print("�������޸ĺ�ѧ�������䣺");
				Scanner g = new Scanner(System.in);
				int age= g.nextInt();
				students[i].setAge(age);
				System.out.print("�������޸ĺ�ѧ���İ༶��");
				Scanner c = new Scanner(System.in);
				String _class= c.nextLine();
				students[i].set_class(_class);
				System.out.print("�������޸ĺ�ѧ����סַ��");
				Scanner d = new Scanner(System.in);
				String address= d.nextLine();
				students[i].setAddress(address);
				System.out.print("�������޸ĺ�ѧ���ĵ绰��");
				Scanner p = new Scanner(System.in);
				String phone= p.nextLine();
				students[i].setPhone(phone);
				System.out.print("�������޸ĺ�ѧ�������䣺");
				Scanner e = new Scanner(System.in);
				String emil= e.nextLine();
				students[i].setEmail(emil);
				System.out.print("�������޸ĺ�ѧ���ĳɼ���");
				Scanner so = new Scanner(System.in);
				int score= so.nextInt();
				students[i].setScore(score);
				System.out.println("�޸ĳɹ�������");
			}
	}
	
}	
	
	
	//�޸Ĳ���ѧ����Ϣ
	public void setpartStudent(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				continue;
			}
			int _id=students[i].id;
			if(_id==id) {
				Scanner s=new Scanner(System.in);
				System.out.print("������Ҫ�޸ĵ�����:");
				String a=s.nextLine();
				System.out.print("�������޸ĺ������:");
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
				System.out.println("�޸ĳɹ�");
				System.out.println("ϵͳ�Զ������ϲ�Ŀ¼~");
			}
			
		}
		
	}


	


	
}

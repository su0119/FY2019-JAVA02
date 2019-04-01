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
		System.out.println("---------------��ӭ��¼ѧ����Ϣ����ϵͳ-------------------");
		System.out.println("1.��¼    2.�˳�");
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
			//��¼
			choice();
		}else if(num.equals("2")) {
			//�˳�
			System.exit(0);
		}else{
			System.out.println("�����������������룡����");
			operation();
		} 
	}
	
	
	public  void operationInfo() {
		System.out.println("***************��ѡ��Ҫ��������Ϣ��Ӧ����***************");
		System.out.print("*1.�鿴ѧ����Ϣ"+"\t");
		System.out.print("2.���ѧ����Ϣ"+"\t");
		System.out.print("3.ɾ��ѧ����Ϣ"+"\t");
		System.out.print("4.�޸�ѧ����Ϣ"+"\t");
		System.out.println("5.�˳�"+"\t"+"*");
		System.out.println("***************************************************");
		System.out.print("��ѡ��");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num==1){
			//�鿴
			userview.viewStudent();
			operationInfo();
		}else if(num==2){
			//���
			add();
			operationInfo();
		}else if(num==3){
			//ɾ��
			delete();
			operationInfo();
		}else if(num==4){
			//�޸�
			set1();
			operationInfo();
		}else if(num==5){
			//�˳�
			System.exit(0);
		}else{
			System.out.println("������������������");
		}
	}

}

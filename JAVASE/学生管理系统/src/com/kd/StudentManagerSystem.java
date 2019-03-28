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
		System.out.println("---------------��ӭ��¼ѧ����Ϣ����ϵͳ-------------------");
		Scanner s= new Scanner(System.in);
		System.out.println("1.��¼    2.�˳�");
		int num=s.nextInt();
		UserView userview=new UserViewImpl();
		if(num==1) {
			//��¼
			try {
				userview.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println( e.getMessage());
			}
		}else if(num==2) {
			//�˳�
			System.exit(0);
		}else{
			System.out.println("�����������������룡����");
		} 
	}
}

package com.neuedu;

import java.util.Scanner;

public class UserViewimpl implements UserView{
	public void login() {
		Scanner s=new Scanner(System.in);
		System.out.println("�������û���:");
		String username=s.nextLine();
		 System.out.println("����������");
		 String password=s.nextLine();
	};
   public void register() {
	   Scanner s=new Scanner(System.in);
	    System.out.println("�������û���:");
	    String username=s.nextLine();
	    System.out.println("����������");
	    String password=s.nextLine();
	    System.out.println("���ظ�����");
	    String password2=s.nextLine();
	    System.out.println("��������ʵ����");
	    String name=s.nextLine();
	    System.out.println("����������ʼ���ַ");
	    String email=s.nextLine();
   };
}

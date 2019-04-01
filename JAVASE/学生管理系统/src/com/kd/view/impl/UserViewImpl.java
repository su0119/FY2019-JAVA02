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
	//��¼
	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("�������û�����");
		String username=s.nextLine();
		boolean a=userbiz.isusernameexits(username);
		if(a) {
			System.out.print("����������:");
			String password=s.nextLine();
			userbiz.login(username, password);
			}
		}
	
	//���ѧ����Ϣ
	public void addStudent() throws AddException{
		System.out.println("*********************���ѧ����Ϣ***************");
		Scanner s=new Scanner(System.in);
		System.out.print("������ѧ��id:");
		int id=s.nextInt();
		boolean a=userbiz.isidexits(id);
		if(a) {
			System.out.print("������ѧ������:");
			String n=s.nextLine();
			s.nextLine();
			System.out.print("�������Ա�:");
			String sex=s.nextLine();
			System.out.print("������ѧ������(ֻ��1-120֮�������):");
			int age=s.nextInt();
			System.out.print("������ѧ�������꼶(ֻ�ܳ������м����߼�):");
			String grade=s.nextLine();
			System.out.print("������ѧ����ַ:");
			String add=s.nextLine();
			System.out.print("������ѧ����ϵ��ʽ(11λ�ֻ�����):");
			String phone=s.nextLine();
			System.out.print("������ѧ����������(����@��.com):");
			String ema=s.nextLine();
			System.out.print("������ѧ���ɼ�:");
			int score=s.nextInt();
			System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
			userbiz.addStudent(id,n,sex,age,grade,add,phone,ema,score);
		}
	}

	//�鿴ѧ����Ϣ
	public void viewStudent(){
		Scanner s= new Scanner(System.in);
		/*System.out.print("��ѡ��:");
		String a=s.nextLine();*/
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.print("1.�鿴����ѧ����Ϣ"+"\t");
		System.out.print("2.����id��ѯѧ����Ϣ"+"\t");
		System.out.print("3.����id��ѯѧ������"+"\t");
		System.out.println("4.������һ��"+"\t");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.print("��ѡ��˵�:");
		int num=s.nextInt();
		if(num==1) {
			//�鿴����ѧ����Ϣ
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
			//����id��ѯѧ����Ϣ
			System.out.print("������Ҫ��ѯ��id:");
			int id=s.nextInt();
			userbiz.viewPartStudent(id);
		}else if(num==3) {
			//����id��ѯѧ������
			System.out.print("������Ҫ��ѯ��id:");
			int id=s.nextInt();
			userbiz.viewStudentName(id);
		}else if(num==4) {
			//������һ��
			
			app.operationInfo();
		}else {
			System.out.println("������������������");
		}
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ������ϲ�~");
		viewStudent();
}
	
	//ɾ��ѧ����Ϣ
	public void deleteStudent() throws DeleteException {
		Scanner s=new Scanner(System.in);
		System.out.print("��ѡ��Ҫɾ����ѧ��id:");
		int id=s.nextInt();
		boolean a=userbiz.isidexits1(id);
		if(a) {
			/*int num=id;*/
			userbiz.deleteStudent(id);
		}
	}
	
	//�޸�ѧ����Ϣ
	public void setStudent() throws SetException {
		System.out.println("---------------------------");
		System.out.print("1.����id�޸�ѧ��ȫ����Ϣ"+"\t");
		System.out.print("2.����id�޸�ѧ��������Ϣ"+"\t");
		System.out.print("3.�����ϲ�Ŀ¼"+"\t");
		System.out.println("4.ϵͳ�˳�");
		System.out.println("---------------------------");
		Scanner s=new Scanner(System.in);
		System.out.print("��ѡ��:");
		int num=s.nextInt();
		if(num==1) {
			//�޸�ѧ��ȫ����Ϣ
			System.out.print("������Ҫ�޸ĵ�id:");
			int id=s.nextInt();
			boolean a=userbiz.isidexits2(id);
			if(a) {
				userbiz.setAllStudent(id);
			}
		}else if(num==2){
			//����id�޸�ѧ��������Ϣ
			System.out.print("������Ҫ�޸ĵ�id:");
			int id=s.nextInt();
			boolean a=userbiz.isidexits2(id);
			if(a) {
				userbiz.setpartStudent(id);
			}
		}else if(num==3) {
			//�����ϲ�Ŀ¼
			app.operationInfo();
		}else if(num==4) {
			//ϵͳ�˳�
			System.exit(0);
		}else {
			System.out.println("������������������");
		}
		setStudent();
	}


	
}




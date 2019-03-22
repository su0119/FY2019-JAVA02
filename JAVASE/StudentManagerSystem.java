
import java.util.Scanner;


public class StudentManagerSystem{
	
	public static void main(String[] args){
		
		welcome();
		operation();
		Admin[] admins=new Admin[5];
		initData(admins);
		
	}
	public static void initData(Admin[],admins){//���ݳ�ʼ��
		
		Admin admin=new Admin("admin","admin");
		admins[0]=admin;
	} 
	
	
	public static void welcome(){
		System.out.println("---------------��ӭ��¼ѧ����Ϣ����ϵͳ-------------------");
		System.out.println("1.��¼    2.�˳�");
		System.out.println("-----------------------------------------------------------");
	}
	public static void operation(){
		Scanner s=new Scanner(System.in);
		System.out.println("��ѡ��:");
		int operation=s.nextInt();//���ռ�������
		if(operation==1){
			//��¼
		}else if(operation==2){ 
			//�˳�
			System.exit(0);
		}else{
			System.out.println("������������������");
			operation();//�ݹ����
		}
	}
	public static void login(){
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
class Admin{
	
	public String username;
	public String password;
	 
	public Admin(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	
	public String password(){
		return password;
	}
	public void setpassword(String password){
		this.password=password;
	}
	
		
}	

 
 
 class Student{
	 public int id;
	 public String name;
	 public String sex;
	 public int age;
	 public String address;
	 public String _class;
	 public String Email;
	 
	 
	 
	 public int getId(){
		 return id;	 
	 }
	 public void setId(int id){
		 this.id=id;
	 }
	 public String getName(){
		 return name;	 
	 }
	 public void setName(String name){
		 this.name=name;
	 }
	 public String getSex(){
		 return sex;	 
	 }
	 public void setSex(String sex){
		 this.sex=sex;
	 }
	 
	 
	 
 }

	
}

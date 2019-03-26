
import java.util.Scanner;


public class StudentManagerSystem{
	
	public static void main(String[] args){
		
		welcome();

		Admin[] admins=new Admin[5];
		initData(admins);
		operation(admins);
		operationInfo();
	}		

	public static void initData(Admin[] admins){//���ݳ�ʼ��
		
		Admin admin=new Admin("admin","admin");
		admins[0]=admin;
		Admin admin1=new Admin("admin1","admin1");
		admins[1]=admin1;
	} 
	
	
	public static void welcome(){
		System.out.println("---------------��ӭ��¼ѧ����Ϣ����ϵͳ-------------------");
		System.out.println("1.��¼    2.�˳�");
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void operation(Admin[] admins){
		Scanner s=new Scanner(System.in);
		System.out.print("��ѡ��:");
		int operation=s.nextInt();//���ռ�������
		if(operation==1){
			//��¼
			login(admins);
		}else if(operation==2){ 
			//�˳�
			System.exit(0);
		}else{
			System.out.println("������������������");
			operation(admins);
		}
	}
	
	public static void login(Admin[] admins){
		
		System.out.println("��ӭ��¼");
		Scanner s=new Scanner(System.in);
		System.out.print("�������û���:");
		String username=s.nextLine();
		System.out.print("����������:");
		String password=s.nextLine();
		
		//�ж��û��������Ƿ���ȷ
		for(int i=0;i<admins.length;i++){
			
			Admin admin=admins[i];
			if(admin==null){
				continue;
			}
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("��ӭ��"+username);
				break;
			}
		}
	}
	public static void operationInfo(){
		System.out.println("**************************��ѡ��Ҫ��������Ϣ��Ӧ����*****************************");
		System.out.print("*1.�鿴ѧ����Ϣ"+"\t");
		System.out.print("2.���ѧ����Ϣ"+"\t");
		System.out.print("3.ɾ��ѧ����Ϣ"+"\t");
		System.out.print("4.�޸�ѧ����Ϣ"+"\t");
		System.out.println("5.�˳�"+"\t"+"*");
		System.out.println("****************************************************************************");
		System.out.print("��ѡ��");
		Scanner s=new Scanner(System.in);
		int operationInfo=s.nextInt();
		if(operationInfo==1){
			//�鿴
		}else if(operationInfo==2){
			//���
		}else if(operationInfo==3){
			
		}else if(operationInfo==4){
			
		}else if(operationInfo==5){
			System.exit(0);
		}else{
			System.out.println("������������������");
			operationInfo();
		}
	}
	public static void viewInfo(Student[] s){
		System.out.println();
		
	}
	public static void addInfo(){
		Scanner s=new Scanner(System.in);
		System.out.println("������ѧ��:");
		Scanner s=new Scanner(System.in);
		System.out.println("����������:");
		Scanner s=new Scanner(System.in);
		System.out.println("�������Ա�:");
		Scanner s=new Scanner(System.in);
		System.out.println("����������:");
		Scanner s=new Scanner(System.in);
		System.out.println("������༶:");
		Scanner s=new Scanner(System.in);
		System.out.println("�������ͥסַ:");
		Scanner s=new Scanner(System.in);
		System.out.println("�������ֻ�����:");
		Scanner s=new Scanner(System.in);
		System.out.println("����������:");
	}
	
	

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
	 public String _class;
	 public String address;
	 public String phone;
	 public String email;
	 
	 
	 
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
	  public int getAge(){
		 return age;	 
	 }
	 public void setAge(int age){
		 this.age=age;
	 }
	  public String getClass(){
		 return _class;	 
	 }
	 public void setClass(String _class){
		 this._class=_class;
	 }
	  public String getAddress(){
		 return address;	 
	 }
	 public void setAddress(String address){
		 this.address=address;
	 }
	 public String getPhone(){
		 return phone;	 
	 }
	 public void setPhone(String phone){
		 this.phone=phone;
	 }
	  public String getEmail(){
		 return email;	 
	 }
	 public void setEmail(String email){
		 this.email=email;
	 }
 }

	

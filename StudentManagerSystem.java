
import java.util.Scanner;


public class StudentManagerSystem{
	
	public static void main(String[] args){
		
		welcome();

		Admin[] admins=new Admin[5];
		initData(admins);
		operation(admins);
		operationInfo();
	}		

	public static void initData(Admin[] admins){//数据初始化
		
		Admin admin=new Admin("admin","admin");
		admins[0]=admin;
		Admin admin1=new Admin("admin1","admin1");
		admins[1]=admin1;
	} 
	
	
	public static void welcome(){
		System.out.println("---------------欢迎登录学生信息管理系统-------------------");
		System.out.println("1.登录    2.退出");
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void operation(Admin[] admins){
		Scanner s=new Scanner(System.in);
		System.out.print("请选择:");
		int operation=s.nextInt();//接收键盘输入
		if(operation==1){
			//登录
			login(admins);
		}else if(operation==2){ 
			//退出
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入");
			operation(admins);
		}
	}
	
	public static void login(Admin[] admins){
		
		System.out.println("欢迎登录");
		Scanner s=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String username=s.nextLine();
		System.out.print("请输入密码:");
		String password=s.nextLine();
		
		//判断用户名密码是否正确
		for(int i=0;i<admins.length;i++){
			
			Admin admin=admins[i];
			if(admin==null){
				continue;
			}
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("欢迎您"+username);
				break;
			}
		}
	}
	public static void operationInfo(){
		System.out.println("**************************请选择要操作的信息对应数字*****************************");
		System.out.print("*1.查看学生信息"+"\t");
		System.out.print("2.添加学生信息"+"\t");
		System.out.print("3.删除学生信息"+"\t");
		System.out.print("4.修改学生信息"+"\t");
		System.out.println("5.退出"+"\t"+"*");
		System.out.println("****************************************************************************");
		System.out.print("请选择：");
		Scanner s=new Scanner(System.in);
		int operationInfo=s.nextInt();
		if(operationInfo==1){
			//查看
		}else if(operationInfo==2){
			//添加
		}else if(operationInfo==3){
			
		}else if(operationInfo==4){
			
		}else if(operationInfo==5){
			System.exit(0);
		}else{
			System.out.println("输入有误，请重新输入");
			operationInfo();
		}
	}
	public static void viewInfo(Student[] s){
		System.out.println();
		
	}
	public static void addInfo(){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入学号:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入姓名:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入性别:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入年龄:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入班级:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入家庭住址:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入手机号码:");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入邮箱:");
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

	

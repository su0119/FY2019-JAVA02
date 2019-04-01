package com.kd.service;

import com.kd.exception.AddException;
import com.kd.exception.DeleteException;
import com.kd.exception.LoginException;
import com.kd.exception.SetException;
import com.kd.pojo.Student;

public interface UserBiz {

	public void login(String username, String password) throws LoginException;

	public boolean isusernameexits(String username) throws LoginException;

	boolean isidexits(int id) throws AddException;

	public void addStudent(int id, String name, String sex, int age, String _class, String address, String phone,
			String email,int score);

	public void viewStudent();
	
	public boolean isidexits1(int id) throws DeleteException;

	public void deleteStudent(int num);

	boolean isidexits2(int id) throws SetException;

	public void setpartStudent(int id);

	public void setAllStudent(int id) throws SetException;

	public void viewPartStudent(int id);

	public void viewStudentName(int id);



	
}

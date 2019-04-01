package com.kd.view;

import com.kd.exception.AddException;
import com.kd.exception.DeleteException;
import com.kd.exception.LoginException;
import com.kd.exception.SetException;
import com.kd.pojo.Student;

public interface UserView {
	public void login() throws LoginException;

	public void addStudent() throws AddException;

	public void viewStudent();
	
	public void deleteStudent() throws DeleteException;

	public void setStudent() throws SetException;

}

package com.neuedu.view;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserView {
	   void login() throws LoginException;
	   void register() throws RegisterException;;
}
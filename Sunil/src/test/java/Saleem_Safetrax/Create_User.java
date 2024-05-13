package Saleem_Safetrax;

import java.io.IOException;

import TestCases1.Safetrax_login;
import TestCases1.baseClass;

public class Create_User extends baseClass{
	
	
	Safetrax_login Home ;
	
	public  void Create_New() {
		
		
	}
public void setup() throws IOException{
	
	
	Home = new 	Safetrax_login();
	
	
}
public void Login() throws InterruptedException{
	
	
    Home.Create_New();
}
}


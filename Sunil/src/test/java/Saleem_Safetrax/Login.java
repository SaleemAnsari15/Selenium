package Saleem_Safetrax;

import java.io.IOException;

import org.apache.commons.io.IOExceptionWithCause;

import TestCases1.Safetrax_login;
import TestCases1.baseClass;

public class Login extends baseClass{
	
	
	Safetrax_login Home ;
	
	public Login() {
		
		super();
	}
public void setup() throws IOException{
	
	
	Home = new 	Safetrax_login();
	
	
}
public void Login() throws InterruptedException{
	
	
    Home.Page();
}
}


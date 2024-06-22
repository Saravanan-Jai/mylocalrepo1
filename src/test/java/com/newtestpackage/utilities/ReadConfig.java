package com.newtestpackage.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig () 
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
		
			System.out.println("Exception is "+ e.getMessage());
		}
		
	}

public String getApplicationURL()
{
	String url=pro.getProperty("baseURL");
	return url;
	
}

public String getedgepath() 
{
	String epath=pro.getProperty("edgepath");
	return epath;

}

public String getusername() 
{

	String uname=pro.getProperty("pusername");
	return uname;
}

public String getpassword() 
{
	
	String pword=pro.getProperty("ppassword");
	return pword;

}

}
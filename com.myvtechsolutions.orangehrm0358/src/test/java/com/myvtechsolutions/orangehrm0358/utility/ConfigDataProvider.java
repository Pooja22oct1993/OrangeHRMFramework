package com.myvtechsolutions.orangehrm0358.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.Properties;

import net.bytebuddy.asm.Advice.Return;

public class ConfigDataProvider {
	public static Properties prop;
	public ConfigDataProvider(String configpath)  {
		
		try { 		
			FileInputStream fins = new FileInputStream(configpath);
		prop= new Properties();
		prop.load(fins);

			
		} catch (Exception e) {
			System.out.println("File not found:"+e.getMessage());
		}
		
		public String getUserName() {
			return prop.getProperty("username");
			
		} 
		public String getPassword() {
			return prop.getProperty("password");
			
		} 
		public String getAppUrl() {
			return prop.getProperty("appUrl");
			
		} 
		
		
	
	
	

}

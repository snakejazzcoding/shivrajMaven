package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class configDataProvider {
	
Properties pro;
	
	public  configDataProvider() throws Exception {
		
		String path = "C:\\Users\\admin\\eclipse-workspace\\shivrajFramework\\Config\\config.Properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
	}
	
	public String getBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}

}

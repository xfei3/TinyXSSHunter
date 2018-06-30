package org.xfei.code;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Constant {
	public static final String PATH;
	static{
		
		Properties properties = new Properties();
		String path = new File(".").getAbsolutePath();
		try {
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("../config.properties"));
			path=properties.getProperty("path");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Using default path: "+path);
		}
		PATH=path;

	}
}

package com.atmecs.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	public String takeproperties(String file) throws FileNotFoundException {

		Properties properties = new Properties();
		FileInputStream f = new FileInputStream("./src/test/resources/locators/oneway_locators.properties");
		try {
			properties.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = properties.getProperty(file);
		return data;
	}


}

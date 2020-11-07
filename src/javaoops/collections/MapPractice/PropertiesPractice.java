package javaoops.collections.MapPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {

	public static void main(String[] args) throws IOException {
		
		Properties pr = new Properties();
		
		FileInputStream is = new FileInputStream("/home/inblr01-36/Desktop/lohith/inputs/javaproperties");
		pr.load(is);	
		System.out.println(pr.getProperty("100"));		

		pr.setProperty("100", "thimmu");
		
		FileOutputStream fos = new FileOutputStream("/home/inblr01-36/Desktop/lohith/inputs/javaproperties");
		pr.store(fos, "Changd lohith to thimmu");
		System.out.println(pr);
		
	}
}


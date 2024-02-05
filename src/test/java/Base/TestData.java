package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		 FileInputStream fis = new  FileInputStream("C:\\Users\\shravan\\OneDrive\\Desktop\\suresh\\eclps\\SelinumJavaProj\\src\\test\\resources\\configurations.properties");
		 
	     Properties prop= new Properties();
	     
	     prop.load(fis);
	    // prop.getProperty("username");
	     System.out.println( prop.getProperty("username"));
	}

}

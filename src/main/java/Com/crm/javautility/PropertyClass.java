package Com.crm.javautility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class PropertyClass {
	public Properties prop=new Properties();
	public FileInputStream strm;
public String propdata(String key) throws IOException {
	strm=new FileInputStream("src/main/resources/BaseClassp.properties");
	prop.load(strm);
    String data=prop.getProperty(key);
	return(data);
}
}

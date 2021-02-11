package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertiesOperation {
	
	static Properties prop=new Properties();
	public static String getPropertyValueByKey(String key) throws Exception {
		//load data from properties file
		//location
		String propfilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream fis=new FileInputStream(propfilePath);
		prop.load(fis);
		//read data
		String value=prop.get(key).toString();
		if(StringUtils.isEmpty(value)) {
			throw new Exception("value is not specified"+key+"in properties file"); 
		}
		return value;
		
	}

}

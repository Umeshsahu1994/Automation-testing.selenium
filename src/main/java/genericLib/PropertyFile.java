package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getPropertydata(String key) throws IOException {
		
		Properties p=new Properties();
		FileInputStream f=new FileInputStream(AutoConstant.propertyfilPath);
		p.load(f);
		return p.getProperty(key);
	}

}

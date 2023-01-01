package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryLogin;
import pomPages.Testing;
import pomPages.skillrarydemologin;

public class Testcase2 extends StepGroup { 
	
	@Test
	public void tc2() throws IOException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.gearsbutton();
		s.demoapp();
		
	   skillrarydemologin s1=new skillrarydemologin(driver);
	   ubd.switchTabs(driver);
	   ubd.dropdown(s1.getDropsearch(),pdata.getPropertydata("dropsearch"));
	   
	   Testing t=new Testing(driver);
	   ubd.draganddrop(driver,t.getSelenium(),t.getCart());
	   Point loc = t.getFacebook().getLocation();
	   int x = loc.getX();
	   int y = loc.getY();
	   
	   ubd.scrollbar(driver, x, y);
	   t.facebookicon();
		
	}

}

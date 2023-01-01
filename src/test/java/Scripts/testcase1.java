package Scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.AddtoCart;
import pomPages.SkillraryLogin;
import pomPages.skillrarydemologin;

public class testcase1 extends StepGroup {
 
	@Test
	public void tc1() {
	SkillraryLogin sk=new SkillraryLogin(driver);	
	sk.gearsbutton();
	sk.demoapp();
    
	skillrarydemologin sk1=new skillrarydemologin(driver);
    ubd.switchTabs(driver);
    ubd.MouseHover(driver,sk1.getCoursebtn());
    sk1.selenimtrainbtn();
    
    AddtoCart ad=new AddtoCart(driver);
    ubd.doubleClick(driver,ad.getAddbtn());
    ad.addbutton();
    ubd.alretpopup(driver);
}
	
}

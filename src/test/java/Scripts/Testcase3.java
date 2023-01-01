package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryLogin;
import pomPages.Wishlist;
import pomPages.seleniumforcorejava;

public class Testcase3 extends StepGroup {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.searchbox(pdata.getPropertydata("coursename"));
		s.submitbttn();
		
		seleniumforcorejava sc=new seleniumforcorejava(driver);
		sc.corejavatab();
		s.closetab();
		
		Wishlist w=new Wishlist(driver);
		ubd.switchframe(driver);
		w.playbtn();
		Thread.sleep(10000);
		ubd.switchbackframe(driver);
		w.wishlistab();
		
	}

}

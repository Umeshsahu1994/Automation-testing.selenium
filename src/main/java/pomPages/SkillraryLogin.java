package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement dempbtn;
	
	@FindBy(name="q")
	private WebElement searchtab;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closebtn;
	
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void gearsbutton() {
		gearbtn.click();
	}
	public void demoapp() {
		dempbtn.click();
	}
	public void searchbox(String crse) {
		searchtab.sendKeys(crse);
	}
	public void submitbttn() {
		searchbtn.click();
	}
	public void closetab() {
		closebtn.click();
	}
}

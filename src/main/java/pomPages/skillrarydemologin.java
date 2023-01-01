package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarydemologin {
	@FindBy(id="course")
	private WebElement coursebtn;
    @FindBy(xpath="//a[text()='Selenium Training']")
    private WebElement selnmtbtm;
    public WebElement getDropsearch() {
		return dropsearch;
	}
	@FindBy(name="addresstype")
    private WebElement dropsearch;
public skillrarydemologin(WebDriver d) {
	PageFactory.initElements(d,this);
}
public WebElement getCoursebtn() {
	return coursebtn;
}
public void selenimtrainbtn() {
	selnmtbtm.click();
}


}

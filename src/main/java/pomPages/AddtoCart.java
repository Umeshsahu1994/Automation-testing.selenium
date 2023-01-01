package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(id="add")
	private WebElement addbtn;
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addcart;
	
	public AddtoCart(WebDriver d) {
		PageFactory.initElements(d,this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addbutton() {
		 addcart.click();
	}

}

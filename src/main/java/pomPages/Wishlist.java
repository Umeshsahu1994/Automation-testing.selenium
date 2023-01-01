package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement play;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	
	
	public Wishlist(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbtn() {
		play.click();
	}
	public void pausebtn() {
		pause.click();
	}
	public void wishlistab() {
		wishlistbtn.click();
	}

}

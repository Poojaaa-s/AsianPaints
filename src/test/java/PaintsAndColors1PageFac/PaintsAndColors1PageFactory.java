package PaintsAndColors1PageFac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaintsAndColors1PageFactory {
	WebDriver driver;
@FindBy(xpath="//span[@class='iconTextLinks__text visible-in-Desktop']") //To select PaintsAndColors tab
WebElement iconTextLinks;
@FindBy(xpath="//a[@href='https://www.asianpaints.com/catalogue/interior-textures.html']") //To select initerior textures 
WebElement interior;
@FindBy(xpath="//a[@href='https://www.asianpaints.com/catalogue/exterior-textures.html']") //To select exterior textures 
WebElement exterior;
@FindBy(xpath="//a[@href='https://www.asianpaints.com/products/wood-and-metals.html']") //To select wood paints 
WebElement wood;
@FindBy(xpath="//a[@href='https://www.asianpaints.com/products/wood-and-metals/metal-enamels.html']") //To select metal paints
WebElement metals;

public PaintsAndColors1PageFactory(WebDriver driver)
{ 
	this.driver=driver;
	PageFactory.initElements(driver,this);
 }
public void PaintsAndColors1(WebElement PaintsAndColors)
{
	PaintsAndColors.click();
}
public void p1()
{
	iconTextLinks.click();
}
public void p2()
{
	interior.click();
}
public void p3()
{
	exterior.click();
}
public void p4()
{
	wood.click();
}
public void p5()
{
	 metals.click();
}
}
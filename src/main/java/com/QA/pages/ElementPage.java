package com.QA.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.joran.action.Action;

public class ElementPage extends BaseClass {

	// Xpath for refference
	//// *[local-name()='svg' and contains(@class,
	// 'rct-icon')]/*[local-name()='path' and contains(@d, 'M10]
	// span[contains(text(),'Desktop')]/preceding::button//*[local-name()='svg' and
	// contains(@class,'rct-icon-expand-close')]

	@FindBy(xpath = "//div[@class=\"header-text\"][contains(text(),'Elements')]")
	WebElement Elementmenu;
	@FindBy(xpath = "//div[contains(text(), \"Please\")]")
	WebElement pagetitle;
	@FindBy(xpath = "//span[contains(text(),\"Text Box\")]")
	WebElement textboxmenu;
	@FindBy(id = "userName") // (xpath="//input[@id=\"userName\"]")
	WebElement nameField;
	@FindBy(id = "userEmail")
	WebElement emailField;
	@FindBy(id = "currentAddress")
	WebElement currAddressField;
	@FindBy(id = "permanentAddress")
	WebElement permAddrsField;
	@FindBy(id = "submit")
	WebElement submitBtn;
	@FindBy(xpath = "//div[@id='output']//p[@id='name']")
	WebElement outputName;
	@FindBy(xpath = "//div[@id='output']//p[@id='email']")
	WebElement outputemail;
	@FindBy(xpath = "//div[@id='output']//p[@id='currentAddress']")
	WebElement outputcuraddr;
	@FindBy(xpath = "//div[@id='output']//p[@id='permanentAddress']")
	WebElement outputperaddr;

	@FindBy(xpath = "//span[contains(text(),'Check')]")
	WebElement checkboxmenu;

	@FindBy(xpath = "//button[@title='Toggle'][@type='button']")
	WebElement toggleCBbtn;
	@FindBy(css = ".rct-checkbox svg.rct-icon") //// span[contains(text(),'Home')][@class='rct-title']// rct-checkbox
	WebElement homeCB;
	@FindBy(xpath = "//span[contains(text(),'Desktop')]//preceding-sibling::span[@class='rct-checkbox']//*[local-name()='svg']")
	WebElement desktopCB; //// span[contains(text(),'Desktop')]/preceding-sibling::span[2]

	@FindBy(xpath = "//span[contains(text(),'Documents')]//preceding-sibling::span[@class='rct-checkbox']//*[local-name()='svg']")
	WebElement docCB; //// span[contains(text(),'Documents')]/preceding-sibling::span[2]
	@FindBy(xpath = "//span[contains(text(),'Download')]//preceding-sibling::span[@class='rct-checkbox']//*[local-name()='svg']")
	WebElement downloadCB;
	@FindBy(xpath = "//span[contains(text(),'Notes')]/preceding-sibling::span[2]")
	WebElement notesCB;
	@FindBy(xpath = "//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-970x250-1_0']")
	WebElement iframeele;
	@FindBy(css = ".rct-collapse-btn svg.rct-icon-expand-close") // (xpath="(//span[@class='rct-text'])[1]")
	WebElement togglebtn1;
	@FindBy(xpath = "//span[contains(text(),'Desktop')]//preceding::button[contains(@class,'rct-collapse')][1]")
	WebElement togglebtn2;
	@FindBy(xpath = "(//span[@class='rct-text' ])[3]")
	WebElement togglebtn3;
	@FindBy(xpath = "(//span[@class='rct-text' ])[4]")
	WebElement togglebtn4;
	@FindBy(xpath = "//span[contains(text(),'Desktop')]//following::span[@class='rct-checkbox']")
	List<WebElement> list;
	// @FindBy (css= ".rct-checkbox svg.rct-icon")
	// WebElement Homepath;
	@FindBy(xpath = "//div[@class='rct-options']/button[contains(@class,'rct-option-expand-all')]")
	WebElement expandallbtn;
	@FindBy(xpath = "//button[@title='Toggle'][@type='button']//following::span[@class='rct-checkbox']")
	List<WebElement> ListofCB;
	@FindBy(xpath = "//span[contains(text(),'Radio Button')]")
	WebElement radiobtnmenu;
	@FindBy(xpath = "//label[contains(text(),'Yes')]")
	WebElement YesRBlbl;
	@FindBy(xpath = "//label[contains(text(),'Yes')]/preceding::input")
	WebElement YRB;
	@FindBy(xpath = "//label[contains(text(),'Impressive')]")
	WebElement imprRBlbl;
	@FindBy(xpath = "//input[contains(@id,'impressiveRadio')]")
	WebElement impRB;
	@FindBy(xpath = "//label[contains(text(),'No')]")
	WebElement NodisabledRBlbl;
	@FindBy(xpath = "//input[contains(@id,'noRadio')]")
	WebElement NoRB;
	@FindBy(xpath = "//span[contains(text(),'Web Tables')]")
	WebElement webtableMenu;
	@FindBy(xpath = "//button[@id='addNewRecordButton']")
	WebElement addbtn;
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement Fnamefield;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lnamefield;
	@FindBy(css = "#userEmail")
	WebElement emailfield;
	@FindBy(xpath = "//input[@id='age']")
	WebElement agefield;
	@FindBy(xpath = "//input[@id='salary']")
	WebElement salfield;
	@FindBy(xpath = "//input[@id='department']")
	WebElement deptfield;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitbtn;
	@FindBy(xpath = "//input[@id='searchBox']")
	WebElement searchbtn;
	@FindBy(xpath = "//div[@class='rt-td' and contains(text(),'Testfname')]")
	WebElement fnametblcell;
	@FindBy(xpath = "//span[contains(text(),'Buttons')]")
	WebElement buttonsMenu;
	@FindBy(xpath = "//button[contains(@id,'doubleClickBtn')]")
	WebElement dblclickbtn;
	@FindBy(xpath = "//button[contains(text(),'Right Click Me')]")
	WebElement rightclickbtn;
	@FindBy(xpath = "//div/button[starts-with(text(),'Click Me')]") //// p[@id='rightClickMessage']/preceding::button[1]
	WebElement clickbtn;
	@FindBy(xpath = "//p[@id='doubleClickMessage']")
	WebElement dblclkMsg;
	@FindBy(xpath = "//p[@id='rightClickMessage']")
	WebElement rightclkMsg;
	@FindBy(xpath = "//p[@id='dynamicClickMessage']")
	WebElement clkMsg;
	@FindBy(xpath = "//li[@id='item-5']/span[contains(@class, 'text') and contains(text(), 'Links')]")
	WebElement Links;
	@FindBy(xpath="//strong[contains(text(),'Following links will open new tab')]")
	WebElement linkpagetitle;
	@FindBy(linkText = "Home")
	WebElement homelink;
	@FindBy(partialLinkText="Home")
	WebElement home1;
	@FindBy(xpath="//strong[contains(text(),'Following links will send an api call')]")
	WebElement linkpagetitle2;
	@FindBy(linkText = "Created")
	WebElement created_Ele;
	@FindBy(linkText = "No Content")
	WebElement noContent_Ele;
	@FindBy(linkText = "Moved")
	WebElement moved_Ele;
	@FindBy(linkText = "Bad Request")
	WebElement badReq_Ele;
	@FindBy(linkText = "Unautherized")
	WebElement unautherized_Ele;
	@FindBy(linkText = "forbidden")
	WebElement forbidden_Ele;
	@FindBy(linkText = "Not Found")
	WebElement notFound_Ele;
	@FindBy(xpath="//p[@id='linkResponse'] 	")
	WebElement LinkResponse;

	public ElementPage()

	{
		PageFactory.initElements(driver, this);
	}

	public String verifytitle() {
		return pagetitle.getText();
	}

	public void verifyTextboxForm() {
		textboxmenu.click();
		nameField.sendKeys("Testname");
		emailField.sendKeys("TestEmail@gmail.com");
		currAddressField.sendKeys("Test current Address");
		permAddrsField.sendKeys("Test Permanent Address");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
		submitBtn.click();

	}

	public String getOutputName() {
		return outputName.getText();
	}

	public String getOutputEmail() {
		return outputemail.getText();
	}

	public String getOutputCaddr() {
		return outputcuraddr.getText();
	}

	public String getOutputPaddr() {
		return outputperaddr.getText();
	}

	public boolean verifyhomeCheckbox() {
		checkboxmenu.click();

		// driver.switchTo().frame(iframeele);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", homeCB);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(homeCB)).click();
		// homeCB.click();
		boolean ischeck = homeCB.getAttribute("class").contains("-check");
		System.out.println(ischeck);
		return ischeck;
		// toggleCBbtn.click();

	}

	public boolean verifyDesktocheck() throws InterruptedException {
		checkboxmenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", togglebtn1);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(togglebtn1)).click();
		// boolean ischeck=
		// !desktopCB.findElements(By.cssSelector(".rct-icon-check")).isEmpty();
		boolean isuncheck = desktopCB.getAttribute("class").contains("-uncheck");

		System.out.println("Before click - Is checkbox unchecked? " + isuncheck);

		Thread.sleep(1000);
		desktopCB.click();

		boolean ischeck = desktopCB.getAttribute("class").contains("-check");

		// System.out.println("Before click - Is checkbox checked? " + ischeck);

		System.out.println(ischeck);
		System.out.println("After click - Is checkbox checked? " + ischeck);

		return ischeck;

	}

	public int verifyExpandallCBbtn() {
		checkboxmenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expandallbtn);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(expandallbtn)).click();
		// boolean isuncheck=desktopCB.getAttribute("class").contains("-uncheck");

		// WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5000));
		// wait1.until(ExpectedConditions.elementToBeClickable(togglebtn2)).click();
		System.out.println(ListofCB.size());
		return ListofCB.size();

	}

	public boolean verifyDocCB() throws InterruptedException {
		checkboxmenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", togglebtn1);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(togglebtn1)).click();
		// boolean ischeck=
		// !desktopCB.findElements(By.cssSelector(".rct-icon-check")).isEmpty();
		// WebElement svgicon=docCB.findElement(By.cssSelector("svg.rct-icon"));

		boolean isuncheck = docCB.getAttribute("class").contains("-uncheck");

		System.out.println("Before click - Is checkbox unchecked? " + isuncheck);
		System.out.println("isuncheck: " + isuncheck);
		// System.out.println("ischeck: "+ischeck);

		Thread.sleep(1000);

		docCB.click();

		boolean ischeck = docCB.getAttribute("class").contains("-check");

		// ischeck=svgicon.getAttribute("class").contains("-check");
		// System.out.println("Before click - Is checkbox checked? " + ischeck);

		System.out.println("ischeck: " + ischeck);
		System.out.println("After click - Is checkbox checked? " + ischeck);

		return ischeck;

	}

	public boolean verifyDownloadCB() {
		checkboxmenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", togglebtn1);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(togglebtn1)).click();
		boolean isuncheck = downloadCB.getAttribute("class").contains("-uncheck");

		System.out.println("Before click - Is checkbox unchecked? " + isuncheck);
		System.out.println("isuncheck: " + isuncheck);
		// System.out.println("ischeck: "+ischeck);

		downloadCB.click();

		boolean ischeck = downloadCB.getAttribute("class").contains("-check");
		System.out.println("ischeck: " + ischeck);
		System.out.println("After click - Is checkbox checked? " + ischeck);

		return ischeck;

	}

	public boolean verifyYesRB() {
		radiobtnmenu.click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", YesRBlbl);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(YesRBlbl));
		YesRBlbl.click();

		boolean flag = YRB.isSelected();
		return flag;
	}

	public boolean verifyimpressiveRB() {
		radiobtnmenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", imprRBlbl);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(imprRBlbl));
		imprRBlbl.click();

		boolean flag = impRB.isSelected();
		return flag;
	}

	public boolean verifyNodisabledRB() {
		radiobtnmenu.click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", NodisabledRBlbl);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(NodisabledRBlbl));

		boolean flag = NoRB.isEnabled();
		return flag;
	}

	public String verifyWebtableEntry() {
		webtableMenu.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(addbtn));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addbtn);

		addbtn.click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Fnamefield);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.visibilityOf(Fnamefield));
		Fnamefield.sendKeys("Testfname");

		lnamefield.sendKeys("TestFname");
		emailfield.sendKeys("Testfname@gmail.com");
		agefield.sendKeys("20");
		salfield.sendKeys("25000");
		deptfield.sendKeys("Test Department");

		submitbtn.click();

		searchbtn.sendKeys("Testfname");
		String fnamedata = fnametblcell.getText();
		return fnamedata;

	}

	public String verifyDoubleclick() {

		buttonsMenu.click();
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.elementToBeClickable(addbtn));
		Actions action = new Actions(driver);
		action.doubleClick(dblclickbtn).perform();

		String doubleclickmsgtext = dblclkMsg.getText();

		return doubleclickmsgtext;

	}

	public String verifyrightclick() {

		buttonsMenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rightclickbtn);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(rightclickbtn));
		Actions action = new Actions(driver);
		action.contextClick(rightclickbtn).perform();

		String rightClickMsgText = rightclkMsg.getText();

		return rightClickMsgText;

	}

	public String verifyclick() {

		buttonsMenu.click();
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.elementToBeClickable(addbtn));
		// Actions action=new Actions(driver);
		// action.contextClick(rightclickbtn).perform();

		clickbtn.click();

		String clickMsgText = clkMsg.getText();

		return clickMsgText;

	}
	public String verifyLinksBtn()
	{
		Links.click();
		String linksPagetitle=linkpagetitle.getText();
		return linksPagetitle;
		
	}
	public String verifyHomeLinksBtn()
	{
		Links.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homelink);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(homelink));
		
		homelink.click();
		String Homelinkstr=homelink.getAttribute("href");
		return Homelinkstr;
		
	}

}

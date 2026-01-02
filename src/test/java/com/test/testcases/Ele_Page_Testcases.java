package com.test.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.pages.BaseClass;
import com.QA.pages.DemoQA_Mainpage;
import com.QA.pages.ElementPage;
import org.testng.Assert;

public class Ele_Page_Testcases extends BaseClass {
	DemoQA_Mainpage DM;
	ElementPage EP;

	public Ele_Page_Testcases() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		DM = new DemoQA_Mainpage();
		EP = DM.ValidateElePage();
	}

	@Test(enabled = false)
	public void validateTitle() {
		String pagetitleact = EP.verifytitle();
		String pagetitleexp = "Please select an item from left to start practice.";
		Assert.assertEquals(pagetitleexp, pagetitleact);
	}

	@Test(enabled = false)
	public void verifyTextbox() {
		EP.verifyTextboxForm();

		String OutputNameact = EP.getOutputName();
		String OutputEmailact = EP.getOutputEmail();
		String OutputCaddract = EP.getOutputCaddr();
		String OutputPaddract = EP.getOutputPaddr();
		System.out.println(OutputNameact);
		System.out.println(OutputEmailact);
		System.out.println(OutputCaddract);
		System.out.println(OutputPaddract);

		Assert.assertEquals("Name:Testname", OutputNameact);
		Assert.assertEquals("Email:TestEmail@gmail.com", OutputEmailact);
		Assert.assertEquals("Current Address :Test current Address", OutputCaddract);
		Assert.assertEquals("Permananet Address :Test Permanent Address", OutputPaddract);
	}

	@Test(priority = 0, enabled = false)
	public void verifyHomeCheckboxTest() {
		boolean flag = EP.verifyhomeCheckbox();
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test(enabled = false)
	public void verifyDesktocheckTest() throws InterruptedException {
		boolean flag = EP.verifyDesktocheck();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test(enabled = false)
	public void verifyAllCBListtestcase() {
		int size = EP.verifyExpandallCBbtn();
		Assert.assertEquals(17, size);
	}

	@Test(enabled = false)
	public void verifyDocumentCBTest() throws InterruptedException {
		boolean flag = EP.verifyDocCB();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test(enabled = false)
	public void verifyDownloadCBTest() {
		boolean flag = EP.verifyDownloadCB();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test(priority = 0, enabled = false)
	public void verifyYesRBTestcase() {
		boolean flag = EP.verifyYesRB();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test(priority = 1, enabled = false)
	public void verifyimpressiveRBTestcase() {
		boolean flag = EP.verifyimpressiveRB();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test(priority = 2, enabled = false)
	public void verifyNodisabledRBTestcase() {
		boolean flag = EP.verifyNodisabledRB();
		System.out.println(flag);
		Assert.assertFalse(flag);
	}

	@Test(enabled = false)
	public void verifyWebtableEntryTestcase() {
		// EP.verifyWebtableEntry();
		String verifysearch = EP.verifyWebtableEntry();
		System.out.println("search Fname value" + verifysearch);
		Assert.assertEquals(verifysearch, "Testfname");

	}

	@Test(enabled = false)
	public void verifyDoubleClick() {
		String Actualmsg = EP.verifyDoubleclick();
		System.out.println(Actualmsg);
		Assert.assertEquals(Actualmsg, "You have done a double click");

	}

	@Test (enabled = false)
	public void verifyrightClick() {
		String Actualmsg = EP.verifyrightclick();
		System.out.println(Actualmsg);
		Assert.assertEquals(Actualmsg, "You have done a right click");

	}

	@Test(enabled = false)
	public void verifyClick() {
		String Actualmsg = EP.verifyclick();
		System.out.println(Actualmsg);

		Assert.assertEquals(Actualmsg, "You have done a dynamic click");

	}
	
	@Test(enabled= false)
	public void validateLinkPagetitle()
	{
		String acttitle=EP.verifyLinksBtn();
		String exptitle="Following links will open new tab";
		System.out.println(acttitle);
		Assert.assertEquals(acttitle, exptitle,"Title matches");
	}
	@Test(enabled=false)
	public void validateHomeLink()
	{
		String actlink=EP.verifyHomeLinksBtn();
		String explink="https://demoqa.com/";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
	}
	
	@Test(enabled=false)
	public void validatesecodHomeLink()
	{
		String actlink=EP.verifysecondHomeLink();
		String explink="https://demoqa.com/";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
	}
	@Test(enabled=false)
	public void validateAPILinkCreated()
	{
		String actlink=EP.verifyAPILinkcreated();
		String explink="Link has responded with staus 201 and status text Created";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("201"));
		Assert.assertTrue(actlink.contains("Created"));

	}
	
	@Test(enabled=false)
	public void validateAPILinkNoContent()
	{
		String actlink=EP.verifyAPILinkNoContent();
		String explink="Link has responded with staus 204 and status text No Content";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("204"));
		Assert.assertTrue(actlink.contains("No Content"));

	}
	@Test(enabled=false)
	public void validateAPILinkMoved()
	{
		String actlink=EP.verifyAPILinkMoved();
		String explink="Link has responded with staus 301 and status text Moved Permanently";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("301"));
		Assert.assertTrue(actlink.contains("Moved Permanently"));

	}
	
	@Test(enabled=false)
	public void validateAPILinkBadReq()
	{
		String actlink=EP.verifyAPILinkBadReq();
		String explink="Link has responded with staus 400 and status text Bad Request";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("400"));
		Assert.assertTrue(actlink.contains("Bad Request"));

	}
	@Test(enabled=false)
	public void validateAPILinkUnauthorized()
	{
		String actlink=EP.verifyAPILinkUnauthorized();
		String explink="Link has responded with staus 401 and status text Unauthorized";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("401"));
		Assert.assertTrue(actlink.contains("Unauthorized"));

	}
	@Test(enabled=false)
	public void validateAPILinkForbidden()
	{
		String actlink=EP.verifyAPILinkForbidden();
		String explink="Link has responded with staus 403 and status text Forbidden";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("403"));
		Assert.assertTrue(actlink.contains("Forbidden"));

	}
	@Test(enabled=false)
	public void validateAPILinknotFound()
	{
		String actlink=EP.verifyAPILinkNotfound();
		String explink="Link has responded with staus 404 and status text Not Found";
		System.out.println(actlink);
		Assert.assertEquals(actlink, explink,"Title matches");
		Assert.assertTrue(actlink.contains("404"));
		Assert.assertTrue(actlink.contains("Not Found"));

	}
	
	@Test(enabled=false) 	
	public void ValidateBrokenlinks()
	{
		int brokenlink_count=EP.VerifykbrokenLink();
		Assert.assertEquals(brokenlink_count, 1,"Broken Link found" +brokenlink_count);
	}
	
	@Test
	public void ValidateBrokenImgs()
	{
		int brokenImg_count=EP.VerifykbrokenImgs();
		Assert.assertEquals(brokenImg_count, 1,"Broken Link found" +brokenImg_count);
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

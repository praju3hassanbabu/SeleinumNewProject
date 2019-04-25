package cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testmepages.AdminPages;

public class CaseStudy_1 
{
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, AdminPages.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("Alex login as admin")
	public void alex_login_as_admin() 
	{
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("Add a Product with all credentials filled")
	public void add_a_Product_with_all_credentials_filled() {
		
		AdminPages.addproductbutton.click();
		AdminPages.category.click();
		AdminPages.subcategory.click();
		//AdminPages.prodid.sendKeys("HP_Icore_9");
		//AdminPages.priceid.sendKeys("15000");
		//AdminPages.quantityid.sendKeys("10");
		//AdminPages.brandid.sendKeys("HP");
		//AdminPages.description.sendKeys("HP 15 Core i3 7th gen 15.6-inch FHD Laptop "
			//	+ "(4GB/1TB HDD/Windows 10 Home/MS Office/Sparkling Black "
			//	+ "/2.04 kg), 15q-ds0007TU");
		
		
		
	}

	@Then("In Customers Home page should display product")
	public void in_Customers_Home_page_should_display_product() {
	   
	}
}

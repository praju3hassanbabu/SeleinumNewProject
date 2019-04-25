package testmepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPages 
{
	/*
	 * @FindBy(how = How.ID,using="userName") public static WebElement logintext;
	 * 
	 * @FindBy(how = How.ID,using="password") public static WebElement password;
	 * 
	 * @FindBy(how = How.CSS,using="input[value='Login']") public static WebElement
	 * loginbutton;
	 * 
	 * @FindBy(how = How.PARTIAL_LINK_TEXT,using="Add Category") public static
	 * WebElement addcategorybutton;
	 * 
	 * @FindBy(how = How.ID,using="catgName") public static WebElement catgName;
	 * 
	 * @FindBy(how = How.ID,using="catgDesc") public static WebElement catgDesc;
	 * 
	 * @FindBy(how = How.XPATH,using=
	 * "/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")
	 * public static WebElement addbuttoncategory;
	 * 
	 * 
	 * 
	 * @FindBy(how = How.ID,using="Add Sub Category") public static WebElement
	 * subcategorybutton;
	 * 
	 * @FindBy(how = How.XPATH,using="//*[@id=\'subCatgId\']") public static
	 * WebElement categoryname;
	 * 
	 * 
	 * @FindBy(how = How.ID,using="subCatgName") public static WebElement
	 * subCatgName;
	 * 
	 * @FindBy(how = How.ID,using="subCatgDesc") public static WebElement
	 * subCatgDesc;
	 * 
	 * @FindBy(how = How.CSS,using="input[data-validation='required']") public
	 * static WebElement addrequiredbutton;
	 */
	
	
	@FindBy(how = How.PARTIAL_LINK_TEXT,using="Add Product")
	public static WebElement addproductbutton;
	
	@FindBy(how = How.CSS,using="option[value='11290']")
	public static WebElement category;
	
	@FindBy(how = How.ID,using="option[value='112112']")
	public static WebElement subcategory;
	
	@FindBy(how = How.ID,using="prodid")
	public static WebElement prodid;
	
	@FindBy(how = How.ID,using="priceid")
	public static WebElement priceid;
	
	@FindBy(how = How.ID,using="quantityid")
	public static WebElement quantityid;
	
	@FindBy(how = How.ID,using="brandid")
	public static WebElement brandid;
	
	@FindBy(how = How.ID,using="description")
	public static WebElement description;
	
	
	
	  @FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]") 
	  public static WebElement addbutton;
	  
	/*
	 * @FindBy(how = How.XPATH,using="/html/body/main/div/div/div/div[4]/button")
	 * public static WebElement viewproduct;
	 * 
	 * @FindBy(how = How.CSS,using="View Products") public static WebElement
	 * viewproductbutton;
	 */
	 
	
	       	
	
}

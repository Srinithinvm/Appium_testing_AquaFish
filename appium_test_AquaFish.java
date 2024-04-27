package appium_test2;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.URI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
public class appium_test_AquaFish {

	static AppiumDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Working.....");
try {
	System.out.println("Application Started...");
	test_01_Open_AquaFish();
	System.out.println("Testing...(Open_AquaFish_01()...Passed)");
	Thread.sleep(5000);
	test_02_TraderDetails();
	System.out.println("Passed)");
	test_03_TraderDetails();
	System.out.println("Passed)");
//	test_04_TraderDetails();
//	System.out.println("Passed)");
//	test_05_TraderDetails();
//	System.out.println("Passed)");
//	test_06_TraderDetails();
//	System.out.println("Passed)");
//	test_07_TraderDetails();
//	System.out.println("Passed)");
//	test_08_TraderDetails();
//	System.out.println("Passed)");
//	test_09_TraderDetails();
//	System.out.println("Passed)");
//	test_10_TraderDetails();
//	System.out.println("Passed)");
//	test_11_TraderDetails();
//	System.out.println("Passed)");
//	test_12_TraderDetails();
//	System.out.println("Passed)");
//	test_13_TraderDetails();
//	System.out.println("Passed)");
//	test_14_TraderDetails();
//	System.out.println("Passed)");
//	test_15_TraderDetails();
//	System.out.println("Passed)");	
//	test_16_TraderDetails();
//	System.out.println("Passed)");	
//	test_17_TraderDetails();
//	System.out.println("Passed)");	
//	test_18_TraderDetails();
//	System.out.println("Passed)");	
//	test_19_TraderDetails();
//	System.out.println("Passed)");	
//	test_20_TraderDetails();
//	System.out.println("Passed)");	
//	test_21_TraderDetails();
//	System.out.println("Passed)");	
//	test_22_TraderDetails();
//	System.out.println("Passed)");
//	test_23_TraderDetails();
//	System.out.println("Passed)");
//	test_24_TraderDetails();
//	System.out.println("Passed)");
//	test_25_TraderDetails();
//	System.out.println("Passed)");
//	test_26_TraderDetails();
//	System.out.println("Passed)");
//	test_27_TraderDetails();
//	System.out.println("Passed)");
//	test_28_TraderDetails();
//	System.out.println("Passed)");
//	test_29_TraderDetails();
//	System.out.println("Passed)");
}catch(Exception exp) {
	System.out.println(exp.getCause());
	System.out.println(exp.getMessage());
	exp.printStackTrace();
}
	}
public static void test_01_Open_AquaFish()throws Exception {//to check the application view
	//System.out.print();
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Nokia 8");
	cap.setCapability("udid", "NB1GAD1820303278");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("appPackage", "com.febino.aquafish");
	cap.setCapability("appActivity", "com.febino.aquafish.MainActivity");//com.febino.aquafish.TraderActivity
	cap.setCapability("automationName", "uiautomator2");
	
	URI uri = new URI("http://127.0.0.1:4723");
	URL url = uri.toURL();
	

	driver = new AppiumDriver(url,cap);

	
}


public static void test_02_TraderDetails() throws Exception {//to test with Empty datas
	System.out.print("Testing...(TraderDetails_02()...");
	test_01_Open_AquaFish();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	
	
	Name.sendKeys("");
	Alias.sendKeys("");
	TraderID.sendKeys("");
	Mobile.sendKeys("");
	Location.sendKeys("");
//	Thread.sleep(1000);
	
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");
	
	
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.manage().timeouts();
//	Thread.sleep(2000);
	
//	String alert=msg.getText();
	String Expected_Text="Give input for Trader Name";
	Assert.assertEquals(Expected_Text,Actual_Text);   
//	
}

public static void test_03_TraderDetails() throws Exception {//to check with Empty Alias
	System.out.print("Testing...(TraderDetails_03()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("hjg");
	Alias.sendKeys("");
	TraderID.sendKeys("df");
	Mobile.sendKeys("dfg");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give input for Alias ";
	Assert.assertEquals(Expected_Text,Actual_Text);
	
}

public static void test_04_TraderDetails() throws Exception {//to check with Empty Trader ID
	System.out.print("Testing...(TraderDetails_04()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("hjg");
	Alias.sendKeys("df");
	TraderID.sendKeys("");
	Mobile.sendKeys("dfg");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give input for Trader ID";
	Assert.assertEquals(Expected_Text,Actual_Text);
	
}

public static void test_05_TraderDetails() throws Exception {//to check with Empty Mobile Number
	System.out.print("Testing...(TraderDetails_05()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("hjg");
	Alias.sendKeys("df");
	TraderID.sendKeys("ABC12");
	Mobile.sendKeys("");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give input for Mobile";
	Assert.assertEquals(Expected_Text,Actual_Text);
	
}

public static void test_06_TraderDetails() throws Exception {//to check with Empty Location
	System.out.print("Testing...(TraderDetails_06()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("hjg");
	Alias.sendKeys("df");
	TraderID.sendKeys("ABC12");
	Mobile.sendKeys("1232122222");
	Location.sendKeys("");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give input for Location";
	Assert.assertEquals(Expected_Text,Actual_Text);
	
}

public static String explicitWaitForToastMsg(AppiumDriver appiumDriver, int timeinSeconds, String returnString) {
	int loopcount = timeinSeconds;
	while(loopcount > 0) {
		try {
			Thread.sleep(1000);
			String msg = appiumDriver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
			return msg;
		}catch (Exception e) {
		}
		loopcount--;
	}
	return returnString;
}

public static void test_07_TraderDetails() throws Exception {//to test with Space as input
	System.out.print("Testing...(TraderDetails_07()...");
	test_01_Open_AquaFish();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("  ");
	Alias.sendKeys("  ");
	TraderID.sendKeys("  ");
	Mobile.sendKeys(" ");
	Location.sendKeys(" ");
	okbut.click();
//	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Space not allowed";
	Assert.assertEquals(Expected_Text,Actual_Text);  	
}

public static void test_08_TraderDetails() throws Exception {//to check with only numbers
	System.out.print("Testing...(TraderDetails_08()...");
	test_01_Open_AquaFish();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("34");
	Alias.sendKeys("3453");
	TraderID.sendKeys("3453");
	Mobile.sendKeys("345");
	Location.sendKeys("345");
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give valid input for Trader ID";
	Assert.assertEquals(Expected_Text,Actual_Text);  
	
	
}

public static void test_09_TraderDetails() throws Exception {//to check with only alphabets
	System.out.print("Testing...(TraderDetails_09()...");
	test_01_Open_AquaFish();	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("fdd");
	Alias.sendKeys("Kdfr");
	TraderID.sendKeys("df");
	Mobile.sendKeys("dfg");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Trader ID should have five characters! ";
	Assert.assertEquals(Expected_Text,Actual_Text);
	
}



public static void test_10_TraderDetails() throws Exception {//to check Trader ID without numbers 
	System.out.print("Testing...(TraderDetails_10()...");
	test_01_Open_AquaFish();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Muhammad");
	Alias.sendKeys("Safik");
	TraderID.sendKeys("MSK");
	Mobile.sendKeys("2123212132342");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Trader ID should have atleast one numeric value! ";
	Assert.assertEquals(Expected_Text,Actual_Text);
}

public static void test_11_TraderDetails() throws Exception {//to check Trader ID with LowerCase 
	System.out.print("Testing...(TraderDetails_11()...");
	test_01_Open_AquaFish();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Muhammad");
	Alias.sendKeys("Safik");
	TraderID.sendKeys("sdd88");
	Mobile.sendKeys("2123212132342");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Trader ID should be Uppercase value! ";
	Assert.assertEquals(Expected_Text,Actual_Text);
}

public static void test_12_TraderDetails() throws Exception {//to check Mobile number by length 
	System.out.print("Testing...(TraderDetails_12()...");
	test_01_Open_AquaFish();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Muhammad");
	Alias.sendKeys("Safik");
	TraderID.sendKeys("MSK10");
	Mobile.sendKeys("2123212132342");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Please enter valid Mobile number! ";
	Assert.assertEquals(Expected_Text,Actual_Text);
}

public static void test_13_TraderDetails() throws Exception {//to check with valid inputs
	System.out.print("Testing...(TraderDetails_13()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();
//	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
//	String Expected_Text="Successfully created! ";
//	Assert.assertEquals(Expected_Text,Actual_Text);	
}

public static void test_14_TraderDetails() throws Exception {//to check with existing ID
	System.out.print("Testing...(TraderDetails_14()...");
	test_01_Open_AquaFish();
	test_13_TraderDetails();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();	
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Trader ID Already Exist ";
	Assert.assertEquals(Expected_Text,Actual_Text);	
	
}

public static void test_15_TraderDetails() throws Exception {//to check weather the module created at trader_page 
	System.out.print("Testing...(TraderDetails_15()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();	
	WebElement module=driver.findElement(By.id("com.febino.aquafish:id/trader_list_view"));
	String Actual_Text="";
	if( module.isDisplayed()){
		Actual_Text="Existing...";
	}
	else {
		Actual_Text="Not existing....";
	}
	//System.out.println(Actual_Text);
	String Expected_Text="Existing...";
	Assert.assertEquals(Expected_Text,Actual_Text);	
}
public static void test_16_TraderDetails() throws Exception {//to check weather the module created at trader_page 
	System.out.print("Testing...(TraderDetails_16()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();	
	WebElement Actual_name=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/trader_adapter_name\"]"));
	WebElement Actual_alias=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/trader_adapter_alias\"]"));
	WebElement Actual_id=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/trader_adapter_traderid\"]"));
	WebElement Actual_locat=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/trader_adapter_location\"]"));
	String Expected_name="Anand";
	String Expected_alias="Kumar";
	String Expected_id="TRD123";
	String Expected_locat="erode";
	Assert.assertEquals(Expected_name,Actual_name);	
	Assert.assertEquals(Expected_alias,Actual_alias);	
	Assert.assertEquals(Expected_id,Actual_id);	
	Assert.assertEquals(Expected_locat,Actual_locat);	

}

public static void test_17_TraderDetails() throws Exception {//to check weather the module delete option showing
	System.out.print("Testing...(TraderDetails_17()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();	
	WebElement module=driver.findElement(By.id("com.febino.aquafish:id/trader_list_view"));

	Actions actions = new Actions(driver);
	actions.clickAndHold(module).perform();
}

public static void test_18_TraderDetails() throws Exception {//to check weather the module delete 
	System.out.print("Testing...(TraderDetails_18()...");
	test_01_Open_AquaFish();
	
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();	
	WebElement module=driver.findElement(By.id("com.febino.aquafish:id/trader_list_view"));

	Actions actions = new Actions(driver);
	actions.clickAndHold(module).perform();
	
//	WebElement warningmsg = driver.findElement(By.id("com.febino.aquafish:id/warning_delete_message_textview"));
//	String Expected_msg="Do you want to Delete Trader?";
//	Assert.assertEquals(Expected_msg,warningmsg);	
//	WebElement id = driver.findElement(By.id("com.febino.aquafish:id/warning_delete_name_textview"));
//	String Expected_name="Anand";
//	Assert.assertEquals(Expected_name,id);	
	WebElement delete=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/warning_dialog_yes_btn\"]"));
	delete.click();
	
}

public static void test_19_TraderDetails() throws Exception {//to test with Stock_page
	System.out.print("Testing...(TraderDetails_19()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement title=driver.findElement(By.xpath("//android.widget.TextView[@text=\"STOCK\"]"));
	String Expected_title="STOCK";
	String Actual_title=title.getText();
	Assert.assertEquals(Expected_title,Actual_title);
}

public static void test_20_TraderDetails() throws Exception {//to test Stock_page by adding stock
	System.out.print("Testing...(TraderDetails_20()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement text=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/stock_entry_header_textview\"]"));
	String Actual_text=text.getText();
	String Expected_Text="Stock Entry";
	Assert.assertEquals(Expected_Text,Actual_text);
	WebElement bread=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/stock_entry_name_textview\"]"));
	String Actual_text1=bread.getText();
	String Expected_Text1="Breed";
	Assert.assertEquals(Expected_Text1,Actual_text1);
	WebElement shtname=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/stock_entry_short_name_textview\"]"));
	String Actual_text2=shtname.getText();
	String Expected_Text2="Short Name";
	Assert.assertEquals(Expected_Text2,Actual_text2);
	WebElement descrip=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/stock_entry_description_textview\"]"));
	String Actual_text3=descrip.getText();
	String Expected_Text3="Description";
	Assert.assertEquals(Expected_Text3,Actual_text3);
}
public static void test_21_TraderDetails() throws Exception {//to test with Stock Emptyinputs
	System.out.print("Testing...(TraderDetails_21()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys("");
	shtname.sendKeys("");
	des.sendKeys("");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give Inputs for BreedName and ShortName fields";
	Assert.assertEquals(Expected_Text,Actual_Text);
}

public static void test_22_TraderDetails() throws Exception {//to test with Stock space
	System.out.print("Testing...(TraderDetails_22()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys(" ");
	shtname.sendKeys("    ");
	des.sendKeys(" ");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give Inputs for BreedName and ShortName fields";
	Assert.assertEquals(Expected_Text,Actual_Text);
}
public static void test_23_TraderDetails() throws Exception {//to test with Stock space
	System.out.print("Testing...(TraderDetails_23()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys(" ");
	shtname.sendKeys("xxxx");
	des.sendKeys(" ");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give Inputs for BreedName and ShortName fields";
	Assert.assertEquals(Expected_Text,Actual_Text);
}
public static void test_24_TraderDetails() throws Exception {//to test with Stock alphabets
	System.out.print("Testing...(TraderDetails_24()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys("amazing");
	shtname.sendKeys("asdadaasda");
	des.sendKeys("sdsssd");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="No data";
	Assert.assertEquals(Expected_Text,Actual_Text);
}
public static void test_25_TraderDetails() throws Exception {//to test with 
	System.out.print("Testing...(TraderDetails_25()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys("2131232");
	shtname.sendKeys("233255");
	des.sendKeys("345343");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Give inputs in letters for BreedName and ShortName";
	Assert.assertEquals(Expected_Text,Actual_Text);
}
public static void test_26_TraderDetails() throws Exception {//to test 
	System.out.print("Testing...(TraderDetails_26()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys("Rabbit");
	shtname.sendKeys("rab");
	des.sendKeys("");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	String Actual_Text=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text="Short Name Should be four Char";
	Assert.assertEquals(Expected_Text,Actual_Text);
}

public static void test_27_TraderDetails() throws Exception {//to test with Stock alphabets
	System.out.print("Testing...(TraderDetails_27()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys("Rabbit");
	shtname.sendKeys("raby");
	des.sendKeys("");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();

	WebElement addbut1=driver.findElement(By.className("android.widget.ImageButton"));
	addbut1.click();
	WebElement breed1=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname1=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des1=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed1.sendKeys("R");
	shtname1.sendKeys("raby");
	des1.sendKeys("fddf");
	WebElement okbut1=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut1.click();
	String Actual_Text1=explicitWaitForToastMsg(driver,5,"No data");	
	String Expected_Text1="Short Name Already Exsist";
	Assert.assertEquals(Expected_Text1,Actual_Text1);
}

public static void test_28_TraderDetails() throws Exception {//to check weather the module created at trader_page 
	System.out.print("Testing...(TraderDetails_28()...");
	test_01_Open_AquaFish();
	WebElement stock=driver.findElement(By.id("com.febino.aquafish:id/action_stock"));
	stock.click();
	WebElement addbut=driver.findElement(By.className("android.widget.ImageButton"));
	addbut.click();
	WebElement breed=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/stock_entry_name_edit\"]"));
	WebElement shtname=driver.findElement(By.id("com.febino.aquafish:id/stock_short_name_edit"));
	WebElement des=driver.findElement(By.id("com.febino.aquafish:id/stock_entry_description_edit"));
	breed.sendKeys("Rabbit");
	shtname.sendKeys("raby");
	des.sendKeys("gnvhbmbm");
	WebElement okbut=driver.findElement(By.id("com.febino.aquafish:id/stock_dialog_ok_btn"));
	okbut.click();
	
	WebElement name=driver.findElement(By.id("com.febino.aquafish:id/stock_individual_listview_breed_txt"));
	WebElement id=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.febino.aquafish:id/stock_individual_listview_total_box_txt\"]"));
	String Expected_name="Rabbit";
	String Actual_name=name.getText();
	String Expected_id="raby";
	String Actual_id=id.getText();
	Assert.assertEquals(Expected_name,Actual_name);	
		
	Assert.assertEquals(Expected_id,Actual_id);	
	

}

public static void test_29_TraderDetails() throws Exception {//to check weather the module delete option showing
	System.out.print("Testing...(TraderDetails_29()...");
	test_01_Open_AquaFish();
	test_28_TraderDetails();
	WebElement addbut = driver.findElement(By.id("com.febino.aquafish:id/trader_add_button"));
	addbut.click();
	WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_name_edit\"]"));
	WebElement Alias = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_alias_edit\"]"));
	WebElement TraderID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_id_edit\"]"));
	WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_phone_edit\"]"));
	WebElement Location = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.febino.aquafish:id/trader_location_edit\"]"));
	WebElement okbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/trader_dialog_ok_btn\"]"));
	Name.sendKeys("Anand");
	Alias.sendKeys("Kumar");
	TraderID.sendKeys("TRD123");
	Mobile.sendKeys("1234567890");
	Location.sendKeys("erode");
	okbut.click();	
	WebElement module=driver.findElement(By.id("com.febino.aquafish:id/trader_list_view"));

	Actions actions = new Actions(driver);
	actions.clickAndHold(module).perform();
	WebElement delete=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.febino.aquafish:id/warning_dialog_yes_btn\"]"));
	delete.click();
}

}

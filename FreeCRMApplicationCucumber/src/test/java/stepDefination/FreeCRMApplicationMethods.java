package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FreeCRMApplicationMethods {
	
	WebDriver driver;
	String applicationUrlAddres = "https://ui.freecrm.com/";
	
	@Given("^user should lauch the Chrome Browser$")
	public void user_should_lauch_the_Chrome_Browser() {
		
		System.setProperty("webriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(applicationUrlAddres);
		
	    
	}

	@When("^user enters the Free CRM Application URL Address$")
	public void user_enters_the_Free_CRM_Application_URL_Address(){
		
		String expected_CRMApplicationURLAddress = "freecrm";
		System.out.println(expected_CRMApplicationURLAddress);
		
		String  actual_CRMApplicationURLAddress =driver.getCurrentUrl();
		System.out.println(actual_CRMApplicationURLAddress);
		
		if(actual_CRMApplicationURLAddress.contains(expected_CRMApplicationURLAddress))
		{
			System.out.println("Free CRM Application URL Address is Matched: PASS");
		}
		else {
			System.out.println("Free CRM Application URL Address is Not Matched: FAIL");
		}
	   
	}

	@Then("^user should navigate to Home Page of Free CRM Application$")
	public void user_should_navigate_to_Home_Page_of_Free_CRM_Application() {
	
		String expected_CRMApplicationTitle = "Cogmento CRM";
		System.out.println(expected_CRMApplicationTitle);
		
		String actual_CRMApplicationTitle=driver.getTitle();
		System.out.println(actual_CRMApplicationTitle);
		
		//Assert.assertEquals("Title is Not Matched: FAIL",actual_CRMApplicationTitle, expected_CRMApplicationTitle );
	    if(actual_CRMApplicationTitle.equalsIgnoreCase(expected_CRMApplicationTitle))
	    {
	    	System.out.println("Title is Matched: PASS");
	    }
	    else {
	    	System.out.println("Title is NOT Matched: FAIL");
	    }
	}

	@Then("^user should close the Free CRM Application$")
	public void user_should_close_the_Free_CRM_Application() {
		
		driver.quit();
	    
	}

}

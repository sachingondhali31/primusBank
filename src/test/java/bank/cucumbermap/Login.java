package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{

	@Given ("^user opens \"(.*)\" browser with exe \"(.*)\"$")
	
	public void BrowserLaunch(String bname, String exe)
	{
		Object[] input=new Object[2];
				 input[0]=bname;
				 input[1]=exe;
		
		SeleniumOperations.browserLaunch(input);			 
	}
	
	@Given ("^user enters url \"(.*)\"$")
	public void url(String url1)
	{
		Object[] input1=new Object[1];
		input1[0]=url1;
		SeleniumOperations.applicationLaunch(input1);
	}
	
	
	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String uname) throws Throwable
	{
		Object[] input2=new Object[2];
		input2[0]="*[@id='txtuId']";
		input2[1]=uname;
		Hashtable<String,Object> input2op=SeleniumOperations.sendKey(input2);	  
		HTMLReportGenerator.StepDetails(input2op.get("status").toString(), "user enters \\\"([^\\\"]*)\\\" as username", input2op.get("Message").toString());
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String pass) throws Throwable
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]=pass;
		Hashtable<String,Object> input3op= SeleniumOperations.sendKey(input3);
		HTMLReportGenerator.StepDetails(input3op.get("status").toString(), "user enters \\\"([^\\\"]*)\\\" as password", input3op.get("Message").toString());
		
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";

		Hashtable<String,Object> input4op=SeleniumOperations.clcik(input4);
		HTMLReportGenerator.StepDetails(input4op.get("status").toString(), "user click on login button", input4op.get("Message").toString());
	}

	@Then("^user is on \"([^\"]*)\" page and get message as Welcome to Admin$")
	public void user_is_on_page_and_get_message_as_Welcome_to_Admin(String name) throws Throwable 
	{
	   Object[] login=new Object[2];
	   login[0]="";
	   login[1]=name;
	   Hashtable<String,Object> loginop=SeleniumOperations.clcik(login);
		HTMLReportGenerator.StepDetails(loginop.get("status").toString(), "user is on \\\"([^\\\"]*)\\\" page and get message as Welcome to Admin", loginop.get("Message").toString());
	   
	   
	}
	
}

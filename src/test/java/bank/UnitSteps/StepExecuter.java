 package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecuter
{

	
	
	public static void main(String[] args)
	{
		
		Object[] input=new Object[2];
		
		input[0]="Chrome";
		input[1]="F:\\Banking Project Maven\\PrimusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";		
		SeleniumOperations.browserLaunch(input);
		
		// application open 		
		Object[] input1=new Object[1];
		
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.applicationLaunch(input1);
	
		// text filed username 
        Object[] input2=new Object[2];
		
		input2[0]="//*[@id='txtuId']";
		input2[1]="Admin";
		SeleniumOperations.sendKey(input2);
		
		// password         
		Object[] input3=new Object[2];
		
		input3[0]="//*[@id='txtPword']";
		input3[1]="Admin";
		SeleniumOperations.sendKey(input3);
		
		// click
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		SeleniumOperations.clcik(input4);

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package utility;

import org.testng.annotations.Test;

@Test
public class Calculator {

public void performCalculations()
{
	System.out.println("Welcome to the calculator App");
	int num1=5;
	int num2=10;
	String operations="+";
	int result=0;
	
	switch(operations) {
	case "+":
		System.out.println("addition is being performed");
		
	     result=num1 +num2;
	     break;
	case "-":
		System.out.println("substraction  is  being performed");
	     result=num1 - num2;
	     break;
	case "*":
		System.out.println("multiplication  is  being performed");
	     result=num1 / num2;
	     break;
	case "/":
		System.out.println("division is  being performed");
	     result=num1/num2;
	     break;
	 default:
		   System.out.println("invalid operation.please try again");

            System.out.println("Result:" + result);
	
	}
	
}
}

	     
	     
	     
	     
	     
	
	    
	    
	    	
	
	
	
	
	




package com.LoopJava;

public class WhileLoop {
    
	public void displayNum()  //DisplayingNumbersFrom1To10
	{
		int num = 1;
		int num1 = 10;
		
		//while loop from 1 to 10
		while(num <= num1)
		{
			System.out.println(num);
			num++;
		}
	}
	
	public void displaySequence()   //DisplayNumberSequenceAndEliminate4
	{
		int intSum = 0;
		while(intSum<10)
		{
			if(intSum == 4)
			{
				intSum++;
				continue;
			}
			System.out.println(intSum);
			intSum++;
		}
	}
	
	
	
	 public void dataUsingWhile()           //PrintTillOctAndDisplayOnlyOct
	 {
		 String strArray[] = {"Jan","Feb","March","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
		 int intCounter=0;
		 
		 while(true)  {
			 System.out.println("Array data: "+strArray[intCounter]);
			 if(strArray[intCounter].equals("Oct")) {
				 System.out.println("Oct is Present");
				 break;
			 }
			 intCounter++;
			 }
		 }
		 
	
	 public void breakloop()            //BreakLoopss
	 {
	 for (int count = 0; count < 10; count++) {
	 // Terminate the loop when count is 5
	 if (count == 3)
	 break;
	 System.out.println("count is: " + count);
	 }
	 System.out.println("Out of Loop");
	 }
}


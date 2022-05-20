package com.LoopJava;

public class LoopJava {
 
	
	public void forExample() {  //Print number from 1 to 10
		    //Code of Java for loop  
		    for(int num=1;num<=10;num++){  
		        System.out.println(num);  
		    }  
		}  
	
	public void weekDays() {     //PrintTillThursdayAndDisplayOnlyThursday
		String strArray[] = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};
		
		for(int intIndex = 0;intIndex<strArray.length;intIndex++) {
			System.out.println("Array data : "+strArray[intIndex]);
			if(strArray[intIndex].equals("Thursday")) {
			System.out.println("Thursday is Present");
			break;
			
			}
		}	
					
		
	}
		


     public void weekDaysForLoop() {  //DisplayingAllWeekdays
	    String strArray[] = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};
	
	      for(int intIndex = 0;intIndex<strArray.length;intIndex++) {
		  System.out.println("Array data :"+strArray[intIndex]);
	      }
     }
     
     
     public void displayMessage() { //DisplayMessage5Times
    	 int Display = 5;
    	 
    	 //for Loop
    	 for(int intIndex = 1; intIndex <= Display; ++intIndex) {
    		 System.out.println("Verve Square Technologies");
    	 }
    	 }
     
     
     public void naturalNumbers() {       //SumOfNaturalNumbers
    	 {
    		 
         int sum = 0;
    	 int natural = 100;
    	 
    	 //for loop
    	 for(int num = 1; num <= natural; ++num) 
    	 {
    		 sum += num;     //sum = sum + num
    	 }
    	 System.out.println("Sum of Natural Numbers from 1 to 100 is = "+sum);
    	 }
    	 
     }
     
     
     public void numberSequence()    //NumberDisplayFormat
 	{
 		for(int intNum=1;intNum<=3;intNum++){  
 			//loop of sum
 			for(int sum=1;sum<=3;sum++){  
 			        System.out.println(intNum+" "+sum);  
 	}
 	
 }
     }
     
}
     

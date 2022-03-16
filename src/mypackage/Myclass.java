package mypackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args)
	
	{
		
		//Variable declaration
		
		Scanner obj = new Scanner (System.in);
	  int n;
	  
	  //read value from user
	  
	  System.out.println("Enter any number:");
	  
	  n=Integer.parseInt(obj.nextLine());
	  
	  //Logic
			  
	for (int i=1; i<11;i++)
		
	{
		System.out.println(n+"x"+i+"="+n*i);  
	}
		obj.nextLine();
		
	}	
				
	}


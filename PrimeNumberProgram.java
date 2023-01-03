package com.bridzelabz.logicalproblems;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");  
		int n = sc.nextInt();
		int count=0;
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;	
			}		
		 
	       if(count == 2) {
			System.out.println("it is a prime number");
		}
				else
				{
					System.out.println("it is not a prime number");
				}
			}
		else
		{
			System.out.println("it is not a prime number");
		}
		
	}
}




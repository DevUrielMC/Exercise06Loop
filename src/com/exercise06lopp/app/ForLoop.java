package com.exercise06lopp.app;

public class ForLoop 
{

	public static void main(String[] args) 
	{
		//Constant declaration
		// variable declaration
		//objets construction
		
		//create a serie of 1 - 100 1by
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
		for(int i =0; i<=100;i+=2)
		{
			System.out.println(i);
		}
		System.out.println("Display odd numbers from 100 to 200");
		for(int i =100; i<200;i++)
		{
			if(i%2==0)
			{				//break rompe el ciclo
				continue;//rompe el flujo del ciclo y se va a la evaluacion del ciclo
			}
			System.out.println(i);
		}
		System.out.println("Display just the half of the secuence 100 to 200");
			for(int i=100;i<200;i++)
			{
				System.out.println(i);
				if(i==150);
				{
					break;
				}
			}
	}

}

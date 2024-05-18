package Java_Practice;

import java.security.PublicKey;
import java.util.Scanner;

public class Practice_Questions {
	
	public static void main(String[]args)
	{
		//Practice_Questions.Switch_fn();
		//Practice_Questions.Switch_weekday();
	//	Practice_Questions.Switch_Vowl();
		Practice_Questions.Find_Even_ODD();
	
	}
	
	
	//Switch Case
	
	public static void Switch_fn()
	{
		String Gender = "Male" ;
		
		switch (Gender)
		{
		
		case "Male" :
		System.out.println("Male");
		break ;
		
		
		case "Female" :
			System.out.println("Female");
			break ;
		
		}
		
	}
		
		// 1. Write a program to read a weekday number and print weekday name using switch statement
		
		
		public static void Switch_weekday()
		{
			Scanner My_Scanner = new Scanner(System.in);
			System.out.println("Enter Your Week day Number");
			int Day = My_Scanner.nextInt();
			
			
			switch (Day)
			{
			
			
			case 1 :
				System.out.println("Monday");
				break;

			case 2 :
				System.out.println("Tuesday");
				break;

			case 3 :
				System.out.println("Wednesday");
				break;

			case 4 :
				System.out.println("Thursday");
				break;

			case 5 :
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				break;

			case 7 :
				System.out.println("Sunday");
				break;
			
			
			
			}
		}
		
		
		// 3. Write a program to Check whether a character is a vowel or consonant using switch statement
		
		
		public static void Switch_Vowl()
		{
			
			Scanner My_Scanner = new Scanner(System.in);
			System.out.println("Enter Your Value");
			String Value = My_Scanner.nextLine();
			
			
			switch(Value)
			{
			
			case "A" :
				System.out.println("It' vowel");
				break;
			case "E" :
				System.out.println("It' vowel");
				break;
			case "I" :
				System.out.println("It' vowel");
				break;
			case "O" :
				System.out.println("It' vowel");
				break;
			case "U" :
				System.out.println("It' vowel");
				break;
			
				default :
					System.out.println("It' not vowel");
			
			}
			
		}
		
		   public static void Find_Even_ODD() {
			   
			   
			   Scanner My_Scanner = new Scanner(System.in);
				System.out.println("Enter Your Value");
				int  Value  = My_Scanner.nextInt();			   
			   switch(Value % 2)
			   {case 1:
					System.out.println("It' Odd Number");
					break;
					default :
					System.out.println("It's even Number");
					break;
			   
			   }
			   
		   }
		   
		   
		   // Constructor  Practice Questions
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}

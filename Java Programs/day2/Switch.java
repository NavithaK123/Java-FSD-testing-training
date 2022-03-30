package day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Start of program");
		System.out.println("Enter the number");
		System.out.println("1.monday,2.tuesday,3.wednessday,4.thursday,5.friday");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b;
        switch(a)
        {
        case 1:
            System.out.println("enter your slot"); 
            System.out.println("Select your time");
            System.out.println("1.10 am,2.12pm,3.3,pm");
            b=sc.nextInt();
            switch (b) {
            case 1:System.out.println("You are booked for 10 pm on Monday");
            break;
            case 2:System.out.println("You are booked for 12 pm on Monday");
            break;
            case 3:System.out.println("You are booked for 3  pm on Monday");
            break;
            
            default :
            System.out.println("You  are given inavlid input");
            }
            break;
        case 2: System.out.println("enter your slot"); 
        System.out.println("Select your time");
        System.out.println("1.10 am,2.12pm,3.3,pm");
         b=sc.nextInt();
        switch (b) {
        case 1:System.out.println("You are booked for 10 pm on Tuesday");
        break;
        case 2:System.out.println("You are booked for 12 pm on Tuesday");
        break;
        case 3:System.out.println("You are booked for 3  pm on Tuesday");
        break;
        
        default :
        System.out.println("You  are given inavlid input");
        }
        	break;
        case 3:
        	 System.out.println("enter your slot"); 
             System.out.println("Select your time");
             System.out.println("1.10 am,2.12pm,3.3,pm");
              b=sc.nextInt();
             switch (b) {
             case 1:System.out.println("You are booked for 10 pm on  Wednessday");
             break;
             case 2:System.out.println("You are booked for 12 pm on  Wednessday");
             break;
             case 3:System.out.println("You are booked for 3  pm on  Wednessday");
             break;
             
             default :
             System.out.println("You  are given inavlid input");
             }
             break;
        case 4:
        	 System.out.println("enter your slot"); 
             System.out.println("Select your time");
             System.out.println("1.10 am,2.12pm,3.3,pm");
              b=sc.nextInt();
             switch (b) {
             case 1:System.out.println("You are booked for 10 pm on Thursday");
             break;
             case 2:System.out.println("You are booked for 12 pm on Thursday");
             break;
             case 3:System.out.println("You are booked for 3  pm on Thursday");
             break;
             
             default :
             System.out.println("You  are given inavlid input");
             }
             break;
        case 5:
        	 System.out.println("enter your slot"); 
             System.out.println("Select your time");
             System.out.println("1.10 am,2.12pm,3.3,pm");
              b=sc.nextInt();
             switch (b) {
             case 1:System.out.println("You are booked for 10 pm on Friday");
             break;
             case 2:System.out.println("You are booked for 12 pm on Friday");
             break;
             case 3:System.out.println("You are booked for 3  pm on Friday");
             break;
             
             default :
             System.out.println("You  are given inavlid input");
             }
        	
        	
        }
    
     System.out.println("End of Program");
	}

}

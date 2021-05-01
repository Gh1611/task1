package com.q4;

import java.util.Scanner;
class Scase
{
	public static void main(String[] args) 
	{
		System.out.println("enter the month");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		switch(m)
		{
			case 1:System.out.println("January");
			break;
			case 2:System.out.println("February");
			break;
			case 3:System.out.println("March");
			break;
			case 4:System.out.println("April");
			break;
			case 5:System.out.println("May");
			break;
			case 6:System.out.println("June");
			break;
			default:
				System.out.println("month doesnt exists");
		}
	}
}


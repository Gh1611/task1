package com.q3;

import java.util.Scanner;
class Operators 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the values of a&b:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//performing Arithmetic operations
		System.out.println("Addition is"+(a+b));
		System.out.println("Multiplication is"+(a*b));
		//performing Relational operations
		if(a>b)
			System.out.println("Enter the loop");
		else
			System.out.println("Exit the loop");
		//performing Logical operations
		for(int i=0;i<=b;i++)
		{
			if((i<a)&&(i<b))
				System.out.println("true");
			else
				System.out.println("false");
		}
		//performing bitwise operations
		System.out.println("Enter the values of p&q:");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("The value of Bitwise & is"+(p&q));
		System.out.println("The value of Bitwise | is"+(p|q));
		System.out.println("The value of Bitwise ^is"+(p^q));
		//performing assignment operations
		a+=p;
		System.out.println(a);
		int h= a++ + ++b - --p;
	    System.out.println(h);			
	}
}

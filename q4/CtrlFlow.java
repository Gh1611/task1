package com.q4;

class CtrlFlow
{
	public static void main(String[] args) 
	{
		int i = 0;    
		while(i<=10) {  
			System.out.print(i+" ");  
            i ++; 
			if(i==6)
				break;
          }		 
		  System.out.println();
		  do{  
			System.out.println(i);  
            i = i + 2;
          }  while(i<=20) ;
		 int x = 10;  
         int y = 12;  
         if(x+y < 10)
		{  
           System.out.println("x + y is less than 10");  
		}   
	    else 
		{  
           System.out.println("x + y is greater than 20");  
         } 
		for(i=1;i<=5;i++)
		{
			System.out.println(i);
			continue;
		}

	}
}

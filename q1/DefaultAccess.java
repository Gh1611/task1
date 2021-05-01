package com.q1;
class DefaultAccess
{
  public static void main(String[] args) {
    // This will be explained in Unit 8
    AccessTest1 AccessTest= new AccessTest1();
    System.out.println(AccessTest.a);
    System.out.println(AccessTest.b);
    System.out.println(AccessTest.c);
    // accessControlTest.exampleVariableThree will cause an error because
    // exampleVariableThree is private
  }
}

class AccessTest1 {
	  static int a = 5;
	   static int b = 10;
	  static int c = 100;
	
}

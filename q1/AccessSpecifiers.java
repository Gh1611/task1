package com.q1;

public class AccessSpecifiers
{
  public static void main(String[] args) {
    // This will be explained in Unit 8
    AccessTest AccessTest= new AccessTest();
    System.out.println(AccessTest.a);
    System.out.println(AccessTest.b);
    System.out.println(AccessTest.c);
    // accessControlTest.exampleVariableThree will cause an error because
    // exampleVariableThree is private
  }
}


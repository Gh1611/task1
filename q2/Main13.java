package com.q2;

class FinalDemo {
    // create a final method
    public final void display() {
      System.out.println("This is a final method.");
    }
}

class Main13 extends FinalDemo {
  // try to override final method
//  public final void display() {
//   System.out.println("The final method is overridden.");
//}

  public static void main(String[] args) {
    Main13 obj = new Main13();
    obj.display();
  }
} 

package com.csc;

public class TriangleNumberCalculator {
  // Your code goes here!

  /** Sum from 1 to N
   * Tn = 1 + 2 + 3 + ... + N - 1 + N
   * T1 = 1
   * T2 = 1 + 2 = 3
   * T3 = 1 + 2 + 3 = 6
   */

  public int value(int n)
  {
    //return nth triangular number
    if (n == 1) {
      return 1;
    }
    else {
      return n + value(n - 1);
    }

  }

  public int add(int n, int m)
  {
    //adds the nth and mth triangular numbers
    return value(n) + value(m);

  }

  public int subtract(int n, int m)
  {
    //subtracts the nth and mth triangular numbers
    return value(n) - value(m);
  }


  public static void main(String[] args)
  {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();

     System.out.println(calculator.value(30000)); //this should print out 1
     System.out.println(calculator.value(2)); //print out 3
     System.out.println(calculator.value(4)); //print out 10

     System.out.println(calculator.add(30000, 20000)); //print out 2
     System.out.println(calculator.add(2, 3)); //print out 9
     System.out.println(calculator.add(4, 2)); //print out 13

     System.out.println(calculator.subtract(30000, 10000)); //print out 0
     System.out.println(calculator.subtract(2, 3)); //print out -3
     System.out.println(calculator.subtract(4, 2)); //print out 7
  }

}

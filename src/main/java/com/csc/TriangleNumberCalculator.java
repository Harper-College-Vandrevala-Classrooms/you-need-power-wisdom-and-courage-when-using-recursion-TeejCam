package com.csc;
import java.util.List;
import java.util.ArrayList;

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

  public int multiply(int n, int m)
  {
    return value(n) * value(m);
  }

  public int divide(int n, int m)
  {
    return value(m) / value(n);
  }

  public List<Integer> sequence(int n)
  {
    List<Integer> triangleList = new ArrayList<>();

    for(int i = 1; i <= n; i++) {
      triangleList.add(value(i));
    }

    return triangleList;

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

     System.out.println(calculator.multiply(4, 5));

     List<Integer> triangleList = calculator.sequence(5);
     System.out.println(triangleList);

  }

}

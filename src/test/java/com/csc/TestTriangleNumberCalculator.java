package com.csc;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  @Test
  public void testValueFunction() {
    assertEquals(1, calculator.value(1));
  }

  @Test
  public void testValueForTwo() {
    assertEquals(3, calculator.value(2));
  }

  @Test
  public void testValueForThree() {
    assertEquals(6, calculator.value(3));
  }

  @Test
  public void testAddFunction() {
    assertEquals(4, calculator.add(1, 2));
  }

  @Test 
  public void testAddFunctionTwoAndThree() {
    assertEquals(9, calculator.add(2, 3));
  }

  @Test 
  public void testSubtractFunction() {
    assertEquals(0, calculator.subtract(1, 1));
  }

  @Test 
  public void testSubtractTwoAndThree() {
    assertEquals(-3, calculator.subtract(2, 3));
  }

  @Test 
  public void testMultiplyTwoAndThree() {
    assertEquals(18, calculator.multiply(2, 3));
  }

  @Test 
  public void testDivideThreeAndFour() {
    assertEquals(1, calculator.divide(3, 4));
  }

  @Test 
  public void testDivideTwoAndThree() {
    assertEquals(2, calculator.divide(2, 3));
  }

  @Test 
  public void testSequenceFunction() {
    List<Integer> triangleNums = calculator.sequence(2);
    List<Integer> testTriangle = List.of(1, 3);
    assertEquals(testTriangle, calculator.sequence(2));
  }

}


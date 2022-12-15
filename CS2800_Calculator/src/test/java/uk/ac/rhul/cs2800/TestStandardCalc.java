package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStandardCalc {

  // creating an instance of StandardCalc class called calculator to access the methods of that
  // class

  private StandardCalc calculator;

  // initialises the set up before each test is carried out for RevPolishCalc

  @BeforeEach
  public void setUp() {
    calculator = new StandardCalc();
  }

  // test to see if an empty string passed in throws an invalid expression exceptionF
  @Test
  void testIsEmpty() {
    assertThrows(InvalidExpression.class, () -> calculator.evaluate(""),
        "Enter a valid expression to calculate");
  }

  // //test to see if a string passed with one character returns itself.f
  // @Test
  // void testOneCharReturnsItself() {
  // String string = "3";
  // float result = calculator.evaluate(string);
  // assertEquals(result, 3);
  // }



}

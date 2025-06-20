package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * creating a class called TestReversePolishCalc that will test the methodology for a reverse polish
 * notation.
 * 
 * @author Zainab
 *
 */
class TestReversePolishCalc {

  // creating an instance of RevPolishCalc class called calculator to access the methods of that
  // class

  private RevPolishCalc calculator;


  // initialises the set up before each test is carried out for RevPolishCalc

  @BeforeEach
  public void setUp() {
    calculator = new RevPolishCalc();
  }

  // test to check that an invalidExpression exception is thrown when the expression inputted is an
  // empty string.
  @Test
  void testIsEmpty() {
    assertThrows(InvalidExpression.class, () -> calculator.evaluate(""),
        "You cannot perform reverse polish calculation on an empty expression");
  }

  // test to check when only one character is inputted, it returns it without carrying out any
  // calculation

  @Test
  void testOneCharReturnsItself() {
    String string = "3";
    float result = calculator.evaluate(string);
    assertEquals(result, 3);
  }

  // test to see if a valid reverse polish expression can be added.
  @Test
  void testRevPolishExpression() {
    String string = "2 4 +";
    float result = calculator.evaluate(string);
    assertEquals(result, 6);
  }

  // test to see if a valid reverse polish expression can be subtracted.
  @Test
  void testRevPolishExpressionForSymbolSubtract() {
    String string = "7 2 -";
    float result = calculator.evaluate(string);
    assertEquals(result, 5);
  }

  // test to see if a valid reverse polish expression can be multiplied.
  @Test
  void testRevPolishExpressionForMultiplication() {
    String string = "4 2 x";
    float result = calculator.evaluate(string);
    assertEquals(result, 8);
  }

  // test to see if a valid reverse polish expression can be divided.
  @Test
  void testRevPolishExpressionForDivision() {
    String string = "9 3 /";
    float result = calculator.evaluate(string);
    assertEquals(result, 3);
  }


  // test to see if a valid reverse polish expression with decimals can be added.
  @Test
  void testRevPolishExpressionAdditionWithDecimals() {
    String string = "2.4 4 +";
    float result = calculator.evaluate(string);
    assertEquals(result, 6.4f);
  }

  // test to see if a valid reverse polish expression with double digits can be added.
  @Test
  void testRevPolishExpressionAdditionWithDoubleDigits() {
    String string = "12 4 +";
    float result = calculator.evaluate(string);
    assertEquals(result, 16f);
  }
}

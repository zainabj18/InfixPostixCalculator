package uk.ac.rhul.cs2800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * creating a class called testOpStack to test the functionality and methods of the OpStack class
 * 
 * @author Zainab
 *
 */
public class testOpStack {


  private OpStack opStack;

  // creating a new empty stack called opStack from the class OpStack before running the tests
  @BeforeEach
  public void setup() {
    opStack = new OpStack();
  }

  // test to see whether an element can be pushed onto the stack
  // created a new element, minus (-) of a symbol type and pushed it onto the stack.
  // The test should pass if a symbol value has been passed. If any other entry type gets
  // passed, the test should then fail.

  @Test
  void testPushMinusOnStack() {
    opStack.push(Symbol.MINUS);

  }


  // test to see whether an element can be pushed onto the stack
  // created a new element, plus (+) of a symbol type and pushed it onto the stack.
  // The test should pass if a symbol value has been passed. If any other entry type gets
  // passed, the test should then fail.

  @Test
  void testPushAddOnStack() {
    opStack.push(Symbol.PLUS);

  }


}

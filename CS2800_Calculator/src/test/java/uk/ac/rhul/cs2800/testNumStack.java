package uk.ac.rhul.cs2800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * creating a class called testNumStack to test the functionality and methods of the NumStack class.
 * 
 * @author Zainab
 *
 */
public class testNumStack {

  // creating a new empty stack called numStack from the class NumStack before running the tests
  private NumStack numStack;

  @BeforeEach
  public void setup() {
    numStack = new NumStack();
  }

  // test to see whether an element can be pushed onto the stack
  // created a new element, 5.2 of a float type and pushed it onto the stack.
  // The test should pass if a float value has been passed. If any other entry type gets
  // passed, the test should then fail.
  @Test
  void testPushOnEmptyStack() {
    numStack.push(5.2f);

  }

}

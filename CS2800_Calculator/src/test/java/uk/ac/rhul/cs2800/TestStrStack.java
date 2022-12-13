package uk.ac.rhul.cs2800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStrStack {

  private StrStack strStack;

  // creating a new empty stack called strStack from the class StrStack before running the tests
  @BeforeEach
  public void setup() {
    strStack = new StrStack();
  }

  // test to see whether an element can be pushed onto the stack
  // created a new element, "string" of string type and pushed it onto the stack.
  // The test should pass if the string has been passed. If any other entry type gets
  // passed, the test should then fail.

  @Test
  void testPushStringOnStack() {
    strStack.push("string");

  }

}

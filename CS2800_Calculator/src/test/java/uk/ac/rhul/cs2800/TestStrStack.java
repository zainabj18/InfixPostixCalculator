package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
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

  // test to see multiple strings can be pushed onto the stack. Created three strings and pushed
  // them onto the stack. The tests should pass if the the values pushed are strings.

  @Test
  void testPushMultipleStringOnStack() {
    strStack.push("string 1");
    strStack.push("string 2");
    strStack.push("string 3");
  }


  // test to see whether an element can be popped from a stack.
  // created a string "e" and pushed it on to the stack
  // then popped it from the stack.
  // If the element is popped, the test passes.
  @Test
  void testPopOnStack() {
    strStack.push("e");
    assertEquals(strStack.pop(), "e");
  }


  // test to check whether you can pop from an empty stack using the pop method
  // when popping from an empty stack, it should throw an emptyStackException error
  @Test
  void testPopFromEmptyStack() {
    assertThrows(EmptyStackException.class, () -> strStack.pop(),
        "You cannot pop from an empty stack");
  }


  // test to check whether the pop() method returns the top value from the stack
  // pushed 3 strings onto the stack then popped the top string using pop()
  @Test
  void testPopOnStackAfterPushingElements() {
    strStack.push("this");
    strStack.push("is");
    strStack.push("a test");
    assertEquals(strStack.pop(), "a test");
  }

}

package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
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
  void testPushOnStack() {
    numStack.push(5.2f);

  }

  // test to see whether an element can be popped from a stack.
  // created an element of float type and pushed it on to the stack
  // then popped it from the stack.
  // If the element is popped, the test passes.
  @Test
  void testPopOnStack() {
    numStack.push(5.2f);
    assertEquals(numStack.pop(), 5.2f);
  }
  
  //test to check whether you can pop from an empty stack using the pop method
  // when popping from an empty stack, it should throw an emptyStackException error
  @Test
  void testPopFromEmptyStack() {
    assertThrows(EmptyStackException.class, () -> numStack.pop(),
        "You cannot pop from an empty stack");
  }
  
  
  //test to check whether the pop() method returns the top value from the stack
  //pushed 4 elements onto the stack then popped the top most element using pop()
  @Test
  void testPopOnStackAfterPushingMultipleElements() {
    numStack.push(3.0f);
    numStack.push(4.3f);
    numStack.push(1.7f);
    numStack.push(5.2f);
    assertEquals(numStack.pop(), 5.2f);
  }

}

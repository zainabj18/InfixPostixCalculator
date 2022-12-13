package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
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
  // test to see whether an element can be pushed onto the stack
  // created a new element, multiply (x) of a symbol type and pushed it onto the stack.
  // The test should pass if a symbol value has been passed. If any other entry type gets
  // passed, the test should then fail.

  @Test
  void testPushMultiplyOnStack() {
    opStack.push(Symbol.TIMES);

  }
  // test to see whether an element can be pushed onto the stack
  // created a new element, multiply (x) of a symbol type and pushed it onto the stack.
  // The test should pass if a symbol value has been passed. If any other entry type gets
  // passed, the test should then fail.

  @Test
  void testPushDivideOnStack() {
    opStack.push(Symbol.DIVIDE);

  }

  // test to see whether an element can be pushed onto the stack
  // created a new element, right bracket ("(") of a symbol type and pushed it onto the stack.
  // The test should pass if a symbol value has been passed. If any other entry type gets
  // passed, the test should then fail.

  @Test
  void testPushBracketOnStack() {
    opStack.push(Symbol.RIGHT_BRACKET);

  }

  // test to see whether an element can be popped from a stack.
  // created an element of symbol type and pushed it on to the stack
  // then popped it from the stack.
  // If the element is popped, the test passes.
  @Test
  void testPopOnStack() {
    opStack.push(Symbol.PLUS);
    assertEquals(opStack.pop(), Symbol.PLUS);
  }

  // test to check whether you can pop from an empty stack using the pop method
  // when popping from an empty stack, it should throw an emptyStackException error
  @Test
  void testPopFromEmptyStack() {
    assertThrows(EmptyStackException.class, () -> opStack.pop(),
        "You cannot pop from an empty stack");
  }


}

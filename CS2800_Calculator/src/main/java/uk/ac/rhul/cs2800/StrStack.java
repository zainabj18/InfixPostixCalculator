package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * creating a class called StrStack that creates a stack.
 * 
 * @author Zainab
 *
 */
public class StrStack {

  Stack strStack = new Stack();

  /**
   * creating an empty constructor for StrStack to instantiate the StrStack stack.
   */
  public StrStack() {

  }

  /**
   * this method pushes a string only on to the StrStack stack.
   * 
   * @param string is pushed onto the stack
   */
  public void push(String string) {
    strStack.push(new Entry(string));

  }

  /**
   * pop method that pops the top element from the stack and throws an emptyStackException if the
   * stack is empty.
   * 
   * @return the popped element if the stack is not empty, otherwise return "invalid"
   * @throws EmptyStackException if the pop method is called on a empty stack.
   */
  public String pop() throws EmptyStackException {
    try {
      return strStack.pop().getStringValue();
    } catch (BadTypeException e) {
      return "Invalid";
    }

  }

  /**
   * boolean method isEmpty to test if the stack is empty.
   * 
   * @return true if the stack is empty (size == 0)
   */
  public boolean isEmpty() {
    return strStack.sizeOfStack() == 0;
  }

}

package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * creating a class called NumStack and creating a stack using the Stack class. string and type.
 * 
 * @author Zainab
 *
 */

public class NumStack {

  Stack numStack = new Stack();


  /**
   * creating an empty constructor for NumStack to instantiate the NumStack stack.
   */
  public NumStack() {

  }

  /**
   * this method pushes an element of float type only on to the numStack stack.
   * 
   * @param newElement is a float value that gets added to the the numStack stack.
   */
  public void push(float newElement) {
    numStack.push(new Entry(newElement));
  }


  /**
   * @return the float value that is popped when pop() is called.
   * 
   * @throws EmptyStackException if the stack is empty.
   */
  public float pop() throws EmptyStackException {
    try {
      return numStack.pop().getFloatValue();
    } catch (BadTypeException e) {
      return Float.POSITIVE_INFINITY;
    }

  }
  
  /**
   * @return boolean value true if the stack is empty (size = 0)
   * else return false
   */
  public boolean isEmpty() {
    return numStack.sizeOfStack() == 0;
  }

}

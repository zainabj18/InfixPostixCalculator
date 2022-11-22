package uk.ac.rhul.cs2800;

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

}

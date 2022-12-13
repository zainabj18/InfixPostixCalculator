package uk.ac.rhul.cs2800;

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

}

package uk.ac.rhul.cs2800;

/**
 * Creating a class called OpStack and then creating a stack of Stack type.
 * 
 * @author zainab
 *
 */
public class OpStack {

  Stack opStack = new Stack();

  /**
   * creating an empty constructor for OpStack to instantiate the OpStack stack.
   */
  public OpStack() {

  }

  /**
   * this method pushes an element of Symbol type only on to the OpStack stack.
   * 
   * @param op is a Symbol value that gets added to the the OpStack stack.
   */
  public void push(Symbol op) {
    opStack.push(new Entry(op));

  }

}

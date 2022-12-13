package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

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

  /**
   * created a pop method that pops the top most element of the stack.
   * 
   * @return the invalid symbol created in the symbol class
   * @throws EmptyStackException when the stack is empty
   */
  public Symbol pop() throws EmptyStackException {
    try {
      return opStack.pop().getSymbolValue();
    } catch (BadTypeException e) {
      return Symbol.INVALID;
    }

  }

}



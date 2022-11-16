package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * creating a class called stack. creating a list called stack of Entry type.
 * 
 * @author Zainab
 *
 */
public class Stack {
  int size = 0;
  List<Entry> stack = new ArrayList<Entry>();

  /**
   * method returns the size of the stack.
   * 
   * @return returns integer
   */
  public int sizeOfStack() {
    return stack.size();

  }

  /**
   * pushes element onto stack and increases the size of stack by 1.
   * 
   * @param newElement is a new element thats added onto the stack.
   */
  public void push(Entry newElement) {
    stack.add(newElement);
    size = stack.size() + 1;
  }

  /**
   * top method that returns the top value of the stack by first checking if the stack is empty.
   * 
   * @return returns the top element of Entry type by subtracting one from the size of the stack.
   * @throws EmptyStackException if the stack is empty as there are no elements in the stack.
   */
  public Entry top() throws EmptyStackException {
    if (stack.size() == 0) {
      throw new EmptyStackException();
    }
    return stack.get(stack.size() - 1);
  }

  /**
   * pop method that returns and removes the top element of the stack by first checking if the stack
   * is empty. If the stack is not empty then it decreases the size of stack by 1 and then removes
   * the top element and the returns the top element of the stack.
   * 
   * @return returns the top element of the stack.
   */
  public Entry pop() {
    if (stack.size() == 0) {
      throw new EmptyStackException();
    }
    Entry size = stack.get(sizeOfStack() - 1);
    stack.remove(sizeOfStack() - 1);
    return size;
  }



}

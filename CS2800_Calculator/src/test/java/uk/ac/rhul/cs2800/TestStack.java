package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * creating a class called testStack to test the functionality and methods of the stack class.
 * 
 * @author Zainab
 *
 */
class TestStack {
  // creating a new empty stack called newStack from the class Stack

  private Stack newStack;

  @BeforeEach
  public void setup() {
    newStack = new Stack();
  }

  // method to make sure the stack is empty by checking whether the size of the stack is 0.
  // used assertEquals to compare the size of the stack wit 0.

  @Test
  void testStackSize() {
    Stack newStack = new Stack();
    assertEquals(newStack.sizeOfStack(), 0,
        "Test a new stack to make sure the initial size is 0 (empty stack).");

  }

  // test to see whether an element can be pushed onto the stack
  // created a new element, 7, called newElement of a float type and pushed it onto the stack.
  // the tests makes sure that it is pushed onto the stack by using the assertEquals and checking
  // whether the size of the stack is now 1 as only one element has been pushed.

  @Test
  void testPushOnStack() {
    Entry newElement = new Entry(7);
    newStack.push(newElement);
    assertEquals(newStack.sizeOfStack(), 1);
  }


  // test to see whether multiple elements can be pushed onto the stack by pushing 5 elements of
  // different entry types and then checking whether the size of stack is now 5 using the
  // assertEquals

  @Test
  void testPushFiveElements() {
    Entry element1 = new Entry("hello");
    newStack.push(element1);
    Entry element2 = new Entry(2.5f);
    newStack.push(element2);
    Entry element3 = new Entry(Type.NUMBER);
    newStack.push(element3);
    Entry element4 = new Entry(5);
    newStack.push(element4);
    Entry element5 = new Entry(Symbol.DIVIDE);
    newStack.push(element5);
    assertEquals(newStack.sizeOfStack(), 5);
  }

  // test to check the element at the top of the stack
  // 5 elements are pushed onto the stack and then using the top method from the stack class, check
  // whether the last element is returned by using the assertEquals and comparing it with the last
  // element pushed onto the stack

  @Test
  void testTopOfStack() {
    Entry element1 = new Entry(5);
    newStack.push(element1);
    Entry element2 = new Entry(Symbol.DIVIDE);
    newStack.push(element2);
    Entry element3 = new Entry(Type.NUMBER);
    newStack.push(element3);
    Entry element4 = new Entry(2.5f);
    newStack.push(element4);
    Entry element5 = new Entry("hello");
    newStack.push(element5);
    assertEquals(newStack.top().toString(), "string hello");

  }

  // test to check whether you can pop from an empty stack using the pop method
  // when popping from an empty stack, it should throw an emptyStackException error


  @Test
  void testPopFromEmptyStack() {
    assertThrows(EmptyStackException.class, () -> newStack.pop(),
        "You cannot pop from an empty stack");

  }

  // test to check whether you can get the top element from an empty stack using the top method
  // when trying to find the top element from an empty stack, it should throw an emptyStackException
  // error as the stack is empty

  @Test
  void testTopFromEmptyStack() {
    assertThrows(EmptyStackException.class, () -> newStack.top(),
        "You cannot return the top value from an empty stack");

  }
  // testing pop method on a non empty stack.
  // a new element is created and then pushed onto the stack
  // then the size of the stack is checked using the assertEquals to make sure the size of the stack
  // is 1
  // then the pop method is called from the stack class and the element is popped

  @Test
  void testPopFromNonEmptyStack() throws BadTypeException {
    Entry newElement = new Entry(5.0f);
    newStack.push(newElement);
    assertEquals(newStack.sizeOfStack(), 1);
    assertEquals(newStack.pop(), newElement);

  }

  // test to see the pop method works after pushing 5 elements onto the stack and then popping.
  // 5 elements are created of entry type and then pushed onto the stack
  // the size of the stack is checked to make sure its 5
  // the pop method is called and assertEquals is used to compare the popped element is the same as
  // the last element pushed in

  @Test
  void testPopAfterPushing5Elements() throws BadTypeException {
    Entry element1 = new Entry(5);
    newStack.push(element1);
    Entry element2 = new Entry(Symbol.DIVIDE);
    newStack.push(element2);
    Entry element3 = new Entry(Type.NUMBER);
    newStack.push(element3);
    Entry element4 = new Entry(2.5f);
    newStack.push(element4);
    Entry element5 = new Entry("hello");
    newStack.push(element5);
    assertEquals(newStack.sizeOfStack(), 5);
    assertEquals(newStack.pop().toString(), "string hello");


  }

  // test to see the pop method works after pushing 5 elements onto the stack and then popping 3
  // elements.
  // 5 elements are created of entry type and then pushed onto the stack
  // the size of the stack is checked to make sure its 5
  // the pop method is called and assertEquals is used to compare the popped element is the same as
  // the last element pushed in
  // the pop method is called twice more and assertEquals is used both times again to check whether
  // the popped element is the same as the last elements respectively.

  @Test
  void testPushFiveElementsPopThreeElements() {
    Entry element1 = new Entry(5);
    newStack.push(element1);
    Entry element2 = new Entry(Type.NUMBER);
    newStack.push(element2);
    Entry element3 = new Entry(Symbol.DIVIDE);
    newStack.push(element3);
    Entry element4 = new Entry(2.5f);
    newStack.push(element4);
    Entry element5 = new Entry("hello");
    newStack.push(element5);
    assertEquals(newStack.sizeOfStack(), 5);
    assertEquals(newStack.pop().toString(), "string hello");
    assertEquals(newStack.pop().toString(), "float 2.5");
    assertEquals(newStack.pop().toString(), "symbol DIVIDE /");

  }



}

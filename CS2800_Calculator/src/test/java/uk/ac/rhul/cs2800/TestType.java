package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * creating a class called testType to test the functionality of the Type class.
 * 
 * @author Zainab.
 *
 */
class TestType {


  // creating a testToString method that will test the toString method created in the Type class.
  // This should pass by returning the appropriate type in a string form.

  @Test
  void testToString() {
    assertEquals(Type.NUMBER.toString(), ("NUMBER"), "this should print out number");
    assertEquals(Type.SYMBOL.toString(), ("SYMBOL"), "this should print out symbol");
    assertEquals(Type.STRING.toString(), ("STRING"), "this should print out string");
  }

}

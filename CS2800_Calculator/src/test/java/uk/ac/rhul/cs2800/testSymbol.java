package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * creating a class called testSymbol to test the functionality of the Symbol class.
 * 
 * @author Zainab.
 *
 */
class testSymbol {


  // creating a method testToString for the symbol class to test for each of the seven constants of
  // the class. each test should pass and return its appropriate value.

  @Test
  void testToString() {
    assertEquals(Symbol.LEFT_BRACKET.toString(), ("LEFT_BRACKET ("),
        "when toString method is called for the left bracket, it should print the symbol ' (' ");
    assertEquals(Symbol.RIGHT_BRACKET.toString(), ("RIGHT_BRACKET )"),
        "when toString method is called for the right bracket, it should print the symbol ' )' ");
    assertEquals(Symbol.TIMES.toString(), ("TIMES x"),
        "when toString method is called for the times constant, it should print the symbol 'x' ");
    assertEquals(Symbol.DIVIDE.toString(), ("DIVIDE /"),
        "when toString method is called for the divide constant, it should print the symbol '/' ");
    assertEquals(Symbol.PLUS.toString(), ("PLUS +"),
        "when toString method is called for plus constant, it should print the symbol " + "");
    assertEquals(Symbol.MINUS.toString(), ("MINUS -"),
        "when toString method is called for the minus constant, it should print the symbol '-' ");
    assertEquals(Symbol.INVALID.toString(), ("INVALID invalid"),
        "when the toString method is called for the invalid constant, it should print out invalid ");

  }


}

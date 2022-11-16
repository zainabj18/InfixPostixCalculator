package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * creating a class called TestEntry that will test the functionality of all the methods in the
 * Entry class. It will assure every single method does exactly what it should: no more and no less.
 * 
 * @author Zainab
 *
 */
class TestEntry {


  // test for float constructor
  // makes sure that the new entry is of type float and checks the functionality of the getter
  // called getFloatValue by using the assertEquals to compare the expected value with the new value

  @Test
  public void testFloatConstructor() throws BadTypeException {
    Entry newEntry = new Entry(3.0f);
    assertEquals(newEntry.getFloatValue(), 3.0f);
  }


  // test for string constructor
  // makes sure that the new entry is of type float and checks the functionality of the getter
  // called getStringvalue by using the assertEquals to compare the expected value with the new
  // value

  @Test
  public void testStringConstructor() throws BadTypeException {
    Entry newEntry = new Entry("Hello");
    assertEquals(newEntry.getStringValue(), "Hello");
  }

  // test for symbol constructor
  // makes sure that the new entry is of type symbol and checks the functionality of the getter
  // called getSymbolValue by using the assertEquals to compare the expected value with the new
  // value

  @Test
  public void testSymbolContructor() throws BadTypeException {
    Entry newEntry = new Entry(Symbol.PLUS);
    assertEquals(newEntry.getSymbolValue(), Symbol.PLUS);
  }


  // test for type constructor
  // makes sure that the new entry is of type Type and checks the functionality of the getter
  // called getTypeValue by using the assertEquals to compare the expected value with the new
  // value

  @Test
  public void testTypeConstructor() {
    Entry newEntry = new Entry(Type.NUMBER);
    assertEquals(newEntry.getTypeValue(), Type.NUMBER);
  }


  // test for the toString method for an entry type of float
  // a new value of type float should convert to a string for this test to pass
  // assertEquals is used to check whether the float is a string by comparing the expected value to
  // a new value

  @Test
  public void testFloatToString() {
    Entry floatEntry = new Entry(4.5f);
    assertEquals(floatEntry.toString(), ("float 4.5"),
        "this should print out the float value as a string");
  }

  // test for the toString method for an entry type of string
  // a new value of type string should convert to a string for this test to pass
  // assertEquals is used to check whether the string is a string by comparing the expected value to
  // a new value

  @Test
  public void testStringtToString() {
    Entry stringEntry = new Entry("hello");
    assertEquals(stringEntry.toString(), ("string hello"),
        "this should print out the string as a string");
  }

  // test for the toString method for an entry type of symbol
  // a new value of type symbol should convert to a string for this test to pass
  // assertEquals is used to check whether the symbol is a string by comparing the expected value to
  // a new value

  @Test
  public void testSymbolToString() {
    Entry symbolEntry = new Entry(Symbol.PLUS);
    assertEquals(symbolEntry.toString(), ("symbol PLUS +"),
        "this should print out the symbol as a string");
  }

  // test for the toString method for an invalid entry type
  // a new value of invalid type should not convert to a string and instead should print out
  // badTypeException as invalid does not have a type
  // assertEquals is used to check whether the value is a invalid by comparing the expected value to
  // a new value

  @Test
  public void testTypeToString() {
    Entry typeString = new Entry(Type.INVALID);
    assertEquals(typeString.toString(), "bad type exception",
        "this should print out bad type exception as invalid does not have a type");
  }


  // test for badTypeExeception
  // if a string type is called a non string constructor then it should throw a bad type exception
  // if a float type is called a non float constructor then it should throw a bad type exception
  // if a symbol type is called a non symbol constructor then it should throw a bad type exception
  // this is because each type cannot be compared to a different type

  @Test
  public void testBadTypeException() {
    Entry badType = new Entry(7.5f);
    Entry badType2 = new Entry("bad type test");
    Entry badType3 = new Entry(Symbol.PLUS);
    assertThrows(BadTypeException.class, () -> badType.getSymbolValue(),
        "you cannot get a symbol from float");
    assertThrows(BadTypeException.class, () -> badType2.getFloatValue(),
        "you cannot get a string from a float");
    assertThrows(BadTypeException.class, () -> badType3.getStringValue(),
        "you cannot get a symbol from a string");
  }

  // test for the hashcode method
  // the hashCode method computes the hash value for each object (entry)
  // and this test checks whether the 2 values are the same using the assertTrue


  @Test
  public void testHashcode() {
    Entry hcFloatValue = new Entry(2.5f);
    Entry hcFloatValue2 = new Entry(2.5f);
    Entry hcStringValue = new Entry("hashcode test");
    Entry hcStringValue2 = new Entry("hashcode test");
    Entry hcSymbolValue = new Entry(Symbol.PLUS);
    Entry hcSymbolValue2 = new Entry(Symbol.PLUS);
    Entry hcTypeValue = new Entry(Type.STRING);
    Entry hcTypeValue2 = new Entry(Type.STRING);
    assertTrue(hcFloatValue.hashCode() == hcFloatValue2.hashCode());
    assertTrue(hcStringValue.hashCode() == hcStringValue2.hashCode());
    assertTrue(hcSymbolValue.hashCode() == hcSymbolValue2.hashCode());
    assertTrue(hcTypeValue.hashCode() == hcTypeValue2.hashCode());
  }


  // test for equals method in Entry class
  // checks whether two entries are the same by using the assertTrue
  // two values are the same if they have the same type and value

  @Test
  public void testEquals() {
    Entry floatEntry = new Entry(3.5f);
    Entry floatEntry2 = new Entry(3.5f);
    Entry stringEntry = new Entry("equals method test");
    Entry stringEntry2 = new Entry("equals method test");
    Entry symbolEntry = new Entry(Symbol.MINUS);
    Entry symbolEntry2 = new Entry(Symbol.MINUS);
    Entry typeEntry = new Entry(Type.NUMBER);
    Entry typeEntry2 = new Entry(Type.NUMBER);
    assertTrue(floatEntry.equals(floatEntry2), "this should be equal");
    assertTrue(stringEntry.equals(stringEntry2), "this should be equal");
    assertTrue(symbolEntry.equals(symbolEntry2), "this should be equal");
    assertTrue(typeEntry.equals(typeEntry2), "this should be equal");
  }



}

package uk.ac.rhul.cs2800;

import java.util.Objects;

/**
 * creating a class called entry that takes in 4 private instance variables of type float, symbol,
 * string and type.
 * 
 * @author Zainab
 *
 */
public class Entry {
  private float floatNumber;
  private Symbol other;
  private String str;
  private Type type;

  /**
   * creating a constructor for the instance variable of float of the entry class that sets the
   * variable to new value. It also sets type as a type of Float.
   * 
   * @param newFloat is a parameter passed in the constructor for the float type to set the instance
   *        variable floatNumber as new float
   */
  public Entry(float newFloat) {
    floatNumber = newFloat;
    type = Type.NUMBER;
  }

  /**
   * creating a constructor for the instance variable of string for the entry class that sets the
   * variable to a new value. It also sets type as a type of String.
   * 
   * @param newString is a parameter passed in the constructor for the string type to set the
   *        instance variable str as newString.
   */
  public Entry(String newString) {
    str = newString;
    type = Type.STRING;
  }

  /**
   * creating a constructor for the instance variable of symbol for the entry class that sets the
   * variable to a new value. It also sets the type as a type of symbol.
   * 
   * @param newSymbol is a parameter passed in the constructor for the symbol type to set the
   *        instance variable other as newSymbol.
   */
  public Entry(Symbol newSymbol) {
    other = newSymbol;
    type = Type.SYMBOL;
  }

  /**
   * creating a constructor for the instance variable of type for the entry class that sets the
   * variable to a new value.
   * 
   * @param newType is a parameter passed in the constructor for the type Type to set the instance
   *        variable type as newType.
   */
  public Entry(Type newType) {
    type = newType;

  }

  /**
   * creating a get method for the instance variable of float that returns the float value after
   * checking that the type is a float type variable.
   * 
   * @return returns the floatNumber: private instance of the class.
   * @throws badTypeException if the value is not of float type.
   */
  public float getFloatValue() throws BadTypeException {
    if (type != Type.NUMBER) {
      throw new BadTypeException();
    }
    return floatNumber;
  }

  /**
   * creating a getter for the instance variable of String that returns the string value once it
   * made sure that it is a string type.
   * 
   * @return returns str: private instance of the class.
   * @throws badTypeException if the value is not of type string.
   */
  public String getStringValue() throws BadTypeException {
    if (type != Type.STRING) {
      throw new BadTypeException();
    }
    return str;
  }

  /**
   * creating a getter for the instance variable of symbol that returns the symbol value after it
   * makes sure it is a symbol type.
   * 
   * @return returns other: private instance variable of the class.
   * @throws badTypeException if the value is not of type Symbol.
   */
  public Symbol getSymbolValue() throws BadTypeException {
    if (type != Type.SYMBOL) {
      throw new BadTypeException();
    }
    return other;
  }

  /**
   * creating a getter for the instance variable of type that returns the type value after it makes
   * it is a type.
   * 
   * @return returns type: private instance variable of the class.
   */
  public Type getTypeValue() {
    return type;
  }

  /**
   * toString method that returns a string. concatenates the type with the value to return the
   * appropriate string
   *
   */
  public String toString() {
    if (type == Type.NUMBER) {
      return "float " + floatNumber;
    } else if (type == Type.STRING) {
      return "string " + str;
    } else if (type == Type.SYMBOL) {
      return "symbol " + other;
    } else {
      return "bad type exception";
    }

  }



  /**
   * hashCode method calculates a hash value and returns it for each entry type.
   *
   */
  @Override
  public int hashCode() {
    return Objects.hash(floatNumber, other, str, type);
  }

  /**
   * equals method checks whether two entries are equal by comparing the value and the type. If both
   * are the same, the two entries are therefore equal.
   *
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    return Float.floatToIntBits(floatNumber) == Float.floatToIntBits(other.floatNumber)
        && this.other == other.other && Objects.equals(str, other.str) && type == other.type;
  }



}

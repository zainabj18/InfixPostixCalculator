package uk.ac.rhul.cs2800;

/**
 * creating an enumeration class called Type with four constants: number, symbol, string and
 * invalid.
 * 
 * @author Zainab
 *
 */
public enum Type {
  NUMBER, SYMBOL, STRING, INVALID;

  /**
   * creating toString method for the Type class that returns the name of the type of the entry, for
   * example a number or a symbol.
   *
   */
  public String toString() {
    return name();

  }



}

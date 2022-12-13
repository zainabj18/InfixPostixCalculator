package uk.ac.rhul.cs2800;

/**
 * creating an enumeration class called Symbol with seven constants: left bracket, right bracket,
 * times, divide, plus, minus and invalid.
 * 
 * @author Zainab
 *
 */
public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("x"), DIVIDE("/"), PLUS("+"), MINUS("-"), INVALID(
      "invalid");

  private String symbol;

  private Symbol(String symbol) {
    this.symbol = symbol;

  }

  /**
   * creating a toString method for the symbol class. Should print the name of the symbol along with
   * the symbol itself when called.
   *
   */
  public String toString() {
    return name() + " " + symbol;
  }



  /**
   * created a method called getValueAsChar that returns the value of the string as a char type.
   * 
   * @return c, a character.
   */
  char getValueAsChar() {
    char c = symbol.charAt(0);
    return c;
  }


}

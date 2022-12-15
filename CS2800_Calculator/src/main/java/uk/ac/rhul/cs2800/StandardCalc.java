package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * class standardCalc that should calculate infix string expressions.
 * 
 * @author Zainab
 *
 */
public class StandardCalc {

  private OpStack opStack = new OpStack();
  private RevPolishCalc rpCalc = new RevPolishCalc();
  private NumStack numStack = new NumStack();
  String infixExpr;
  String rpn;
  char curChar;
  Symbol type;

  float result;
  float value1 = 0;
  float value2 = 0;

  /**
   * the method evaluate checks the string and calculates the expression if the string passed is an
   * infix expression.
   * 
   * @param stringToEvaluate is the string entered into the calculator to test.
   * @return a float value - the answer
   */
  public float evaluate(String stringToEvaluate) {

    if (stringToEvaluate.equals("")) {
      System.out.print("Invalid. Must enter an expression to calculate");
      throw new InvalidExpression();
    }
    Scanner reader = new Scanner(stringToEvaluate);
    while (reader.hasNext()) {
      infixExpr = reader.next();
      curChar = infixExpr.charAt(0); // current character
      if (isSymbol(curChar)) { // if current character is a symbol
        type = getType(curChar); // store what symbol it is in type
        opStack.push(type); // push type, which is a symbol, to the opStack
        float value1 = numStack.pop(); // pop the first two float values and create a rpn
        float value2 = numStack.pop();
        if (type.equals(Symbol.PLUS)) {
          numStack.push(value1 + value2); // push two values that were popped onto the stack
        }
      } else {
        throw new InvalidExpression();

      }
      reader.close();
    }

    return 0;

  }


  /**
   * boolean method that tests if its a symbol or not.
   * 
   * @param character passed to check if its a symbol or not
   * @return boolean value true if the character is a symbol
   */
  private boolean isSymbol(char character) {
    for (Symbol s : Symbol.values()) { // for a symbol in the expression
      if (character == s.getValueAsChar()) { // if the character is a symbol
        return true; // return true
      }
    }

    return false;
  }


  /**
   * method created to convert the data type of the character from char to symbol.
   * 
   * @param character passed to see what type of symbol it is
   * @return the symbol from a char to Symbol
   */
  private Symbol getType(char character) {
    for (Symbol s : Symbol.values()) { // for a symbol in the expression
      if (character == s.getValueAsChar()) { // if the character is a symbol
        return s; // return the symbol as a Symbol type
      }
    }
    return null;
  }



}

package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * created a class called RevPolishCalc which will evaluate reverse polish string expressions.
 * 
 * @author Zainab
 *
 */
public class RevPolishCalc {

  private NumStack stack = new NumStack();
  float result;

  /**
   * creating a method called evaluate for reverse polish notation that will check if the expression
   * given is of type reverse polish. Used a scanner to scan through the expression given. Then used
   * the try/ catch statement to first try and check if the expression works and is a reverse polish
   * expression. If it is, it pushes each character by character into the stack. If it is not, then
   * catches the invalid expression exception.
   * 
   * @param string is a string type parameter passed in the evaluate function that checks the
   *        validity of the expressions against a reverse polish expression's structure.
   * @returns a float value called result.
   */
  public float evaluate(String string) {
    if (string.equals("")) {
      throw new InvalidExpression();
    }
    try {
      Scanner scanner = new Scanner(string);
      while (scanner.hasNext()) {
        if (scanner.hasNextFloat()) {
          stack.push(scanner.nextFloat());
        }
      }
      scanner.close();
      result = stack.pop();
    } catch (InvalidExpression e) {
      throw new InvalidExpression();
    }
    return result;

  }
}


package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This class calls the appropriate calculator after evaluating the string expression.
 * 
 * @author Zainab
 *
 */
public class CalcModel {

  private RevPolishCalc calculator = new RevPolishCalc();


  /**
   * This method evaluates the string expression as a post fix expression or infix expression then
   * calls the correct evaluate method from either the RevPolishcal or StandardCalc.
   * 
   * @param expr is the string expression that is evaluated
   * @param infix is a boolean value that is compared and checked to call the correct evaluate
   *        method
   * @return the correct evaluate method from either RevPolishCalc or Standard
   * @throws EmptyStackException if stack is empty (size ==0)
   * @throws InvalidExpression if the expression is neither in infix or post fix
   */
  public float evaluate(String expr, boolean infix) throws EmptyStackException, InvalidExpression {

    try {
      if (infix == false) {
        return calculator.evaluate(expr);
      } else {
        return 0;
      }

    } catch (Exception e) {
      System.out.println(e);
      throw new InvalidExpression();
    }

  }


}

package uk.ac.rhul.cs2800;


/**
 * class standardCalc that should calculate infix string expressions.
 * 
 * @author Zainab
 *
 */
public class StandardCalc {

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

    return 0;

  }


}

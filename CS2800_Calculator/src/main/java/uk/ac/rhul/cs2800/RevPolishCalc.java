package uk.ac.rhul.cs2800;

/**
 * created a class called RevPolishCalc which will evaluate reverse polish string expressions.
 * 
 * @author Zainab
 *
 */
public class RevPolishCalc {

  /**
   * creating a method called evaluate for reverse polish notation that will check if the expression
   * given is of type reverse polish.
   * 
   * @param string is a string type parameter passed in the evaluate function that checks the
   *        validity of the expressions against a reverse polish expression's structure.
   * @returns a float value.
   */
  public float evaluate(String string) {
    if (string.equals("")) {
      throw new InvalidExpression();
    }
    return 0;
  }
}

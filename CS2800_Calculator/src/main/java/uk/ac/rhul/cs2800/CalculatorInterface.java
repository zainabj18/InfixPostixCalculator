package uk.ac.rhul.cs2800;

/**
 * Created a class called CalculatorInterface which allows calculation of String expressions.
 * 
 * @author Zainab
 *
 */
public interface CalculatorInterface {

  /**
   * method evaluate that belongs to reverse polish calculator and will belong to standard
   * calculator as well. method declared as abstract as the method itself does not contain any
   * implementation but it is declared.
   * 
   * @param inputString is the string passed that is checked.
   * @return a float
   * @throws Exception when the string is invalid
   */
  public abstract float evaluate(String inputString) throws Exception;

}

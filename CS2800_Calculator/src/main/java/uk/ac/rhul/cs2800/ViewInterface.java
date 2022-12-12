package uk.ac.rhul.cs2800;

import java.util.function.Consumer;
import uk.ac.rhul.cs2800.Observer;

/**
 * How we want to interact with our calculator. Just defines the data and provides hooks for
 * notification and insertion of observers. Credit to: Dave Cohen from his code MVC-separated
 * 
 * @author Zainab
 *
 */
public interface ViewInterface {

  /**
   * Add an observer of the calculate action.
   * 
   * @param f the observer
   */
  void addCalcObserver(Observer f);

  /**
   * A hook to get the arithmetic expression to be evaluated.
   * 
   * @return the expression
   */
  String getQuestion();

  /**
   * A hook to show the user the evaluated answer.
   * 
   * @param a the answer
   */
  void setAnswer(String a);
}

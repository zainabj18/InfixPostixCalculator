package uk.ac.rhul.cs2800;

/**
 * Credit to: Dave Cohen for his code from the MVC-separated project. The Controller class contains
 * public methods that handle the questions and return appropriate answers.It basically controls the
 * flow of the data.
 * 
 * @author Zainab
 *
 */
public class Controller implements ControllerInterface {
  RevPolishCalc calc = RevPolishCalc.getInstance();
  ViewInterface myView = null;

  private void calculateAction() {
    Float a = calc.evaluate(myView.getQuestion()); // evaluates the question
    myView.setAnswer(a.toString()); // sets the corresponding answer and displays it
  }

  /**
   * public method Controller that passes the interface object in the ViewInterface class.
   * 
   * @param v of ViewInterface is passed and then passed in the addView method.
   */
  public Controller(ViewInterface v) {
    addView(v);
  }

  /**
   * public default constructor is created.
   * 
   */
  public Controller() {} // constructor

  /**
   * public method of void type return called addView that takes in the parameter v of ViewInterface
   * and then adds itself as an observer to the view so that changes can be observed.
   *
   */
  public void addView(ViewInterface v) {
    myView = v;
    v.addCalcObserver(this::calculateAction);

  }
}

package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

/**
 * Created a class called MainView which includes the attributes of the main pane of the calculator.
 * 
 * 
 * @author Zainab
 *
 */
public class MainView implements ViewInterface {

  private CalcModel calculator = new CalcModel(); // creating an object calculator of CalcModel
  private String stringToEvaluate;

  /**
   * This allows a new observer to be added to the change calculate strategy action. Credit to: Dave
   * Cohen for the addCalcObserver method, getQuestion method and setAnswer method.
   * 
   * @param f the Observer to be notified.
   */
  public void addCalcObserver(Observer f) {
    calculateButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        f.tell();
      }
    });
  }

  /**
   * A hook to expose the question to another class.
   * 
   * @return the arithmetic expression to be evaluated.
   */
  public String getQuestion() {
    return inputField.getText();
  }

  /**
   * A hook to allow the answer to be displayed.
   * 
   * @param a the evaluated answer.
   */
  public void setAnswer(String a) {
    resultField.setText(a);
  }

  /**
   * method created for the calculate button. When the button is pressed, evaluate() is called
   * 
   * @param press allows the action for pressing a button to take place.
   * @throws EmptyStackException if the button is pressed when stack is empty
   * @throws InvalidExpression if invalid expression is entered.
   */
  @FXML
  void uponPressingCalculate(ActionEvent press) throws EmptyStackException, InvalidExpression {
    String string = inputField.getText();

    try {
      // if selected reversePolishButton, then the RevPolishCalc evaluate() is called
      if (toggleGroup1.getSelectedToggle() == reversePolishButton) {
        stringToEvaluate = String.valueOf(calculator.evaluate(string, false));
      }
      // catch exception if the stack is empty when calculate button is pressed
    } catch (EmptyStackException e) {
      System.out.println("empty stack");
    }
  }


  //////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Private instance of Pane type called mainPane that will draw out the main pane for the
   * calculator. Private instance of Label type called calculatorLabel that displays the word
   * 'CALCULATOR' on the main pane. Private instance of Label type called inputLabel that displays
   * "Enter an expression". Private instance of TextField type called inputField that will take in
   * the expression needed to be solved. Private instance of type Button called calculatorButton
   * that will solve the expression once pressed. Two Private instances of RadioButton type called
   * infixButton and reversePolishButton that will change the setting depending which type of
   * expression they want to solve.. Private instance of TextField called resultField that will
   * display the solution to the question. Private instance of Label type called resultLabel that
   * displays "Solution" to make it easier for users to navigate through.
   */
  @FXML
  private Button calculateButton;

  @FXML
  private Label calculatorLabel;

  @FXML
  private RadioButton infixButton;

  @FXML
  private TextField inputField;

  @FXML
  private Label inputLabel;

  @FXML
  private Pane mainPane;

  @FXML
  private TextField resultField;

  @FXML
  private Label resultLabel;

  @FXML
  private RadioButton reversePolishButton;

  @FXML
  private ToggleGroup toggleGroup1;
}

package uk.ac.rhul.cs2800;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * Created a class called MainView which includes the attributes of the main pane of the calculator.
 * 
 * @author Zainab
 *
 */
public class MainView {

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
}

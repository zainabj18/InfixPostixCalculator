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
   * Private instance of Pane type called mainPane. Private instance of Label type called
   * calculatorLabel. Private instance of Label type called inputLabel. Private instance of
   * TextField type called inputField. Private instance of type Button called calculatorButton. Two
   * Private instances of RadioButton type called infixButton and reversePolishButton.
   */
  @FXML
  private Label calculatorLabel;

  @FXML
  private Button calculateButton;

  @FXML
  private TextField inputField;

  @FXML
  private Label inputLabel;

  @FXML
  private RadioButton infixButton;

  @FXML
  private RadioButton reversePolishButton;

  @FXML
  private Pane mainPane;

}

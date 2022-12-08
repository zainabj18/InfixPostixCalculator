package uk.ac.rhul.cs2800;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
   * TextField type called inputField.
   */
  @FXML
  private Label calculatorLabel;

  @FXML
  private TextField inputField;

  @FXML
  private Label inputLabel;

  @FXML
  private Pane mainPane;

}

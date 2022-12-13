package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * creating a class Driver that extends from the inbuilt javaFx application and launches the main
 * pane of the calculator.
 * 
 * @author Zainab
 * 
 *
 */
public class Driver extends Application {
  

  /**
   * main method of this class that calls the inbuilt method launch to launch the main pane.
   * This method creates the pane.
   * 
   * @param args , is a parameter passed in the main function of this class and then passed as a
   *        parameter to the launch function.
   */
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Controller c = new Controller();
    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainView.fxml"));
    Scene scene = new Scene(loader.load(), 600, 400);
    c.addView(loader.getController());
    primaryStage.setScene(scene);
    primaryStage.show();
  }



}

package uk.ac.rhul.cs2800;

/**
 * Credit to: Dave Cohen from his code MVC-separated. Class ControllerInterface created so that a
 * View can add itself to a Controller.
 * 
 * @author Zainab
 *
 */
public interface ControllerInterface {
  /**
   * The method a View calls to register itself with a Controller.
   * 
   * @param v a reference to new View to be associated with the Controller.
   */
  public void addView(ViewInterface v);
}

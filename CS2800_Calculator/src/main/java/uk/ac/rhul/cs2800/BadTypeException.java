package uk.ac.rhul.cs2800;

/**
 * creating a class for badTypeException so when a wrong type of entry is used, the exception will
 * be thrown.
 * 
 * @author Zainab
 *
 */
public class BadTypeException extends Exception {

  /**
   * ID.
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constructor for bad type exception.
   * 
   */
  public BadTypeException() {
    super();
  }

  /**
   * a toString method for the bad type exception that returns a string.
   *
   */
  @Override
  public String toString() {
    return "badTypeException error";
  }

}

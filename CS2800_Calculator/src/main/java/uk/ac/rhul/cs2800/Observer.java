package uk.ac.rhul.cs2800;

/**
 * This defines a new functional type that we can then name as more meaningful for an observer
 * notification. Credit to: Dave Cohen from his code MVC-separated
 * 
 * @author Zainab
 *
 */
@FunctionalInterface
public interface Observer {
  /**
   * The named mechanism that we will use when we are notifying an Observer.
   */
  public void tell();
}


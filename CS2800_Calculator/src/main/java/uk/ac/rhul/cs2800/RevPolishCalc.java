package uk.ac.rhul.cs2800;

/**
 * Credit to: Dave Cohen for the code for getInstance method which i have added into this file.
 * created a class called RevPolishCalc which will evaluate reverse polish string expressions.
 * 
 * @author Zainab
 *
 */
public class RevPolishCalc {

  NumStack stack = new NumStack();
  float result;
  float value1 = 0;
  float value2 = 0;


  /**
   * The (exactly) one instance of this class. Created in a lazy manner when it is required.
   */
  private static RevPolishCalc instance = null;

  /**
   * The hook to access this Singleton Calculator. The first time it is called it does the actual
   * instantiation - this is called lazy.
   * 
   * @return instance.
   */
  public static RevPolishCalc getInstance() {
    if (instance == null) {
      instance = new RevPolishCalc();  
    }
    return instance;
  }


  /**
   * creating a method called evaluate for reverse polish notation that will check if the expression
   * given is of type reverse polish.Used a try catch statements to first check if the expression
   * inputted is a valid expression after removing the white spaces in between the expression.. If
   * not, it then throws an invalid expression exception. Then used a for loop to check whether the
   * current input is a symbol. If its not a symbol, it pushes the number onto the stack. Used a
   * switch to check for each case. If its a plus symbol, it should add the two values. If its a
   * subtract symbol, it should subtract the two values. If it is a multiplication, it should
   * multiply two values. If it is a division, it should divide the two values.
   * 
   * @param stringToEvaluate is a string type parameter passed in the evaluate function that checks
   *        the validity of the expressions against a reverse polish expression's structure.
   * @returns a float value called result.
   */


  public float evaluate(String stringToEvaluate) {
    try {
      String[] inputString = stringToEvaluate.split(" "); // Removes white space

      if (stringToEvaluate.equals("")) {
        throw new InvalidExpression();
      }
      for (String newString : inputString) {
        if (isSymbol(newString.charAt(0))) { // Check whether the input is a symbol
          value1 = stack.pop();
          value2 = stack.pop();
          switch (newString.charAt(0)) {
            case '+':
              stack.push(value2 + value1);
              break;
            case '-':
              stack.push(value2 - value1);
              break;
            case 'x':
              stack.push(value2 * value1);
              break;
            case '/':
              stack.push(value2 / value1);
              break;
            default:
              stack.push(Float.parseFloat(newString));
          }
        } else {
          stack.push(Float.parseFloat(newString)); // If it's not a symbol, push the number
        }
      }

      result = stack.pop();
    } catch (Exception e) {
      throw new InvalidExpression();
    }
    return result;
  }

  /**
   * isSymbol. This method returns a boolean value after checking whether the character passed is a
   * symbol.
   * 
   * @param character is the character being checked if its a symbol or not.
   *
   * @return true if character is a symbol.
   */

  private boolean isSymbol(char character) {
    for (Symbol s : Symbol.values()) { // for a symbol in the expression
      if (character == s.getValueAsChar()) { // if the character is a symbol
        return true; // return true
      }
    }

    return false;
  }


}


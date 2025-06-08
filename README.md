# InfixPostixCalculator 

A simple Java command-line calculator that converts **infix** arithmetic expressions (e.g., `3 + 4 * 2`) to **postfix** (Reverse Polish Notation, e.g., `3 4 2 * +`) and evaluates them using stack-based algorithms.


## Features

- Converts infix expressions to postfix using the **Shunting‑Yard algorithm**
- Evaluates postfix expressions using a stack
- Supports basic arithmetic operators: `+`, `-`, `*`, `/`, and parentheses `()`
- Handles multi-digit integer operands
- Validates expression syntax (balanced parentheses and operator order)


## Tech Stack

- **Language**: Java (no external dependencies)
- **Key Components**:
  - `Main.java`: Entry point and CLI interaction
  - `Tokenizer.java`: Splits input into numbers, operators, and parentheses
  - `InfixToPostfix.java`: Applies Shunting‑Yard algorithm
  - `PostfixEvaluator.java`: Computes result from postfix notation


## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or newer

### Build & Run

1. **Clone the repo:**

    ```bash
    git clone https://github.com/zainabj18/InfixPostixCalculator.git
    
    cd InfixPostixCalculator
    ```

2. **Compile:**

    ```bash
    javac src/*.java
    ```

3. **Run the program:**

    ```bash
    java -cp src Main
    ```

4. **Example session:**

    ```
    Select mode: [1] Infix → Postfix & Evaluate
                 [2] Postfix → Evaluate only
    Enter mode: 1
    Enter expression: (3 + 4) * 2
    Postfix: 3 4 + 2 *
    Result: 14
    ```


## Project Structure

    src/
├── Main.java # CLI entry point
├── Tokenizer.java # Tokenizes input strings
├── InfixToPostfix.java # Converts infix to postfix
└── PostfixEvaluator.java # Evaluates postfix expressions



## How It Works

1. **Tokenization**: Split the input string into meaningful chunks—numbers, parentheses, operators.  
2. **Infix → Postfix**: Shunting‑Yard algorithm maintains operator precedence and parentheses to build a postfix list.  
3. **Postfix Evaluation**: Use a stack to calculate the result—push numbers, apply operators, push intermediate results.


## Potential Improvements

- Support for **floating-point numbers**
- Add **exponentiation operator (`^`)**
- Handle **unary operators** (e.g., `-5`)
- Provide **error messages** for malformed expressions
- Create **unit tests** with JUnit for validation


## Author

 **Zainab J.**  










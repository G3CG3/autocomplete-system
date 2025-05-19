# AutoComplete System

A simple Java console application demonstrating efficient prefix-based word suggestions using `TreeSet`.

## Overview

This project uses a `TreeSet<String>` to store a sorted dictionary of words and provides auto-completion suggestions based on a user’s input prefix.

The main class, `AutoCompleteApp`, reads input prefixes and returns all matching words from the dictionary in sorted order.

## How to Run

1. Compile the project in your IDE (e.g., IntelliJ).
2. Run the `AutoCompleteSystem` class.
3. Type a prefix when prompted and observe the suggested completions printed to the console.

## Sample Output
Type a prefix: 
> ap <br>
Results are: <br>
apple <br>
application <br>
apricot

## Concepts Demonstrated

- Use of `TreeSet` for sorted data storage
- Efficient prefix search with `tailSet()`
- Basic console input/output handling

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to expand this project by adding features such as loading words from a file, frequency-based ranking, or a graphical interface.
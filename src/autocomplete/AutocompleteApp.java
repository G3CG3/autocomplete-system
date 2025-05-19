package autocomplete;

import java.util.List;
import java.util.Scanner;

public class AutocompleteApp {
    public static void main(String[] args) {
        AutocompleteSystem ac = new AutocompleteSystem();

        // Sample dictionary
        ac.addWord("apple");
        ac.addWord("application");
        ac.addWord("apricot");
        ac.addWord("banana");
        ac.addWord("ball");
        ac.addWord("bat");
        ac.addWord("carrot");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a prefix to get suggestions (or 'exit' to quit):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            List<String> results = ac.getSuggestions(input);
            if (results.isEmpty()) {
                System.out.println("No suggestions found.");
            } else {
                System.out.println("Results are:");
                results.forEach(System.out::println);
            }
        }
        scanner.close();
    }
}

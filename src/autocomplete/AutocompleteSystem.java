package autocomplete;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class AutocompleteSystem {
    private TreeSet<String> dictionary;

    public AutocompleteSystem() {
        dictionary = new TreeSet<>();
    }

    public void addWord(String word) {
        dictionary.add(word.toLowerCase());
    }

    public List<String> getSuggestions(String prefix) {
        prefix = prefix.toLowerCase();
        List<String> suggestions = new ArrayList<>();

        SortedSet<String> tail = dictionary.tailSet(prefix);

        for (String word : tail) {
            if (word.contains(prefix)) {
                suggestions.add(word);
            } else {
                break;
            }
        }
        return suggestions;
    }
}

 
/*Write a method that will search an array of strings for all strings that contain another string, ignoring capitalization. Then return an array of the found strings.

The method takes two parameters, the query string and the array of strings to search, and returns an array.

If the string isn't contained in any of the strings in the array, the method returns an array containing a single string: "Empty" (or Nothing in Haskell, or "None" in Python)

Examples

If the string to search for is "me", and the array to search is ["home", "milk", "Mercury", "fish"], the method should return ["home", "Mercury"].*/

sol:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class WordSearch {
  static String[] findWord(String x, String[] y){
        List<String> list = Arrays.stream(y).filter(s -> s.toLowerCase().contains(x)).collect(Collectors.toList());
        if (list.isEmpty()) {
            list.add("Empty");
        }
        return list.toArray(new String[0]);
  }
}
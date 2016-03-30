//Description:

//Given a string, you need to write a method that order every letter in this string in ascending order.

//Also, you should validate that the given string is not empty or null. If so, the method should return:

//"Invalid String!";
//Examples

//new Ordering().orderWord("hello world") => " dehllloorw"
//new Ordering().orderWord("bobby") => "bbboy"
//new Ordering().orderWord("") => "Invalid String!" 



Solution:

import java.util.Arrays;

public class Ordering {
  public String orderWord(String s){  
    if(s ==null || s.length() == 0){
      return "Invalid String!";
    }
  
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}


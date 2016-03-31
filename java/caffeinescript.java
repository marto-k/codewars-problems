//Description:

//Complete the function caffeineBuzz, which takes a non-zero integer as it's one argument.

//If the integer is divisible by 3, return the string "Java".

//If the integer is divisible by 3 and divisible by 4, return the string "Coffee"

//If the integer is one of the above and is even, add "Script" to the end of the string.

//Otherwise, return the string "mocha_missing!"

//caffeineBuzz(1)   => "mocha_missing!"
//caffeineBuzz(3)   => "Java"
//caffeineBuzz(6)   => "JavaScript"
//caffeineBuzz(12)  => "CoffeeScript" 


solution:

// Problem: Caffeine Script (http://www.codewars.com/kata/caffeine-script)

public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    String output = "";
    if (n % 3 == 0 || n % 4 == 0){
      if(n % 4 == 0){
        output += "Coffee";
      } else {
        output += "Java";
      }

      if(n % 2 == 0){
        output += "Script";
      }
    }
    else {
      output = "mocha_missing!";
    }

    return output;
  }
}
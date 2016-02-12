 
/*In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

HighAndLow("1 2 3 4 5") // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.*/

sol:

import java.util.*;
public class Kata {
  public static String HighAndLow(String numbers) {
      String str = numbers;
      String [] arr = str.split(" ");
      Integer [] arr2 = new Integer[arr.length];
      for (int x = 0; x < arr.length; x++)
      {
        arr2[x] = Integer.parseInt(arr[x]);
      }
      Arrays.sort(arr2);
      return arr2[arr2.length-1]+" "+arr2[0];
  }
}
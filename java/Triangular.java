/*Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots. i.e.

1st (1)   2nd (3)    3rd (6)
*          **        ***
           *         **
                     *

You need to return the nth triangular number. You should return 0 for out of range values:*/

Solution:


public class Reverse {

    public String reverse(String str) {
    
    if(str.length() == 1 || str == null) return str;
    
    return reverse(str.substring(1)) + str.charAt(0);
    
    }
} 

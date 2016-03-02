/*Have a look at the following numbers.

 n | score
---+-------
 1 |  50
 2 |  150
 3 |  300
 4 |  500
 5 |  750

Can you find a pattern in it? If so, then write a function getScore(n) which returns the score for any positive number n:

getScore(1); // === 50
getScore(2); // === 150
getScore(3); // === 300
// ... 

*/


Solution:
  
  public class Sequence {

  public static long getScore(long n) {
    return 25 * n * (n + 1);
  }
}

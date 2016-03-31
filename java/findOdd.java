//Given an array, find the int that appears an odd number of times.

//There will always be only one integer that appears an odd number of times. 


Solution:

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOdd {

    public static int findIt(final int[] A) {

        final List<Integer> collection = IntStream.of(A).mapToObj(Integer::valueOf).collect(Collectors.toList());
        return IntStream.of(A).filter(x -> Collections.frequency(collection, x) % 2 == 1).findFirst().getAsInt();
    }
}



or






public class FindOdd {
  public static int findIt(int[] A) {
    int xor = 0;
    for (int i = 0; i < A.length; i++) {
      xor ^= A[i];
    }
    return xor;
  }
}

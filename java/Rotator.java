//Create a method named "rotate" that returns a given array with the elements inside the array rotated n spaces.

//If n is greater than 0 it should rotate the array to the right. If n is less than 0 it should rotate the array to the left. If n is 0, then it should return the array unchanged.

//Example:

//Object[] data = new Object[]{1, 2, 3, 4, 5};

//rotate(data, 1)    =>    {5, 1, 2, 3, 4}
//rotate(data, 2)    =>    {4, 5, 1, 2, 3}
//rotate(data, 3)    =>    {3, 4, 5, 1, 2}
//rotate(data, 4)    =>    {2, 3, 4, 5, 1}
//rotate(data, 5)    =>    {1, 2, 3, 4, 5}

//rotate(data, 0)    =>    {1, 2, 3, 4, 5}

//rotate(data, -1)    =>    {2, 3, 4, 5, 1} 


Solution:


public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        Object[] rotated = new Object[data.length];
        while (n < 0)
            n += data.length;
        for (int i = 0; i < data.length; ++i) {
            rotated[(i + n) % rotated.length] = data[i];
        }
        return rotated;
    }

}

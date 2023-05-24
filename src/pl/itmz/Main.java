package pl.itmz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        int size = arr.length;
        System.out.println("CountDistinct= " +countDistinct(arr, size));
    }

//        LH

// Write a function int countDistinct(int arr[], int n)
// that, given an array A consisting of N integers, returns the number of distinct values in array A.

// For example, given array A consisting of six elements such that:

// A[0] = 2    A[1] = 1    A[2] = 1
// A[3] = 2    A[4] = 3    A[5] = 1
// the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
    public static int countDistinct(int arr[], int n)
    {
        Integer[] integers = convertintArray2IntegerArray(arr);
        Set<Integer> setFormArray = new HashSet<Integer>(Arrays.asList(integers));

        return setFormArray.size();
    }
    public static Integer[] convertintArray2IntegerArray(int[] arr){
            return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }

    @Test
    void countDistinctShouldReturn3(){
        int[] ints = {2,1,1,2,3,1};
        int actual = countDistinct(ints,5);
        int expected = 3;
        assertEquals(actual,expected);
    }
}

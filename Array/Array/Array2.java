package Array.Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        String a[]={"coding ","keyword", "operation","education"};

        System.out.println("toString() " + Arrays.toString(a));

        System.out.println("asList() " + Arrays.asList(a));

        System.out.println("deepToString() " + Arrays.deepToString(a));

        int array[] []={{20,34},{34,45}};// @2D
        System.out.println("deepToString"+ Arrays.deepToString(array));
    }
}

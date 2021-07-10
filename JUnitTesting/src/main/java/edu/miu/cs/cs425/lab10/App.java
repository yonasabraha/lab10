package edu.miu.cs.cs425.lab10;


import edu.miu.cs.cs425.lab10.problem1Utils.ArrayFlattener;
import edu.miu.cs.cs425.lab10.problem2Utils.ArrayReversor;

import java.util.Arrays;


public class App 
{
    public static void main( String[] args )
    {
       


        ArrayFlattener arrayFlattener=new ArrayFlattener();
        ArrayReversor arrayReversor=new ArrayReversor();
        int[][] a = {{1, 2, 3}, {4, 5, 6, 7}};
        int[] b=arrayFlattener.flattenedArray(a);

        int[] reversed=arrayReversor.reverseArraySample(b);
        Integer[] expected={1,2,3,4,5,6,7};

            System.out.print(Arrays.toString(reversed));
    }
}

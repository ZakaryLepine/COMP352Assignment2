package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Question2 {
    public static void main(String[] args)
    {
        int[] A = {123, 73, 39, 12, 14, 9, 113, 93, 203, 22, 25, 10};
        arrayModulo(3, A);
    }
    public static void arrayModulo(int x, int[] A) //WORKS BUT O(N^2) Omega(1)? -> 1 element in Array no comparisons necessary
    {
        for (int i = 0; i < A.length;i++)
        {
            for (int j = 0; j < A.length; j++)
            {
                if (i == j)
                {
                    if (A[i] % A[j] <= x)
                    {
                        System.out.println("Indices " + i + " & " + j + " with values " + A[i] + " & " + A[j]);
                    }
                }
                else
                {
                    if (A[i] % A[j] <= x) {
                        System.out.println("Indices " + i + " & " + j + " with values " + A[i] + " & " + A[j]);
                    }

                    if (A[j] % A[i] <= x) {
                        System.out.println("Indices " + j + " & " + i + " with values " + A[j] + " & " + A[i]);
                    }
                }
            }
        }
    }
}

package com.company;

import javax.swing.*;
import java.util.Queue;
import java.util.Stack;

public class Question1 {
    public static void main(String[] args)
    {
        int[] A = {22, 9, 61, 61, 61, 21, 0, 9, 9, 9, 9, 35, 81, 81, 9, 5, 5};
        int[] B = {1};
        int[] C = {1, 1, 1, 2, 7, 11, 3, 2, 5, 6, 9, 9,9, 10, 10, 11, 17, 18, 19};
        int[] D = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] E = {1, 1, 1, 2, 2, 6, 6, 6, 9, 9, 9, 9};
        consecutiveElements(E);
        stackConsecutiveElements(E);
    }
    /*
    Algorithm consecutiveElements(A)
    Input: Array A of n elements
    Output: Print of the value of elements that are consecutively repeated, the number of times that the element is consecutively repeated, and the starting index of the repeated element

        if A.length = 0
            return

        numberOfRepetitions := 1

        for i := 0 to n - 1 do
            while A[i] = A[i+1]
                if numberOfRepetitions = 1
                    startingIndex := i

                repeatedElement := true
                numberOfRepetitons := numberOfRepetitions + 1

             if repeatedElement = true
                printLine("Value " A[i] + " is repeated " + numberOfRepetitions + " times starting at index " + startingIndex)

             numberOfRepetitions := 1
             repeatedElement := false
     */
    public static void consecutiveElements(int[] A) //O(n) -> Must iterate through n elements Omega(1) -> 1 element in A
    {

        if (A.length <= 1)
        {
            return;
        }

        int startingIndex = 0;
        int numRepElem = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (i == 0)
            {
                if (A[i] == A[i + 1])
                {
                    startingIndex = i;
                    numRepElem = numRepElem + 1;
                }
            }
            else if (i == A.length - 1)
            {
                if (A[i] == A[i-1])
                {
                    numRepElem = numRepElem + 1;
                }

                if (numRepElem > 1)
                    System.out.println("Value " + A[i] + " is repeated " + numRepElem + " times starting at Index " + startingIndex);
            }
            else
            {
                if (A[i] == A[i+1] && A[i] != A[i-1])
                {
                    startingIndex = i;
                    numRepElem = numRepElem + 1;
                }
                else if (A[i] == A[i+1] && A[i] == A[i-1])
                {
                    numRepElem = numRepElem + 1;
                }
                else if (A[i] != A[i+1] && A[i] == A[i-1] && numRepElem > 0)
                {
                    numRepElem = numRepElem + 1;
                    System.out.println("Value " + A[i] + " is repeated " + numRepElem + " times starting at Index " + startingIndex);
                    numRepElem = 0;
                }
            }
        }
    }
    public static void stackConsecutiveElements(int[] A) //O(n^2) -> Iterate n elements * remove n elements from Stack when array is all the same element Omega(1) -> 1 element in A
    {

        if (A.length <= 1)
        {
            return;
        }

        int startingIndex = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < A.length; i++)
        {
            if (i == 0)
            {
                if (A[i] == A[i + 1])
                {
                    startingIndex = i;
                    s.push(A[i]);
                }
            }
            else if (i == A.length - 1)
            {
                if (A[i] == A[i-1])
                {
                    s.push(A[i]);
                }

                if (s.size() > 1)
                    System.out.println("Value " + A[i] + " is repeated " + s.size() + " times starting at Index " + startingIndex);
            }
            else
            {
                if (A[i] == A[i+1] && A[i] != A[i-1])
                {
                    startingIndex = i;
                    s.push(A[i]);
                }
                else if (A[i] == A[i+1] && A[i] == A[i-1])
                {
                    s.push(A[i]);
                }
                else if (A[i] != A[i+1] && A[i] == A[i-1] && s.size() > 0)
                {
                    s.push(A[i]);
                    System.out.println("Value " + A[i] + " is repeated " + s.size() + " times starting at Index " + startingIndex);
                    while(!s.empty())
                    {
                        s.pop();
                    }
                }
            }
        }
    }
}

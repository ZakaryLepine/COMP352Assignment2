package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class HitZero {
    public static void main(String[] args)
    {
        //Creating a output stream to a text file
        PrintWriter writer = null;
        try{
            writer = new PrintWriter("out.txt");
        }
        catch (IOException e){
            System.out.println("Error opening file");
        }

        int[] array1 = {4, 8, 5, 2, 3, 5, 1, 6, 4, 0};
        int[] array2 = {5, 8, 2, 3, 1, 5, 0};
        int[] array3 = {2, 4, 2, 2, 2, 4, 4, 0};
        int[] array4 = {10, 2, 6, 7, 3, 5, 6, 2, 4, 6, 1, 2, 4, 5, 6, 0};
        int[] array5 = {4, 5, 6, 10, 1, 2, 3, 7, 8, 9, 0};
        int[] array6 = {9, 2, 6, 1, 3, 8, 5, 10, 7, 4, 6, 3, 2, 5, 4, 9, 7, 1, 8, 0};
        int[] array7 = {9, 	5, 	4, 	9, 	6, 	5, 	6, 	2, 	9,	4, 5, 	6, 	2, 	9, 	0};
        int[] array8 = {3,	6, 	8, 	2, 	2, 	10, 6, 	2, 	7, 	7, 3, 	3, 	9, 	4, 	3, 	10, 	3, 	5, 	10, 	6, 3, 	3, 	9, 	4, 	3, 	10, 	3, 	5, 	10, 	0};
        int[] array9 = {2, 	10, 	1, 	8, 	5, 	4, 	6, 	1, 	7, 	0 };
        int[] array10 = {8, 	2, 	3, 	2, 	5, 	1, 	4, 	9, 	9, 	0};

        writer.print("Array1 has elements: ");
        for (int i = 0; i < array1.length; i++)
        {
            writer.print(array1[i] + ", ");
        }
        writer.println("\n(Recursion)Array1 has a solution with starting index " + 0 +  ": " + hitZeroWrapper(array1, 0));
        writer.println("(Stack)Array1 has a solution with starting index " + 0 +  ": " + stackHitZero(array1, 0) + "\n");
        writer.print("Array1 has elements: ");
        for (int i = 0; i < array1.length; i++)
        {
            writer.print(array1[i] + ", ");
        }
        writer.println("\n(Recursion)Array1 has a solution with starting index " + 3 +  ": " + hitZeroWrapper(array1, 3));
        writer.println("(Stack)Array1 has a solution with starting index " + 3 +  ": " + stackHitZero(array1, 3) + "\n");

        writer.print("Array2 has elements: ");
        for (int i = 0; i < array2.length; i++)
        {
            writer.print(array2[i] + ", ");
        }
        writer.println("\n(Recursion)Array2 has a solution with starting index " + 0 +  ": " + hitZeroWrapper(array2, 0));
        writer.println("(Stack)Array2 has a solution with starting index " + 0 +  ": " + stackHitZero(array2, 0) + "\n");

        writer.print("Array2 has elements: ");
        for (int i = 0; i < array2.length; i++)
        {
            writer.print(array2[i] + ", ");
        }
        writer.println("\n(Recursion)Array2 has a solution with starting index " + 3 +  ": " + hitZeroWrapper(array2, 3));
        writer.println("(Stack)Array2 has a solution with starting index " + 3 +  ": " + stackHitZero(array2, 3) + "\n");

        writer.print("Array3 has elements: ");
        for (int i = 0; i < array3.length; i++)
        {
            writer.print(array3[i] + ", ");
        }
        writer.println("\n(Recursion)Array3 has a solution with starting index " + 2 +  ": " + hitZeroWrapper(array3, 2));
        writer.println("(Stack)Array3 has a solution with starting index " + 2 +  ": " + stackHitZero(array3, 2) + "\n");

        writer.print("Array3 has elements: ");
        for (int i = 0; i < array3.length; i++)
        {
            writer.print(array3[i] + ", ");
        }
        writer.println("\n(Recursion)Array3 has a solution with starting index " + 7 +  ": " + hitZeroWrapper(array3, 7));
        writer.println("(Stack)Array3 has a solution with starting index " + 7 +  ": " + stackHitZero(array3, 7) + "\n");

        writer.print("Array4 has elements: ");
        for (int i = 0; i < array4.length; i++)
        {
            writer.print(array4[i] + ", ");
        }
        writer.println("\n(Recursion)Array4 has a solution with starting index " + 0 +  ": " + hitZeroWrapper(array4, 0));
        writer.println("(Stack)Array4 has a solution with starting index " + 0 +  ": " + stackHitZero(array4, 0) + "\n");

        writer.print("Array4 has elements: ");
        for (int i = 0; i < array4.length; i++)
        {
            writer.print(array4[i] + ", ");
        }
        writer.println("\n(Recursion)Array4 has a solution with starting index " + 6 +  ": " + hitZeroWrapper(array4, 6));
        writer.println("(Stack)Array4 has a solution with starting index " + 6 +  ": " + stackHitZero(array4, 6) + "\n");

        writer.print("Array5 has elements: ");
        for (int i = 0; i < array5.length; i++)
        {
            writer.print(array5[i] + ", ");
        }
        writer.println("\n(Recursion)Array5 has a solution with starting index " + 8 +  ": " + hitZeroWrapper(array5, 8));
        writer.println("(Stack)Array5 has a solution with starting index " + 8 +  ": " + stackHitZero(array5, 8) + "\n");

        writer.print("Array5 has elements: ");
        for (int i = 0; i < array5.length; i++)
        {
            writer.print(array5[i] + ", ");
        }
        writer.println("\n(Recursion)Array5 has a solution with starting index " + 3 +  ": " + hitZeroWrapper(array5, 3));
        writer.println("(Stack)Array5 has a solution with starting index " + 3 +  ": " + stackHitZero(array5, 3) + "\n");

        writer.print("Array6 has elements: ");
        for (int i = 0; i < array6.length; i++)
        {
            writer.print(array6[i] + ", ");
        }
        writer.println("\n(Recursion)Array6 has a solution with starting index " + 2 +  ": " + hitZeroWrapper(array6, 2));
        writer.println("(Stack)Array6 has a solution with starting index " + 2 +  ": " + stackHitZero(array6, 2) + "\n");

        writer.print("Array6 has elements: ");
        for (int i = 0; i < array6.length; i++)
        {
            writer.print(array6[i] + ", ");
        }
        writer.println("\n(Recursion)Array6 has a solution with starting index " + 9 +  ": " + hitZeroWrapper(array6, 9));
        writer.println("(Stack)Array6 has a solution with starting index " + 9 +  ": " + stackHitZero(array6, 9) + "\n");

        writer.print("Array7 has elements: ");
        for (int i = 0; i < array7.length; i++)
        {
            writer.print(array7[i] + ", ");
        }
        writer.println("\n(Recursion)Array7 has a solution with starting index " + 11 +  ": " + hitZeroWrapper(array7, 11));
        writer.println("(Stack)Array7 has a solution with starting index " + 11 +  ": " + stackHitZero(array7, 11) + "\n");

        writer.print("Array7 has elements: ");
        for (int i = 0; i < array7.length; i++)
        {
            writer.print(array7[i] + ", ");
        }
        writer.println("\n(Recursion)Array7 has a solution with starting index " + 4 +  ": " + hitZeroWrapper(array7, 4));
        writer.println("(Stack)Array7 has a solution with starting index " + 4 +  ": " + stackHitZero(array7, 4) + "\n");

        writer.print("Array8 has elements: ");
        for (int i = 0; i < array8.length; i++)
        {
            writer.print(array8[i] + ", ");
        }
        writer.println("\n(Recursion)Array8 has a solution with starting index " + 22 +  ": " + hitZeroWrapper(array8, 22));
        writer.println("(Stack)Array8 has a solution with starting index " + 22 +  ": " + stackHitZero(array8, 22) + "\n");

        writer.print("Array8 has elements: ");
        for (int i = 0; i < array8.length; i++)
        {
            writer.print(array8[i] + ", ");
        }
        writer.println("\n(Recursion)Array8 has a solution with starting index " + 15 +  ": " + hitZeroWrapper(array8, 15));
        writer.println("(Stack)Array8 has a solution with starting index " + 15 +  ": " + stackHitZero(array8, 15) + "\n");

        writer.print("Array9 has elements: ");
        for (int i = 0; i < array9.length; i++)
        {
            writer.print(array9[i] + ", ");
        }
        writer.println("\n(Recursion)Array9 has a solution with starting index " + 0 +  ": " + hitZeroWrapper(array9, 0));
        writer.println("(Stack)Array9 has a solution with starting index " + 0 +  ": " + stackHitZero(array9, 0) + "\n");

        writer.print("Array9 has elements: ");
        for (int i = 0; i < array9.length; i++)
        {
            writer.print(array9[i] + ", ");
        }
        writer.println("\n(Recursion)Array9 has a solution with starting index " + 1 +  ": " + hitZeroWrapper(array9, 1));
        writer.println("(Stack)Array9 has a solution with starting index " + 1 +  ": " + stackHitZero(array9, 1) + "\n");

        writer.print("Array10 has elements: ");
        for (int i = 0; i < array10.length; i++)
        {
            writer.print(array10[i] + ", ");
        }
        writer.println("\n(Recursion)Array10 has a solution with starting index " + 4 +  ": " + hitZeroWrapper(array10, 4));
        writer.println("(Stack)Array10 has a solution with starting index " + 4 +  ": " + stackHitZero(array10, 4) + "\n");

        writer.print("Array10 has elements: ");
        for (int i = 0; i < array10.length; i++)
        {
            writer.print(array10[i] + ", ");
        }
        writer.println("\n(Recursion)Array10 has a solution with starting index " + 5 +  ": " + hitZeroWrapper(array10, 5));
        writer.println("(Stack)Array10 has a solution with starting index " + 5 +  ": " + stackHitZero(array10, 5) + "\n");

        writer.close();
    }
    /*
        Wrapper method to hide the interior implementation of the hitZero recursive algorithm
     */
    public static boolean hitZeroWrapper(int[] A, int index)
    {
        boolean[] indexHasBeenVisited = new boolean[A.length];
        return hitZero(A,indexHasBeenVisited,index);
    }
    /*
        Tail recursive algorithm
     */
    public static boolean hitZero(int[] A, boolean[] indexHasBeenVisited, int index)
    {
        if (index == A.length-1 && A[index] == 0) //if index is the last element of the array and equal to 0
        {
            return true;
        }

        if (index + A[index] <= A.length-1 && !indexHasBeenVisited[index + A[index]]) //If moving right lands on a square that exists (square is less than or equal to the last square) and the index has not been visited yet
        {
            indexHasBeenVisited[index + A[index]] = true;   //Index has been visited
            return hitZero(A, indexHasBeenVisited, index + A[index]); //Moves index to the left by index + value of element at index
        }
        else if (index - A[index] >= 0) //If moving left lands on a square that exists (square is greater than or equal to the first square)
        {
            indexHasBeenVisited[index - A[index]] = true; //Index has been visited
            return hitZero(A, indexHasBeenVisited, index - A[index]); //Moves index to the left by index - value of element at index
        }
        return false; //If moving left and right is impossible. Solution does not exist.
    }
    /*
        Iterative algorithm that uses a stack
     */
    public static boolean stackHitZero(int[] A, int index)
    {
        Stack<Integer> s = new Stack<>();
        boolean[] indexHasBeenVisited = new boolean[A.length];

        if (index + A[index] <= A.length-1) //If moving right lands on a square that exists (square is less than or equal to the last square)
        {
            indexHasBeenVisited[index + A[index]] = true; //Index has been visited
            s.push(index + A[index]); //Moves index to the right by index + value of element at index
        }
        else if (index - A[index] >= 0) //If moving left lands on a square that exists (square is greater than or equal to the first square)
        {
            indexHasBeenVisited[index - A[index]] = true; //Index has been visited
            s.push(index - A[index]); //Moves index to the left by index - value of element at index
        }
        else
        {
            return false; //Cannot move left or right. Solution does not exist
        }

        while(s.peek() != A.length-1 && A[s.peek()] != 0) //While top value of the stack is not the last index of the array and not equal to 0
        {
            if (s.peek() + A[s.peek()] <= A.length-1 &&  !indexHasBeenVisited[s.peek() + A[s.peek()]]) //If moving right lands on a square that exists (square is less than or equal to the last square) and the index has not been visited yet
            {
                indexHasBeenVisited[s.peek() + A[s.peek()]] = true; //Index has been visited
                s.push(s.peek() + A[s.peek()]); //Moves index to the left by index + value of element at index
            }
            else if (s.peek() - A[s.peek()] >= 0) //If moving left lands on a square that exists (square is greater than or equal to the first square)
            {
                indexHasBeenVisited[s.peek() - A[s.peek()]] = true; //Index has been visited
                s.push(s.peek() - A[s.peek()]); //Moves index to the left by index - value of element at index
            }
            else
            {
                return false; //Cannot move left or right. Solution does not exist
            }
        }
        return true; //Solution exists (while loop exited. Thus, index equals last index of the array)
    }
}

package com.advanced.recursion;

public class Recur {

    /*

         if(test for base case)
         return base case value
         else if(test for another base case)
         return some other base case value
         //the recursive case
         else return(some work then a recursive call)
     */

    public static void main(String[] args) {
        //recursive
        System.out.println(print(4));
        //System.out.println(factorial(4));
    }

    public static int print(int n){
        if(n == 0){
            return 0;
        } else {
           return print(n-1);
        }
    }
    //calculates factoiral of positive int
    public static int factorial(int n){
        //base case fact: 0 is 1
        if(n == 0){
            return 1;
            //recursie case: multiply n by (n-1) factorial
        } else {
            return n*factorial(n-1);
        }
    }
}

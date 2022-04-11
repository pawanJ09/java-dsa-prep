package com.dsa.recursion;

public class Factorial {
  public static void main(String[] args) {
    int num = 10;
    int factNum = factorial(num);
    System.out.format("Factorial of %d is %d", num, factNum);
  }

  private static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n-1);
  }
}

package com.dsa.recursion;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 10;
    int fib_num = fib(n);
    System.out.format("Fibonacci of %d is %d", n, fib_num);
  }

  private static int fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fib(n-1) + fib(n-2);
  }
}

package com.dsa.recursion;

public class RecursiveRange {
  public static void main(String[] args) {
    int num = 10;
    int range = recursiveRange(num);
    System.out.format("Sum of all numbers till %d is %d", num, range);
  }

  private static int recursiveRange(int n) {
    if (n < 0) {
      return 0;
    }
    return n + recursiveRange(n-1);
  }
}

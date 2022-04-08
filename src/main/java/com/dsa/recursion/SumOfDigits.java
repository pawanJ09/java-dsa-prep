package com.dsa.recursion;

public class SumOfDigits {
  public static void main(String[] args) {
    int num = 2512;
    var sum = sumOfDigits(num);
    System.out.println("Sum of Digits using recursive approach: " + sum);

    var sum2 = sumOfDigitsIterative(num);
    System.out.println("Sum of Digits using Iterative approach: " + sum2);
  }

  /**
   * This method calculates sum of digits using recursion.
   *
   * @param n int
   * @return result int
   */
  private static int sumOfDigits(int n) {
    if (n < 0 || n == 0) {
      return 0;
    }
    return n%10 + sumOfDigits(n/10);
  }

  /**
   * This method calculates sum of digits using iterative approach.
   *
   * @param n int
   * @return sum int
   */
  private static int sumOfDigitsIterative(int n) {
    int sum = 0;
    while (n > 0) {
      sum = sum + n%10;
      n = n/10;
    }
    return sum;
  }

}

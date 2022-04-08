package com.dsa.recursion;

public class GCD {
  public static void main(String[] args) {
    int num1 = 48;
    int num2 = 18;
    int gcd = calculateGcd(num1, num2);
    System.out.format("GCD of %d and %d is %d", num1, num2, gcd);
  }

  private static int calculateGcd(int num1, int num2) {
    if (num1 < 0 || num2 < 0) {
      return -1;
    }
    if (num2 == 0) {
      return num1;
    }
    return calculateGcd(num2, num1%num2);
  }
}

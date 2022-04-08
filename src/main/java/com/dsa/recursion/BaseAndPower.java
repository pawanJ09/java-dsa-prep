package com.dsa.recursion;

public class BaseAndPower {
  public static void main(String[] args) {
    int baseNum = 6;
    int powerNum = 3;
    int pow = calculatePow(baseNum, powerNum);
    System.out.format("%d to the power of %d is %d", baseNum, powerNum, pow);
  }

  private static int calculatePow(int base, int exp) {
    if (exp < 0) {
      return -1;
    }
    if (exp == 0) {
      return 1;
    }
    return base * calculatePow(base, exp-1);
  }
}

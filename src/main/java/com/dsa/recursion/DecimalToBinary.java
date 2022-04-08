package com.dsa.recursion;

public class DecimalToBinary {
  public static void main(String[] args) {
    int num = 10;
    int binary = calculateBinary(num);
    System.out.format("Binary of %d is %d", num, binary);
  }

  private static int calculateBinary(int n) {
    if (n<0 || n == 0) {
      return 0;
    }
    return n%2 + 10 * calculateBinary(n/2);
  }
}

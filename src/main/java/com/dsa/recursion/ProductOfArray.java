package com.dsa.recursion;

import java.util.Arrays;

public class ProductOfArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int product = productOfArray(arr, arr.length);
    System.out.format("Product of array %s is %d", Arrays.toString(arr), product);
    int product2 = productOfArrayRecursive(arr, arr.length-1);
    System.out.println();
    System.out.format("Recursive Product of array %s is %d", Arrays.toString(arr), product2);
  }

  private static int productOfArray(int[] arr, int length) {
    int counter = arr.length;
    int product = 1;
    while(counter > 0) {
      product = product * arr[counter-1];
      counter--;
    }
    return product;
  }

  private static int productOfArrayRecursive(int[] arr, int index) {
    if (index <= 0) {
      return 1;
    }
    return arr[index] * productOfArrayRecursive(arr, index-1);
  }
}

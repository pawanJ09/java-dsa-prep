package com.dsa.recursion;

public class ReverseString {
  public static void main(String[] args) {
    String input = "Java is good";
    System.out.format("The reverse of %s is %s", input, reverse_str((input)));
  }

  public static String reverse_str(String str) {
    if (str.isEmpty()) {
      return str;
    }
    return reverse_str(str.substring(1)) + str.charAt(0);
  }
}

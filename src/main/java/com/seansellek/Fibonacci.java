package com.seansellek;
import java.util.Scanner;

public class Fibonacci {
  public static long naive_calc_fib(int n) {
    if (n <= 1)
      return n;

    return naive_calc_fib(n - 1) + naive_calc_fib(n - 2);
  }

  public static long calc_fib(int n) {
    if (n <= 1) {
      return n;
    }

    long minus1 = 0;
    long result = 1;
    for (int i = 2; i <= n; i++) {
      long newValue = result + minus1;
      minus1 = result;
      result = newValue;
    }
    return result;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
    in.close();
  }
}


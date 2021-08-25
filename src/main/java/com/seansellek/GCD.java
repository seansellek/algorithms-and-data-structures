package com.seansellek;
import java.util.*;

public class GCD {
  public static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }

  public static int gcd_euclid(int a, int b) {
    if (b == 0) {
      return a;
    }

    return gcd_euclid(b, a % b);
  }

  public static void main(String args[]) {
    var scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_euclid(a, b));
  }
}


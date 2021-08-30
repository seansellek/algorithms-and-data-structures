package com.seansellek;

import java.util.Scanner;

public class Change {
    private static int[] denominations = { 10, 5, 1 };
    
    /**
     * Approach:
     * Apply the largest denomination that is <= the desired amount.
     * Repeat with remainder until remainder = 0
     * 
     * Proof:
     * Because each denomination is cleanly divided by the smaller 
     * denominations, selecting a denomination other than the largest one
     * that fits will ultimately lead you to select a collection of smaller
     * denominations that could be cleanly replaced by the larger denomination.
     */
    public static int getChange(int m) {
        int remainder = m;
        int coinsUsed = 0;

        while (remainder > 0) {
            for (int denomination : denominations) {
                if (remainder >= denomination) {
                    remainder -= denomination;
                    coinsUsed++;
                    break;
                }
            }
        }

        return coinsUsed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
        scanner.close();
    }
}


package com.seansellek;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FractionalKnapsack {
    public static double getOptimalValue(int capacity, int[] values, int[] weights) {
        int remainingCapacity = capacity;
        double optimalValue = 0;

        PriorityQueue<Item> items = new PriorityQueue<Item>(Collections.reverseOrder());
        
        for (int i = 0; i < values.length; i++) {
            Item item = new Item(values[i], weights[i]);
            items.add(item);
        }
        
        
        while (remainingCapacity > 0) {
            if (items.size() == 0) {
                break;
            }

            Item mostValuableItem = items.poll();

            if (mostValuableItem.getWeight() <= remainingCapacity) {
                remainingCapacity -= mostValuableItem.getWeight();
                optimalValue += mostValuableItem.getTotalValue();
            } else {
                optimalValue += mostValuableItem.getValue() * remainingCapacity;
                remainingCapacity = 0;
            }
        }

        return optimalValue;
    }
    

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
        scanner.close();
    }
} 

class Item implements Comparable<Item> {
    private double value;
    private int weight;

    public Item(int totalValue, int weight) {
        this.weight = weight;
        this.value = (double) totalValue / weight;
    }

    public Double getValue() {
        return this.value;
    }
    
    public double getWeight()  {
        return this.weight;
    }

    public double getTotalValue() {
        return this.value * this.weight;
    }

    public int compareTo(Item item) {
        return this.getValue().compareTo(item.getValue()); 
    }
}
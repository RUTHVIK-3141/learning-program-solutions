package com.myshop.search;

import java.util.Arrays;

public class SearchDemo {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.getProductName().equals(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, String targetName) {
        int low = 0, high = sortedProducts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProd = sortedProducts[mid];
            int cmp = midProd.getProductName().compareTo(targetName);
            if (cmp == 0) {
                return midProd;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Keyboard", "Electronics"),
            new Product(2, "Monitor",  "Electronics"),
            new Product(3, "Mouse",    "Electronics"),
            new Product(4, "Notebook", "Stationery"),
            new Product(5, "Pen",      "Stationery")
        };

        Product result1 = linearSearch(products, "Notebook");
        System.out.println("Linear Search Result: " + result1);

        Product[] sorted = Arrays.copyOf(products, products.length);
        Arrays.sort(sorted);

        Product result2 = binarySearch(sorted, "Notebook");
        System.out.println("Binary Search Result: " + result2);
    }
}

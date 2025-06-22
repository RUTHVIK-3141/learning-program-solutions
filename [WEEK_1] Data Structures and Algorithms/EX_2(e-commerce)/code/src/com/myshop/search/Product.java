package com.myshop.search;

public class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Getters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format("Product[id=%d, name=%s, category=%s]",
                             productId, productName, category);
    }

    // For binary search sorting by name
    @Override
    public int compareTo(Product other) {
        return this.productName.compareTo(other.productName);
    }
}

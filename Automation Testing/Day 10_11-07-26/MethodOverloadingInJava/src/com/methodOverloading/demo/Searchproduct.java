package com.methodOverloading.demo;


public class Searchproduct {

    public void search(String productName) {
        System.out.println("Searching by Product Name");
    }

    public void search(String productName, String brand) {
        System.out.println("Searching by Product and Brand");
    }

    public void search(String productName, String brand, int price) {
        System.out.println("Searching by Product, Brand and Price");
    }

    public static void main(String[] args) {
        Searchproduct s = new Searchproduct();

        s.search("Laptop");
        s.search("Laptop", "MacBook Pro");
        s.search("Laptop", "Lenovo", 60000);
    }
}

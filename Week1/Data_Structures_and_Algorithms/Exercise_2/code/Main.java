package Week1.Data_Structures_and_Algorithms.Exercise_2.code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("101", "Product1", "Category1"),
                new Product("102", "Product2", "Category2"),
                new Product("103", "Product3", "Category1"),
                new Product("104", "Product4", "Category3"),
                new Product("105", "Product5", "Category2")
        };

        // Sorting products array by productId for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        // Linear search example
        LinearSearch obj=new LinearSearch();
        Product result1 = obj.linearSearch(products, "103");
        System.out.println("Linear Search Result: " + result1);

        // Binary search example
        Product result2 = BinarySearch.binarySearch(products, "103");
        System.out.println("Binary Search Result: " + result2);
    }
}

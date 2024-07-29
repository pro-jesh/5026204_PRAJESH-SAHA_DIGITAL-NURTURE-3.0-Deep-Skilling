package Week1.Exercise_3.code;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("101", "Alice", 250.0),
                new Order("102", "Bob", 150.0),
                new Order("103", "Charlie", 300.0),
                new Order("104", "David", 200.0),
                new Order("105", "Eve", 350.0)
        };

        // Bubble sort example
        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
        // Quick sort example
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

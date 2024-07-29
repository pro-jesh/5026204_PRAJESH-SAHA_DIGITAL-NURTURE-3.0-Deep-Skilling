package Week1.Data_Structures_and_Algorithms.Exercise_1.code;

import java.util.HashMap;

public class InventoryManagement {
    private HashMap<String, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to update a product
    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Method to display the inventory
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

        // Adding products
        Product product1 = new Product("101", "Product1", 10, 100.0);
        Product product2 = new Product("102", "Product2", 20, 200.0);
        inventoryManagement.addProduct(product1);
        inventoryManagement.addProduct(product2);

        // Displaying the inventory
        System.out.println("Inventory after adding products:");
        inventoryManagement.displayInventory();

        // Updating a product
        inventoryManagement.updateProduct("101", "UpdatedProduct1", 15, 150.0);

        // Displaying the inventory after update
        System.out.println("Inventory after updating product 101:");
        inventoryManagement.displayInventory();

        // Deleting a product
        inventoryManagement.deleteProduct("102");

        // Displaying the inventory after deletion
        System.out.println("Inventory after deleting product 102:");
        inventoryManagement.displayInventory();
    }
}


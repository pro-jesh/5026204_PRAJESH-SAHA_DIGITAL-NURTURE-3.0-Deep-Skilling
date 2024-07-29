package Week1.Data_Structures_and_Algorithms.Exercise_2.code;
public class LinearSearch {
    public static Product linearSearch(Product[] products, String targetProductId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId)) {
                return product;
            }
        }
        return null;
    }
}


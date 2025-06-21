import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) return mid;
            else if (products[mid].productId < targetId) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(202, "Shoes", "Fashion"),
            new Product(303, "Book", "Stationery"),
            new Product(404, "Phone", "Electronics"),
            new Product(505, "T-Shirt", "Fashion")
        };

        System.out.println("🔍 Linear Search:");
        int index1 = linearSearch(products, 303);
        System.out.println(index1 >= 0 ? "Found at index " + index1 : "Not found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("🔍 Binary Search:");
        int index2 = binarySearch(products, 303);
        System.out.println(index2 >= 0 ? "Found at index " + index2 : "Not found");
    }
}

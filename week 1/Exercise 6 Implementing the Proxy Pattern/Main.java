public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("First call to image1:");
        image1.display();  // Loads and displays

        System.out.println("\nSecond call to image1:");
        image1.display();  // Uses cache

        System.out.println("\nFirst call to image2:");
        image2.display();  // Loads and displays
    }
}

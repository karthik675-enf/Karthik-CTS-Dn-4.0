public class Computer {
    // Required parameters
    private String cpu;
    private int ram;
    
    // Optional parameters
    private int storage;
    private boolean hasGraphicsCard;

    // Private constructor — only accessible via Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage = 256; // default
        private boolean hasGraphicsCard = false;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean value) {
            this.hasGraphicsCard = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Graphics Card: " + (hasGraphicsCard ? "Yes" : "No"));
        System.out.println();
    }
}

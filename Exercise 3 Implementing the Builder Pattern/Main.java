public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", 32)
                                .storage(1024)
                                .graphicsCard(true)
                                .build();

        Computer officePC = new Computer.Builder("Intel i5", 16)
                                .storage(512)
                                .build();

        System.out.println("Gaming PC:");
        gamingPC.showSpecs();

        System.out.println("Office PC:");
        officePC.showSpecs();
    }
}

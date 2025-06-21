public class Forecast {

    // Recursive method to calculate future value
    public static double futureValue(double pv, double rate, int years) {
        if (years == 0) {
            return pv;
        }
        return futureValue(pv, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double pv = 10000;          // Present value
        double rate = 0.05;         // 5% annual growth rate
        int years = 5;              // Forecast for 5 years

        double fv = futureValue(pv, rate, years);
        System.out.printf("Predicted value after %d years: %.2f\n", years, fv);
    }
}

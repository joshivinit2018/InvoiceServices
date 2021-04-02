public class InvoiceGenrator {
    private static final double MINMUM_COST_PER_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;

    public double calculateFare(double distance, int time) {
        return distance * MINMUM_COST_PER_PER_KILOMETER + time * COST_PER_TIME ;
    }
}

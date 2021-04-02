public class InvoiceGenrator {

    private static final double MINMUM_COST_PER_KILOMETER = 10;
    private static final int MINMUM_COST_PER_TIME =1 ;
    private static final double MINIMUM_FARE = 5;


    public double calculateFare(double distance, int time) {
         double totalfare = distance * MINMUM_COST_PER_KILOMETER + time * MINMUM_COST_PER_TIME ;
         if(totalfare< MINIMUM_FARE)
             return MINIMUM_FARE;
         return totalfare;
    }

    public double calculateFare(Ride[] rides) {
        double totalfare =0;
        for (Ride ride:rides){
        totalfare +=  this.calculateFare(ride.distance, ride.time);
        }
        return totalfare;
    }
}

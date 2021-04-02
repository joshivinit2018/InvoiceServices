import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    private Assertions Assert;

    @Test
    public void given_distance_and_time_should_written_total_fair_time() {
        InvoiceGenrator invoiceGenrator = new InvoiceGenrator();
        double distance = 2.0;
        int time =5;
        double fare = invoiceGenrator.calculateFare(distance, time);
        Assert.assertEquals(25,fare,0.0);
    }

    @Test
    public void given_distance_and_time_should_written_total_min_fair_time() {
        InvoiceGenrator invoiceGenrator = new InvoiceGenrator();
        double distance = 0.1;
        int time =1;
        double fare = invoiceGenrator.calculateFare(distance, time);
        Assert.assertEquals(5,fare,0.0);
    }

    @Test
    public void given_multiple_rides_should_return_total_fair() {
        InvoiceGenrator invoiceGenrator = new InvoiceGenrator();
        Ride[] rides={new Ride(2.0, 5),
                           new Ride(0.1, 1)
        };
        double fare = invoiceGenrator.calculateFare(rides);
        Assert.assertEquals(30,fare,0.0);
    }
}

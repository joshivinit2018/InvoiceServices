import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    private Assertions Assert;

    @Test
    void given_distance_and_time_should_written_total_fair_time() {
        InvoiceGenrator invoiceGenrator = new InvoiceGenrator();
        double distance = 2.0;
        int time =5;
        double fare = invoiceGenrator.calculateFare(distance, time);
        Assert.assertEquals(25,fare,0.0);
    }
}

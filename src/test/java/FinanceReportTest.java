import org.example.FinanceReport;
import org.example.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportTest {

    @Test
    public void testFinanceReportCreation() {
        Payment[] payments = {
                new Payment("Alice", 100),
                new Payment("Bob", 200)
        };
        FinanceReport report = new FinanceReport("Company X", payments);

        Assertions.assertEquals("Company X", report.getOwner());
        Assertions.assertArrayEquals(payments, report.getPayments());
        Assertions.assertEquals(300, report.getTotalAmount());
    }

    @Test
    public void testEmptyPayments() {
        FinanceReport report = new FinanceReport("Company Y", new Payment[]{});
        Assertions.assertEquals(0, report.getTotalAmount());
    }
}

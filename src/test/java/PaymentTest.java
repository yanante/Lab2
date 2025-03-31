import org.example.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    @Test
    public void testPaymentCreation() {
        Payment payment = new Payment("John Doe", 150.5);
        Assertions.assertEquals("John Doe", payment.getClass());
        Assertions.assertEquals(150.5, payment.getAmount());
    }

    @Test
    public void testNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Payment("John Doe", -100));
    }

    @Test
    public void testToString() {
        Payment payment = new Payment("Alice", 200);
        Assertions.assertEquals("Payment{payer='Alice', amount=200.0}", payment.toString());
    }
}

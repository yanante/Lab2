package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportProcessorTest {

    @Test
    public void testCalculateTotalAmount() {
        Payment[] payments = {
                new Payment("Alice", 100),
                new Payment("Bob", 250),
                new Payment("Charlie", 150)
        };
        FinanceReport report = new FinanceReport("Company Z", payments);
        Assertions.assertEquals(500, FinanceReportProcessor.calculateTotalAmount(report));
    }

    @Test
    public void testFindLargestPayment() {
        Payment[] payments = {
                new Payment("Alice", 100),
                new Payment("Bob", 250),
                new Payment("Charlie", 150)
        };
        FinanceReport report = new FinanceReport("Company Z", payments);
        Assertions.assertEquals(payments[1], FinanceReportProcessor.findLargestPayment(report));
    }

    @Test
    public void testFindLargestPayment_EmptyReport() {
        FinanceReport report = new FinanceReport("Company Z", new Payment[]{});
        Assertions.assertNull(FinanceReportProcessor.findLargestPayment(report));
    }

    @Test
    public void testGenerateSummary() {
        Payment[] payments = {
                new Payment("Alice", 100),
                new Payment("Bob", 250)
        };
        FinanceReport report = new FinanceReport("Company Z", payments);
        String expectedSummary = "Finance Report Summary:\n" +
                "Owner: Company Z\n" +
                "Total Amount: 350.0\n" +
                "Largest Payment: Payment{payer='Bob', amount=250.0}";
        Assertions.assertEquals(expectedSummary, FinanceReportProcessor.generateSummary(report));
    }
}
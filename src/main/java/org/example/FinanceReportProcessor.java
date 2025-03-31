package org.example;

public class FinanceReportProcessor {

    // Calculate total amount of all payments in the report
    public static double calculateTotalAmount(FinanceReport report) {
        if (report == null) {
            throw new IllegalArgumentException("Finance report cannot be null");
        }
        return report.getTotalAmount();
    }

    // Find the payment with the highest amount
    public static Payment findLargestPayment(FinanceReport report) {
        if (report == null) {
            throw new IllegalArgumentException("Finance report cannot be null");
        }
        Payment[] payments = report.getPayments();
        if (payments.length == 0) {
            return null; // No payments in the report
        }

        Payment largest = payments[0];
        for (Payment payment : payments) {
            if (payment.getAmount() > largest.getAmount()) {
                largest = payment;
            }
        }
        return largest;
    }

    // Generate a summary report as a string
    public static String generateSummary(FinanceReport report) {
        if (report == null) {
            throw new IllegalArgumentException("Finance report cannot be null");
        }
        return "Finance Report Summary:\n" +
                "Owner: " + report.getOwner() + "\n" +
                "Total Amount: " + calculateTotalAmount(report) + "\n" +
                "Largest Payment: " + findLargestPayment(report());
    }

    private static FinanceReport report() {
        return null;
    }
}

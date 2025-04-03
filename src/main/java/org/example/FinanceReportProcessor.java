package org.example;

import java.util.ArrayList;
import java.util.List;

public class FinanceReportProcessor {

    // Get the payment with the maximum amount
    public static Payment getMaxPayment(FinanceReport report) {
        if (report == null || report.getPayments().length == 0) {
            throw new IllegalArgumentException("The finance report cannot be null or empty");
        }

        Payment maxPayment = report.getPayments()[0];
        for (Payment payment : report.getPayments()) {
            if (payment.getAmountInCents() > maxPayment.getAmountInCents()) {
                maxPayment = payment;
            }
        }
        return maxPayment;
    }

    // Get the payment with the minimum amount
    public static Payment getMinPayment(FinanceReport report) {
        if (report == null || report.getPayments().length == 0) {
            throw new IllegalArgumentException("The finance report cannot be null or empty");
        }

        Payment minPayment = report.getPayments()[0];
        for (Payment payment : report.getPayments()) {
            if (payment.getAmountInCents() < minPayment.getAmountInCents()) {
                minPayment = payment;
            }
        }
        return minPayment;
    }

    // Calculate the total sum of all payments
    public static long getTotalAmountInCents(FinanceReport report) {
        if (report == null) {
            throw new IllegalArgumentException("The finance report cannot be null");
        }

        long total = 0;
        for (Payment payment : report.getPayments()) {
            total += payment.getAmountInCents();
        }
        return total;
    }

    // Find all payments made to a specific recipient
    public static List<Payment> findPaymentsByRecipient(FinanceReport report, String recipient) {
        if (report == null) {
            throw new IllegalArgumentException("The finance report cannot be null");
        }
        if (recipient == null || recipient.isEmpty()) {
            throw new IllegalArgumentException("Recipient name cannot be empty");
        }

        List<Payment> result = new ArrayList<>();
        for (Payment payment : report.getPayments()) {
            if (payment.getRecipient().equalsIgnoreCase(recipient)) {
                result.add(payment);
            }
        }
        return result;
    }
}
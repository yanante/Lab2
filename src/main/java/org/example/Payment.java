package org.example;

import java.util.Objects;

public class Payment {
    private String recipient;  // Payment recipient
    private double amount;     // Payment amount

    // Constructor
    public Payment(String recipient, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative");
        }
        this.recipient = recipient;
        this.amount = amount;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative");
        }
        this.amount = amount;
    }

    // Formatted output method
    @Override
    public String toString() {
        return "Payment{" +
                "recipient='" + recipient + '\'' +
                ", amount=" + amount +
                '}';
    }

    // Object comparison method (for testing and correct work with collections)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.amount, amount) == 0 && Objects.equals(recipient, payment.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipient, amount);
    }
}

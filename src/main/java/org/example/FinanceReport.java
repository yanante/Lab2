package org.example;

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private String owner;        // Report owner
    private Payment[] payments;  // Array of payments

    // Constructor
    public FinanceReport(String owner, Payment[] payments) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Report owner cannot be null or empty");
        }
        if (payments == null) {
            throw new IllegalArgumentException("Payments array cannot be null");
        }
        this.owner = owner;
        this.payments = Arrays.copyOf(payments, payments.length); // Defensive copy
    }

    // Getters
    public String getOwner() {
        return owner;
    }

    public Payment[] getPayments() {
        return Arrays.copyOf(payments, payments.length); // Returning a copy to protect encapsulation
    }

    // Setters
    public void setOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Report owner cannot be null or empty");
        }
        this.owner = owner;
    }

    public void setPayments(Payment[] payments) {
        if (payments == null) {
            throw new IllegalArgumentException("Payments array cannot be null");
        }
        this.payments = Arrays.copyOf(payments, payments.length);
    }

    // Get total sum of all payments
    public double getTotalAmount() {
        double total = 0;
        for (Payment payment : payments) {
            total += payment.getAmount();
        }
        return total;
    }

    // Formatted output
    @Override
    public String toString() {
        return "FinanceReport{" +
                "owner='" + owner + '\'' +
                ", payments=" + Arrays.toString(payments) +
                '}';
    }

    // Object comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return Objects.equals(owner, that.owner) && Arrays.equals(payments, that.payments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(owner);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}

package org.example;

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private final Payment[] payments;
    private final String name;
    private final String date;

    public FinanceReport(Payment[] payments, String name, String date) {
        this.payments=payments;
        this.name=name;
        this.date=date;
    }
    public FinanceReport(){
        this.payments=new Payment[]{};
        this.name="none";
        this.date="01.01.2000"
    }

    public FinanceReport(FinanceReport finrep) {
        this.name = finrep.name;
        this.date = finrep.date;
        this.payments=new Payment[finrep.payments.length];
        for (int i=0; i<finrep.getAmountPayments(); ++i){
            payments[i]=new Payment(
                    finrep.getPayment(i).getName(),
                    finrep.getPayment(i).getDay(),
                    finrep.getPayment(i).getMonth(),
                    finrep.getPayment(i).getYear(),
                    finrep.getPayment(i).getBill());
        }
    }
    public int getAmountPayments(){
        return payments.length;
    }

    public Payment getPayment(int n){
        return payments[n];
    }

    public void setPayment(int n,Payment payment){
        payments[n]=payment;
    }

    @Override
    public String toString() {
        StringBuilder pay = new StringBuilder();
        for (Payment payment : payments) {
            if (payment == null) break;
            pay.append(payment).append(System.lineSeparator());
        }
        return String.format("[Автор: %s,дата: %s. Платежи:[\n%s]]",name,date,pay);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return Objects.equals(name, that.name) && Arrays.equals(payments, that.payments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name,date);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}
package org.example.money;

public class FinanceReportProcessor {
    public static FinanceReport getSecondNamesForFirstChar(FinanceReport report, char someChars) {
        int j = 0;
        for (int i = 0; i < report.getAmountPayments(); i++) {
            if (report.getPayment(i).getFio().charAt(0) == someChars) {
                j++;
            }
        }
        Payment[] payments = new Payment[j];
        int index = 0;
        for (int i = 0; i < report.getAmountPayments(); i++) {
            if (report.getPayment(i).getFio().charAt(0) == someChars) {
                payments[index] = report.getPayment(i);
                index++;
            }
        }
        return new FinanceReport(payments, report.getName(), report.getDate());
    }

    // ArrayList
    // два раза пройтись циклом подсчитать количество и создать массив фиксированного размера


    public static FinanceReport paymentsLessThanASpecifiedNumber(FinanceReport report, int specifiedNumber) {
        int j = 0;
        for (int i = 0; i < report.getAmountPayments(); i++) {
            if (report.getPayment(i).getSumPay() < specifiedNumber) {
                j++;
            }
        }
        int index = 0;
        Payment[] payments = new Payment[j];
        for (int i = 0; i < report.getAmountPayments(); i++) {
            if (report.getPayment(i).getSumPay() < specifiedNumber) {
                payments[index] = report.getPayment(i);
                index++;
            }
        }
        return new FinanceReport(payments, report.getName(), report.getDate());
    }

}
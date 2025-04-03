package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportTest {
    @Test
    public void getAmountPayments() {
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,5, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 1,11,15, 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", 2,12,45, 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2, payment3},
                "Иконников Богдан Константинович",
                "02.03.04");
        Assertions.assertEquals(3, financeReport.getAmountPayments());

    }

    @Test
    public void getSet() throws Exception {
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,5, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 1,11,15, 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2},
                "Иконников Богдан Константинович",
                "10.10.24");
        financeReport.setPayment(1, payment1);
        Assertions.assertEquals(payment1, financeReport.getPayment(1));
    }

    @Test
    public void toStringTest1() {
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,5, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 1,11,15, 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals("""
                [Автор: Иконников Богдан Константинович, дата: 10.10.24. Платежи: [
                Плательщик: Первов Первак Первович, дата: 9.10.5 сумма: 11 руб. 0 коп.
                Плательщик: Второв Вторяк Вторович, дата: 1.11.15 сумма: 22 руб. 13 коп.
                ]]""", financeReport.toString());
    }

    @Test
    public void toStringTest2() {
        FinanceReport financeReport = new FinanceReport(new Payment[]{},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals("""
                [Автор: Иконников Богдан Константинович, дата: 10.10.24. Платежи: [
                ]]""", financeReport.toString());
    }

    @Test
    public void copyFrom() {
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,5, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 1,11,15, 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2},
                "Иконников Богдан Константинович",
                "10.10.24");
        FinanceReport financeReport1 = new FinanceReport(financeReport);
        financeReport.setPayment(0, new Payment("none", 1,1,1, 0));
        Assertions.assertNotEquals(financeReport1, financeReport);
    }
}
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    @Test
    public void ConstructorGetSet(){
        Payment payment = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        //FIO
        Assertions.assertEquals("Фамилия Имя Отчество", payment.getName());
        payment.setName("A s d");
        Assertions.assertEquals("A s d", payment.getName());
        //DATE
        Assertions.assertEquals(9, payment.getDay());
        //pay
        Assertions.assertEquals(11111, payment.getBill());
    }

    @Test
    public void equals(){
        Payment payment1 = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Payment payment2 = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Assertions.assertEquals(payment1, payment2);
    }
    @Test
    public void notEquals(){
        Payment payment1 = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Payment payment2 = new Payment("Фамили Ия Отчесво", 1,10,2005, 11211);
        Assertions.assertNotEquals(payment1, payment2);
    }

    @Test
    public void toStringTest(){
        Payment payment = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Assertions.assertEquals("Плательщик: Фамилия Имя Отчество, дата: 9.10.2005 сумма: 111 руб. 11 коп.", payment.toString());
    }
}
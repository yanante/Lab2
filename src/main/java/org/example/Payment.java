package org.example;

import java.util.Objects;

public class Payment {
    private String name;
    private int day;
    private int month;
    private int year;
    private int bill;
    public Payment(String name, int day, int month, int year, int bill) {
        this.name=name;
        this.day=day;
        this.month=month;
        this.year=year;
        this.bill=bill;
    }

    public String getName() {
        return name;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public int getBill(){
        return bill;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setBill(int bill){
        this.bill=bill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day==payment.day && month==payment.month && year==payment.year && bill==payment.bill && Objects.equals(name, payment.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,day,month,year,bill);
    }

    @Override
    public String toString() {
        return String.format("Плательщик: %s, дата: %s, сумма: %d руб. %02d коп.",
                name,day,month,year, bill/ 100, bill % 100);
    }
}
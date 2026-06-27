package com.airtribe.meditrack.entity;

public class Bill {
    private int billId;
    private double amount;
    private double tax;

    public Bill(int billId, double amount, double tax) {
        this.billId = billId;
        this.amount = amount;
        this.tax = tax;
    }

    public double calculateTotal() {
        return amount + tax;

    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}

package com.example;

public class IncomeTaxCalculator {

    public double calculateTax(double income) {
        // 假设简单的税率结构：
        // 0% for income <= 10000
        // 10% for income > 10000 and <= 30000
        // 20% for income > 30000

        if (income <= 10000) {
            return 0.0;
        } else if (income <= 30000) {
            return (income - 10000) * 0.1;
        } else {
            return (20000 * 0.1) + (income - 30000) * 0.2;
        }
    }
}
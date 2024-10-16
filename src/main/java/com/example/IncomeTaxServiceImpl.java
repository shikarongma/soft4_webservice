package com.example;

import com.example.IncomeTaxCalculator;

import javax.jws.WebService;

@SuppressWarnings("ALL")
@WebService(endpointInterface = "com.example.IncomeTaxService",targetNamespace = "http://webservice.com/services")
public class IncomeTaxServiceImpl implements IncomeTaxService {

    @Override
    public double calculateTax(double income) {
        IncomeTaxCalculator calculator = new IncomeTaxCalculator();
        return calculator.calculateTax(income);
    }
}

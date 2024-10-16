package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IncomeTaxService {
    @WebMethod
    double calculateTax(double income);
}

package com.sf;

import javax.xml.ws.Endpoint;
import com.example.*;

public class PublishService {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/incomeTaxService", new IncomeTaxServiceImpl());
        System.out.println("Web service is published at http://localhost:8080/incomeTaxService");
    }
}
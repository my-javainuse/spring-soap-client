package com.example.spring.soap.client.controller;

import com.example.spring.soap.client.loanandeligibility.Acknowledgement;
import com.example.spring.soap.client.loanandeligibility.CustomerRequest;
import com.example.spring.soap.client.service.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanAndEligibilityController {

    @Autowired
    private SoapClient soapClient;

    @PostMapping("/getLoanStatus")
    public ResponseEntity<Acknowledgement> getLoanAndEligibilityDetails(@RequestBody CustomerRequest customerRequest){
        Acknowledgement acknowledgement = soapClient.getAcknowledgement(customerRequest);
        return new ResponseEntity<>(acknowledgement, HttpStatus.OK);
    }
}

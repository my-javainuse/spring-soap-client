package com.example.spring.soap.client.service;

import com.example.spring.soap.client.loanandeligibility.Acknowledgement;
import com.example.spring.soap.client.loanandeligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    public Acknowledgement getAcknowledgement(CustomerRequest customerRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        Acknowledgement acknowledgement = (Acknowledgement) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws",customerRequest);
        return acknowledgement;
    }
}

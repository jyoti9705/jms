package com.jyoti.java.jms.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "${springjms.myQueue}")
    public void receive(String message) {
        System.out.println("Message Received " + message);
    }
}

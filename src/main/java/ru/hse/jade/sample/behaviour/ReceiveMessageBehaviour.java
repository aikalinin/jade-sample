package ru.hse.jade.sample.behaviour;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class ReceiveMessageBehaviour extends Behaviour {
    @Override
    public void action() {
        ACLMessage msg = myAgent.receive();
        if (msg != null) {
            System.out.println("Received: " + msg);
        }
        else {
            block();
        }
    }

    @Override
    public boolean done() {
        return false;
    }
}

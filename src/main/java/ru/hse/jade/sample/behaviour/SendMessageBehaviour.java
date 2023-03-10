package ru.hse.jade.sample.behaviour;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class SendMessageBehaviour extends Behaviour {

    private final String message;
    private final AID[] recipients;

    public SendMessageBehaviour(AID[] recipients, String message) {
        this.recipients = recipients;
        this.message = message;
    }

    @Override
    public void action() {
        ACLMessage cfp = new ACLMessage(ACLMessage.CFP);
        for (AID recipient : recipients) {
            cfp.addReceiver(recipient);
        }
        cfp.setContent(message);
        myAgent.send(cfp);
    }

    @Override
    public boolean done() {
        return true;
    }
}

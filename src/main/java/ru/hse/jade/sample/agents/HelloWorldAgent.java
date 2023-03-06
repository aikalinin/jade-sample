package ru.hse.jade.sample.agents;

import jade.core.Agent;
import ru.hse.jade.sample.configuration.JadeAgent;

@JadeAgent("HelloAgent")
public class HelloWorldAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("Hello world! I'm an agent!");
        System.out.println("My local name is " + getAID().getLocalName());
        System.out.println("My GUID is " + getAID().getName());
        System.out.println("My addresses are " + String.join(",", getAID().getAddressesArray()));
    }
}

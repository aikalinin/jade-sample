package ru.hse.jade.sample.agents;

import jade.core.Agent;
import ru.hse.jade.sample.configuration.JadeAgent;

@JadeAgent(number = 5)
public class TestAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("Hello from " + getAID().getName());
    }
}

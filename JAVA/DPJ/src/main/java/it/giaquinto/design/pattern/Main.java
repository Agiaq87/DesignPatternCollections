package it.giaquinto.design.pattern;

import it.giaquinto.design.pattern.abstractFactory.AbstractFactoryLog;
import it.giaquinto.design.pattern.abstractFactory.concrete.ConcreteFactoryLog;
import it.giaquinto.design.pattern.model.Priority;

public class Main {
    public static void main(String[] args) {
        System.out.println("AbstractFactoryLog example");
        final AbstractFactoryLog factory = new ConcreteFactoryLog();
        factory.createTextualLog().writeLog("ESEMPIO", Priority.EMERGENCY);
        factory.createFileLog().writeLog("ESEMPIO", Priority.EMERGENCY);
    }
}
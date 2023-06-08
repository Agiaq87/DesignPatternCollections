package it.giaquinto.design.pattern.abstractFactory.concrete;

import it.giaquinto.design.pattern.abstractFactory.AbstractFactoryLog;
import it.giaquinto.design.pattern.abstractFactory.AbstractProductLog;

public class ConcreteFactoryLog implements AbstractFactoryLog {
    @Override
    public AbstractProductLog createFileLog() {
        return new FileLogger();
    }

    @Override
    public AbstractProductLog createTextualLog() {
        return new TerminalLogger();
    }
}

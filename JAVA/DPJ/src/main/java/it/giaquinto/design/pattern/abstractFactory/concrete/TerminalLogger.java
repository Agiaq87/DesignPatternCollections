package it.giaquinto.design.pattern.abstractFactory.concrete;

import it.giaquinto.design.pattern.abstractFactory.AbstractProductLog;
import it.giaquinto.design.pattern.abstractFactory.support.LoggerBuffer;
import it.giaquinto.design.pattern.model.Pair;
import it.giaquinto.design.pattern.model.Priority;

import java.util.List;

public class TerminalLogger extends LoggerBuffer implements AbstractProductLog {
    @Override
    public boolean writeLog(String message, Priority priority) {
        insertNew(new Pair<>(message, priority));
        return switch(priority) {
            case LOW, MIDDLE -> !System.out.printf("[%s] :: %s%n", priority.name(), message).checkError();
            case HIGH, WARNING, EMERGENCY -> !System.err.printf("[%s] :: %s%n", priority.name(), message).checkError();
        };
    }

    @Override
    public List<Pair<String, Priority>> getStoryBoard() {
        return getAll();
    }

    @Override
    public Pair<String, Priority> getLast() {
        return super.getLast();
    }
}

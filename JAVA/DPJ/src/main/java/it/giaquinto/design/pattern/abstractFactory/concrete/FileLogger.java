package it.giaquinto.design.pattern.abstractFactory.concrete;

import it.giaquinto.design.pattern.abstractFactory.AbstractProductLog;
import it.giaquinto.design.pattern.abstractFactory.support.LoggerBuffer;
import it.giaquinto.design.pattern.model.Pair;
import it.giaquinto.design.pattern.model.Priority;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileLogger extends LoggerBuffer implements AbstractProductLog {
    @Override
    public boolean writeLog(String message, Priority priority)  {
        try (final FileWriter fw = new FileWriter("log.txt")) {
            fw.write(String.format("[%s] :: %s", priority.name(), message));
            return insertNew(new Pair<>(message, priority));
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public List<Pair<String, Priority>> getStoryBoard() {
        return getAll();
    }

    @Override
    public List<Pair<String, Priority>> getAll() {
        return super.getAll();
    }
}

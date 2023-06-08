package it.giaquinto.design.pattern.abstractFactory.support;

import it.giaquinto.design.pattern.model.Pair;
import it.giaquinto.design.pattern.model.Priority;

import java.util.LinkedList;
import java.util.List;

public abstract class LoggerBuffer {
    final LinkedList<Pair<String, Priority>> storyBoard = new LinkedList<>();

    public boolean insertNew(final Pair<String, Priority> pair) {
        return storyBoard.add(pair);
    }

    public List<Pair<String, Priority>> getAll() {
        return storyBoard;
    }

    public Pair<String, Priority> getLast() {
        return storyBoard.getLast();
    }
}

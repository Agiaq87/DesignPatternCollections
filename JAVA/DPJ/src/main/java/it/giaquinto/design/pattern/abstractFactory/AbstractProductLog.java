package it.giaquinto.design.pattern.abstractFactory;

import it.giaquinto.design.pattern.model.Pair;
import it.giaquinto.design.pattern.model.Priority;

import java.util.List;

/**
 * Abstract Product
 */
public interface AbstractProductLog {
    boolean writeLog(final String message, final Priority priority);

    List<Pair<String, Priority>> getStoryBoard();

    Pair<String, Priority> getLast();
}

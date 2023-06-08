package it.giaquinto.design.pattern.abstractFactory;

public interface AbstractFactoryLog {
    AbstractProductLog createFileLog();

    AbstractProductLog createTextualLog();
}

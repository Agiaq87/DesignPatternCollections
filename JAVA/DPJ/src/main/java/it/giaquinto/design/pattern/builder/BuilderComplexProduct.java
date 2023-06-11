package it.giaquinto.design.pattern.builder;

import it.giaquinto.design.pattern.model.ComplexProduct;
import net.bytebuddy.utility.nullability.NeverNull;

public interface BuilderComplexProduct {
    void buildName(final String name);
    void buildSecondName(final String secondName);
    void buildSurname(final String surname);
    void buildAge(final int age);
    void buildBirthDate(final int day, final int month, final int year);
    void buildHeight(final int cm);
    void buildHeight(final double inch);
    void buildWeight(final double kgs);
    void buildWeight(final int lbs);
    ComplexProduct build();

}

package it.giaquinto.design.pattern.builder;

import it.giaquinto.design.pattern.model.BodyMassIndex;
import it.giaquinto.design.pattern.model.ComplexProduct;
import it.giaquinto.design.pattern.model.Height;
import it.giaquinto.design.pattern.model.Weight;

import java.util.Date;

public class ConcreteBuilderComplexProduct implements BuilderComplexProduct {

    private String name;
    private String secondName;
    private String surname;
    private int age;
    private Date birthdate;
    private Height height;
    private Weight weight;
    private BodyMassIndex bodyMassIndex;

    @Override
    public void buildName(String name) {
        this.name = name;
    }

    @Override
    public void buildSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public void buildSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void buildAge(int age) {
        this.age = age;
    }

    @Override
    public void buildBirthDate(int day, int month, int year) {
        this.birthdate = new Date(day, month, year);
    }

    @Override
    public void buildHeight(int cm) {
        this.height = new Height(cm);
    }

    @Override
    public void buildHeight(double inch) {
        this.height = new Height(inch);
    }

    @Override
    public void buildWeight(double kgs) {
        this.weight = new Weight(kgs);
    }

    @Override
    public void buildWeight(int lbs) {
        this.weight = new Weight(lbs);
    }

    @Override
    public ComplexProduct build() {
        return new ComplexProduct(
                this.name,
                this.secondName,
                this.surname,
                this.age,
                this.birthdate,
                this.height,
                this.weight,
                BodyMassIndex.evaluateSI(
                        this.weight.getKgs(),
                        this.height.getCm()
                )
        );
    }
}

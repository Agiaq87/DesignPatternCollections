package it.giaquinto.design.pattern.model;

import it.giaquinto.design.pattern.builder.BuilderComplexProduct;

import java.util.Date;

public record ComplexProduct(
        String name,
        String secondName,
        String surname,
        int age,
        Date birthdate,
        Height height,
        Weight weight,
        BodyMassIndex bodyMassIndex
) {
    /*
    Google like
     */
    static class Builder {

        private String name;
        private String secondName;
        private String surname;
        private int age;
        private Date birthdate;
        private Height height;
        private Weight weight;
        private BodyMassIndex bodyMassIndex;
        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        public Builder buildBirthDate(int day, int month, int year) {
            this.birthdate = new Date(day, month, year);
            return this;
        }

        public Builder buildHeight(int cm) {
            this.height = new Height(cm);
            return this;
        }

        public Builder buildHeight(double inch) {
            this.height = new Height(inch);
            return this;
        }

        public Builder buildWeight(double kgs) {
            this.weight = new Weight(kgs);
            return this;
        }

        public Builder buildWeight(int lbs) {
            this.weight = new Weight(lbs);
            return this;
        }

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
}

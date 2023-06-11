package it.giaquinto.design.pattern.model;

public enum BodyMassIndex {
    SEVERE_THINNESS,
    MODERATE_THINNESS,
    MILD_THINNESS,
    NORMAL,
    OVERWEIGHT,
    OBESE_CLASS_I,
    OBESE_CLASS_II,
    OBESE_CLASS_III;


    public static BodyMassIndex evaluateSI(final double kgs, final int cms) {
        return evaluator(
                kgs /
                        (
                                ((double) cms / 100) * ((double) cms / 100)
                        )
        );
    }

    public static BodyMassIndex evaluateUSC(final int lbs, final double inch) {
        return evaluator(
                703 * (lbs / inch*inch)
        );
    }

    private static BodyMassIndex evaluator(final double bmi) {
        if (bmi < 16) {
            return SEVERE_THINNESS;
        } else if (bmi >= 16 && bmi < 17) {
            return MODERATE_THINNESS;
        } else if (bmi >= 17 && bmi < 18.5) {
            return MILD_THINNESS;
        } else if (bmi >= 18.5 && bmi < 25) {
            return NORMAL;
        } else if (bmi >= 25 && bmi < 30) {
            return OVERWEIGHT;
        } else if (bmi >= 30 && bmi < 35) {
            return OBESE_CLASS_I;
        } else if (bmi >= 35 && bmi < 40) {
            return OBESE_CLASS_II;
        }

        return OBESE_CLASS_III;
    }
    }

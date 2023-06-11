package it.giaquinto.design.pattern.model;

public class Height {
    private final int cm;
    private final double inch;

    public Height(int cm) {
        this.cm = cm;
        this.inch = toInch(cm);
    }

    public Height(double inch) {
        this.inch = inch;
        this.cm = toCm(inch);
    }

    public int getCm() {
        return cm;
    }

    public double getInch() {
        return inch;
    }

    public static double toInch(final int cm) {
        return cm / 2.54;
    }

    public static int toCm(final double inch) {
        return (int) (inch * 2.54);
    }
}

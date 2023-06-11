package it.giaquinto.design.pattern.model;

public class Weight {
    private final double kgs;

    private final int lbs;

    public Weight(final double kgs) {
        this.kgs = kgs;
        this.lbs = toLbs(kgs);
    }

    public Weight(final int lbs) {
        this.lbs = lbs;
        this.kgs = toKgs(lbs);
    }

    public double getKgs() {
        return kgs;
    }

    public int getLbs() {
        return lbs;
    }

    public static double toKgs(final double lbs) {
        return lbs * 0.45359237;
    }

    public static int toLbs(final double kgs) {
        return (int) (kgs / 0.45359237);
    }
}

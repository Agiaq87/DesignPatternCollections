package it.giaquinto.design.pattern.model;

public class ItalianTaxIDCode {
    private final String taxID;

    public ItalianTaxIDCode(String taxID) throws WrongValueInserted {
        if (checkCorrectTaxIDCode(taxID)){
            this.taxID = taxID;
            return;
        }

        throw new WrongValueInserted();
    }

    public String getTaxID() {
        return taxID;
    }

    public static boolean checkCorrectTaxIDCode(final String taxID) {
        return taxID.matches(
                "^[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}$"
        );
    }
}

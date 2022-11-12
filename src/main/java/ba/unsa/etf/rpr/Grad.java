package ba.unsa.etf.rpr;

public enum Grad {
    SARAJEVO("033"),BRCKO("049"),TUZLA("035"),ZENICA("032"),BIHAC("037"),TRAVNIK("030"),MOSTAR("036");
    private final String broj;
    Grad(String broj){
        this.broj = broj;
    }

    @Override
    public String toString() {
        return this.broj;
    }
}

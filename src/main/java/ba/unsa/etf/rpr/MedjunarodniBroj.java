package ba.unsa.etf.rpr;

import java.util.Objects;

public class MedjunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    public MedjunarodniBroj() {}

    public String getDrzava() {
        return drzava;
    }

    public String getBroj() {
        return broj;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}

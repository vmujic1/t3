package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiskniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;

    FiskniBroj(Grad grad, String broj){
        this.grad = grad;
        this.broj = broj;
    }
    public FiskniBroj(){}

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return this.grad.toString() + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }
}

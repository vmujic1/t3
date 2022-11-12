package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private Map<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) throws  NeuspjesnaPretragaIzuzetak{
        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue().equals(broj)) {
                return entry.getKey();
            }
        }


        return null;
    }

    public String naSlovo(char s) throws NeuspjesnaPretragaIzuzetak{
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getKey().startsWith(String.valueOf(s))) return entry.getKey() +  " - " + entry.getValue().ispisi();
        }
        throw new NeuspjesnaPretragaIzuzetak("Neuspjesna pretraga");
    }

    public Set<String> izGrada(Grad g){
        Set<String> set = new TreeSet<String>();
        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue() instanceof FiskniBroj && ((FiskniBroj)entry.getValue()).getGrad().istiGradovi(g)){
                set.add(entry.getKey());
            }

        }
        return set;
    }
}

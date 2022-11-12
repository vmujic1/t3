package ba.unsa.etf.rpr;


import javax.print.attribute.HashDocAttributeSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 * comment by vmujic1
 */
public class App 
{
    public static void main( String[] args ) throws NeuspjesnaPretragaIzuzetak {
            Imenik i = new Imenik();
            MobilniBroj vedran = new MobilniBroj(61,"152228");
            MobilniBroj almedin = new MobilniBroj(61,"1522282");
            i.dodaj("Vedran",vedran);
            i.dodaj("Almedin", almedin);
            System.out.println(i.dajBroj("Vedran"));
            System.out.println(i.dajIme(vedran));
            try {
                System.out.println(i.naSlovo('C'));
            } catch(NeuspjesnaPretragaIzuzetak e){
                System.out.println(e.getMessage());
            }

            FiskniBroj vedran1 = new FiskniBroj(Grad.ZENICA,"152228");
            FiskniBroj almedin1 = new FiskniBroj(Grad.ZENICA,"919191");
            i.dodaj("Alme", almedin1);
            i.dodaj("Vule",vedran1);

          Set<String> skup = i.izGrada(Grad.ZENICA);
        for(String imena : skup){
            System.out.println(imena);
        }




    }
}

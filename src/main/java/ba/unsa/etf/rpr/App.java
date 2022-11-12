package ba.unsa.etf.rpr;


import javax.print.attribute.HashDocAttributeSet;

/**
 * Hello world!
 * comment by vmujic1
 */
public class App 
{
    public static void main( String[] args )
    {
            Grad gradaca = Grad.valueOf("TUZLA");
           FiskniBroj br = new FiskniBroj(gradaca,"152-266");
            System.out.println(br.ispisi());



    }
}

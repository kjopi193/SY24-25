

public class Fraction_Tester
{
   
    public static void main (String[] args)    
    {
        Fraction Frac1 = new Fraction(1,2);
        System.out.println(Frac1);
        
        Fraction Frac2 = new Fraction(1,4);
        System.out.println(Frac1 + "x" + Frac2 + "=" + Frac1.mult(Frac2));
    }
    
    
}

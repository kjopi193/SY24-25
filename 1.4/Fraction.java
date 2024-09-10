public class Fraction
{
    int numarator;
    int denomanator; 
    
    public Fraction(int FractionNumarator, int FractionDenomanator)
    {
        numarator = FractionNumarator;
        denomanator = FractionDenomanator;
    }
     
    public Fraction Multiply(Fraction other)
    {
        return new Fraction(numarator * other.numarator, denomanator * other.denomanator);   
    }
    
    public String toString()
    {
        return numarator + "/" + denomanator;
    }
}


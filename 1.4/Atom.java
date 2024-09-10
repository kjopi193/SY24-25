public class Atom
{
    String Element;
    private int neutrons;
    private int protons;
    private int electrons;
    
    public Atom(int neu, int pro, int elc, String Elament)
    {
        Element = Elament;
        neutrons = neu;
        protons = pro;
        electrons = elc;
    }
    public String toString()
    {
        return Element + ":" + "\nElectrons" + ":" + electrons + ":" + "\nProtons" + ":" + protons + ":" + "\nNeutrons" + ":" + neutrons;
    }
    
    public static void main(String args[])
    {
    Atom H = new Atom (0,1,1,"Hydrogen");  
    System.out.println(H);
    
    Atom He = new Atom(8,8,2,"Helium");  
    System.out.println(He);
    }
     
    public AtomicNumber(){return pro;}
    public AtomicWeight(){return neu + pro;}
    public AtomicMass(){return neu + pro;}
    
    public String charge toString();
    {
    if(pro -nue>0)
    returm . return
    }
    
    int getpro(return protons;/)
    if (pro = neu < 0; 
    
    
}
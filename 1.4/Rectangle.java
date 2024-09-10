public class Rectangle
{
 int width;
 int height;
 
    public Rectangle (int theWidth, int theHeight)
    {
     width = theWidth;
     height = theHeight;
    }
 
    public void printArea()
    {
        System.out.println("Area:" + width + height);
    }
    
    public void printPrimiter()
    {
        System.out.println("Primiter:" + (width + height)2);
    }
    
    public void printCost(double price)
    {
        System.out.println("Cost:" width + height * price);
    }
    
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle(1,2);
        r1.printArea();
        r2.printArea();
        r1.printPirimiter();
        r2.printPirimiter();
        r1.printCost(5.20);
        r2.printCost(1.50);
    }
    
}

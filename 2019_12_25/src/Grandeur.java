public class Grandeur
{
    public String color;
    public String gear;
    public int price;

    public Grandeur()
    {
        System.out.println("Grandeur Constructor");
    }

    public void run()
    {
        System.out.println("---Run---");
    }

    public void stop()
    {
        System.out.println("---Stop---");
    }

    public void info()
    {
        System.out.println("---info()---");
        System.out.println("Color : " + color);
        System.out.println("Gear : " + gear);
        System.out.println("Price : " + price);
    }
}

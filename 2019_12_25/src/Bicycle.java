public class Bicycle
{
    public String color;
    public int price;

    public Bicycle()
    {
        System.out.println("Bicycle Constructor - 1");
    }

    public Bicycle(String c, int p)
    {
        System.out.println("Bicycle Constructor - 2");
        color = c;
        price = p;
    }

    public void info()
    {
        System.out.println("--info()--");
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }
}

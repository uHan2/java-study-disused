public class MainClass
{
    public static void main(String[] args)
    {
        Grandeur myCar1 = new Grandeur();
        myCar1.color = "Red";
        myCar1.gear = "Auto";
        myCar1.price = 300000;

        myCar1.run();
        myCar1.stop();
        myCar1.info();

        Grandeur myCar2 = new Grandeur();
        myCar2.color = "Blue";
        myCar2.gear = "Manual";
        myCar2.price = 500000;

        myCar2.run();
        myCar2.stop();
        myCar2.info();

        Bicycle myBicyle1 = new Bicycle();
        myBicyle1.color = "Red";
        myBicyle1.price = 100;

        myBicyle1.info();

        Bicycle myBicyle2 = new Bicycle("Blue", 300);
        myBicyle2.info();

    }
}

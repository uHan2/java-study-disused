public class Main
{
    public static void main(String[] args)
    {
        Person Edward = new Person();

        Edward.setInfo("Edward", 10000);

        Taxi taxi = new Taxi();

        Edward.takeTaxi(taxi);

        Edward.showInfo();


    }
}

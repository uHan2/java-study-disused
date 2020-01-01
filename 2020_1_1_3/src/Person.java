public class Person
{
    public String name;
    public int money;

    public void setInfo(String name, int money)
    {
        this.name = name;
        this.money = money;
        System.out.println("Current Money : " + money);
    }

    public void takeTaxi(Taxi taxi)
    {
        taxi.take(10000);
        this.money -= 10000;

        System.out.println("You paid 10000 for Taxi fare");
    }

    public void showInfo()
    {
        System.out.println("After Money : " + money);
    }


}

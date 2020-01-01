public class Person
{
    public String name;

    public void buyCoffee(Cafe cafe, Coffee coffee)
    {
        cafe.money += coffee.getPrice();
        System.out.println(cafe.name + " cafe's Money : " + cafe.money);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Person kim = new Person();
        Person lee = new Person();
        Cafe star = new Cafe("Star");
        Cafe kong = new Cafe("Kong");
        Coffee americano = new Coffee(4000);
        Coffee latte = new Coffee(4500);

        kim.buyCoffee(star, americano);
        lee.buyCoffee(kong, latte);


    }
}

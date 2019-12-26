public class ToyAirplaneClass implements Toy
{

    @Override
    public void run()
    {
        System.out.println("---the ToyAirplane can run---");
    }

    @Override
    public void walk()
    {
        System.out.println("---the ToyAirplane can walk---");
    }

    @Override
    public void alarm()
    {
        System.out.println("---the ToyAirplane can alarm---");
    }

    @Override
    public void light()
    {
        System.out.println("---the ToyAirplane can light---");
    }
}

public class ToyRobotClass implements Toy
{
    @Override
    public void run()
    {
        System.out.println("---the ToyRobot can run---");
    }

    @Override
    public void walk()
    {
        System.out.println("---the ToyRobot can walk---");
    }

    @Override
    public void alarm()
    {
        System.out.println("---the ToyRobot can alarm---");
    }

    @Override
    public void light()
    {
        System.out.println("---the ToyRobot can light---");
    }
}

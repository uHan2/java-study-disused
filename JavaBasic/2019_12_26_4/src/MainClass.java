public class MainClass
{
    public static void main(String[] args)
    {
        ToyRobotClass ToyRobot = new ToyRobotClass();
        ToyAirplaneClass ToyAirplane = new ToyAirplaneClass();

        Toy toys[] = {ToyRobot, ToyAirplane};

        for(int i = 0 ; i < toys.length ; i++)
        {
            toys[i].walk();
            toys[i].run();
            toys[i].alarm();
            toys[i].light();

            System.out.println();

        }

    }
}

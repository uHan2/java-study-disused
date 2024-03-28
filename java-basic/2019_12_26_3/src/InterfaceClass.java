public class InterfaceClass implements interfaceA, interfaceB
{

    public InterfaceClass()
    {
        System.out.println("InterfaceClass Constructor");
    }

    @Override
    public void funcA()
    {
        System.out.println("---funcA()---");
    }

    @Override
    public void funcB()
    {
        System.out.println("---funcB()---");
    }
}

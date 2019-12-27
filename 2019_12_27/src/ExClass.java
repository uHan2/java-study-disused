public class ExClass extends AbstractClass
{

    public ExClass()
    {
        System.out.println("ExClass constructor start");
    }

    public ExClass(int i, String s)
    {
        super(i, s);
    }

    @Override
    public void func2()
    {
        System.out.println("---func2() start---");
    }
}

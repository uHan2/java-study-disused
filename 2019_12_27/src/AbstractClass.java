public abstract class AbstractClass
{
    int num;
    String str;

    public AbstractClass()
    {
        System.out.println("---AbstractClass Constructor---");
    }

    public AbstractClass(int i, String s)
    {
        System.out.println("---AbstractClass Constructor---");

        num = i;
        str = s;
    }

    public void func1()
    {
        System.out.println("func1() Start");
    }

    public abstract void func2();
}

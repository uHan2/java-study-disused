public class MainClass
{
    public static void main(String[] args)
    {
        new AnonymousClass()
        {
            @Override
            public void method()
            {
                System.out.println("---Anonymous Override method()---");
            }
        }.method();


    }
}

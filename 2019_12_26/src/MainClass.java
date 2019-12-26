public class MainClass
{
    public static void main(String[] args)
    {
        ParentClass[] pArr = new ParentClass[2];

        FirstChildClass Child1 = new FirstChildClass();
        SecondChildClass Child2 = new SecondChildClass();

        pArr[0] = Child1;
        pArr[1] = Child2;

        for (int i = 0 ; i < pArr.length ; i++)
        {
            pArr[i].makeJjajang();
        }
    }
}
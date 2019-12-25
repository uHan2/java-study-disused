public class ChildClass
{
    public String Name;
    public String Gender;
    public int age;

    public ChildClass()
    {
        System.out.println("ChildClass Constructor");
    }

    public void setInfo(String n, String g, int a)
    {
        System.out.println("Start setInfo()");

        Name = n;
        Gender = g;
        age = a;
    }

    public void getInfo()
    {
        System.out.println("Start getInfo()");

        System.out.println("Name : " + Name);
        System.out.println("Gender : " + Gender);
        System.out.println("Age : " + age);

        mySecret();
    }

    private void mySecret()
    {
        System.out.println("my secret()");
    }

}

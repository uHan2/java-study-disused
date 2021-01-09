public class Person
{
    public int age;
    public String name;
    public boolean marriage;
    public int childNum;

    public void setInfo(int age, String name, boolean marriage, int childNum)
    {
        this.age = age;
        this.name = name;
        this.marriage = marriage;
        this.childNum = childNum;
    }

    public void showInfo()
    {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
        System.out.println("Marrage : " + marriage);
        System.out.println("Child Number : " + childNum);
    }
}

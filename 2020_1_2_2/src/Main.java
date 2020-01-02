import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Student lee = new Student("Lee");
        Student kim = new Student("Kim");

        lee.addSubject("국어", 100);
        lee.addSubject("수학", 90);

        kim.addSubject("국어", 100);
        kim.addSubject("수학", 90);
        kim.addSubject("영어", 80);

        lee.showInfo();
        kim.showInfo();
    }
}

import java.util.ArrayList;

public class Student
{
    private String name;
    ArrayList<Subject> subjectlist;

    public Student(String name)
    {
        this.name = name;
        subjectlist = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score)
    {
        Subject subject = new Subject(name, score);

        subjectlist.add(subject);
    }

    public void showInfo()
    {
        for (Subject subject : subjectlist)
        System.out.println(name + " Student's " + subject.getName() + "'s score : " + subject.getScore());
    }
}

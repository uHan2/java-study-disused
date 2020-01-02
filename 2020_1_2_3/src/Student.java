import java.util.ArrayList;

public class Student
{
    private String studentName;
    ArrayList<Book> bookList;

    public Student(String studentName)
    {
        this.studentName = studentName;

        bookList = new ArrayList<Book>();
    }

    public void addBook(String bookName)
    {
        Book book = new Book(bookName);

        bookList.add(book);
    }

    public void showStudentInfo()
    {
        System.out.print(studentName + "'s read book : ");

        for(Book book : bookList)
        {
            System.out.print(book.getBookName() + " ");
        }

        System.out.println();
    }

}

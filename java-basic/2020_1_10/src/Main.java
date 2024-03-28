import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("정렬방식을 선택하십시오.");
        System.out.println("B : Bubble Sort.");
        System.out.println("Q : Quick Sort.");
        System.out.println("H : Heap Sort.");

        Sort sort = null ;

        Scanner input = new Scanner(System.in);

        String option = input.next();

        if(option.equals("B") || option.equals("b"))
        {
            sort = new BubbleSort();
        }
       else if(option.equals("Q") || option.equals("q"))
        {
            sort = new QuickSort();
        }
        else if(option.equals("H") || option.equals("h"))
        {
            sort = new HeapSort();
        }
        else
        {
            System.out.println("Error");
        }

        sort.ascending();
        sort.descending();
        sort.description();

    }
}

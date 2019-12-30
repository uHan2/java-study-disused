import java.util.Scanner;

public class Main
{
    private static int count_0 = 0;
    private static int count_1 = 0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        int[] arr = new int[testcase];


        for (int i = 0; i < testcase; i++)
        {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < testcase; i++)
        {
           count_0 = 0;
           count_1 = 0;
            fibo(arr[i]);
            System.out.println(count_0 + " " + count_1);
        }

    }

    public static int fibo(int n)
    {

        if (n == 0)
        {
            count_0++;
            return 0;
        } else if (n == 1)
        {
            count_1++;
            return 1;
        } else
        {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}



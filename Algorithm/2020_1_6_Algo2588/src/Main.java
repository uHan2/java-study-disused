import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int temp = B % 100;

        System.out.println(A * (B % 10));
        System.out.println(A * (temp / 10));
        System.out.println(A * (B / 100));
        System.out.println((A * (B % 10)) + ((A * (temp / 10)) * 10) + ((A * (B / 100)) * 100));
    }
}
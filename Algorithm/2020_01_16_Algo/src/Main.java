import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = n ; j > 0 ; j--)
            {
                if(i < j)
                {
                    System.out.print(" ");
                }
                else
                    {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int Test, x1, y1, r1, x2, y2, r2;
        double d, r;

        Test = input.nextInt();

        int arr[] = new int[Test];

        for (int i = 0 ; i < Test ; i++)
        {
            x1 = input.nextInt();
            y1 = input.nextInt();
            r1 = input.nextInt();
            x2 = input.nextInt();
            y2 = input.nextInt();
            r2 = input.nextInt();

            d =  Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
            r = Math.sqrt(d);

            if(x1 == x2 && y1 == y2 && r1 == r2)
            {
                arr[i] = -1 ;
            }
            else if ((x1 == x2 && y1 ==y2 && r1 != r2)|| (r > r1 + r2) || r < Math.abs(r1 - r2))
            {
                arr[i] = 0;
            }
            else if (r == r1 + r2 || Math.abs(r1 - r2) == r)
            {
                arr[i] = 1;
            }
            else
            {
                arr[i] = 2;
            }

        }

        for (int i = 0 ; i < Test ; i ++)
        {
            System.out.println(arr[i]);
        }


    }
}

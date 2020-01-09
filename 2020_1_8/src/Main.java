import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[3];

        Scanner input = new Scanner(System.in);

        arr[0] = input.nextInt();
        arr[1] = input.nextInt();
        arr[2] = input.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[1]);
    }
}

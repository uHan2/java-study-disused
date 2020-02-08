import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a * b * c;

        int zero_count = 0;
        int one_count = 0;
        int two_count = 0;
        int three_count = 0;
        int four_count = 0;
        int five_count = 0;
        int six_count = 0;
        int seven_count = 0;
        int eight_count = 0;
        int nine_count = 0;


        int[] arr = Stream.of(String.valueOf(sum).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                zero_count ++;
            }
            else if(arr[i] == 1)
            {
                one_count ++;
            }
            if(arr[i] == 2)
            {
                two_count ++;
            }
            if(arr[i] == 3)
            {
                three_count ++;
            }
            if(arr[i] == 4)
            {
                four_count ++;
            }
            if(arr[i] == 5)
            {
                five_count ++;
            }
            if(arr[i] == 6)
            {
                six_count ++;
            }
            if(arr[i] == 7)
            {
                seven_count ++;
            }
            if(arr[i] == 8)
            {
                eight_count ++;
            }
            if(arr[i] == 9)
            {
                nine_count ++;
            }

        }

        System.out.println(zero_count);
        System.out.println(one_count);
        System.out.println(two_count);
        System.out.println(three_count);
        System.out.println(four_count);
        System.out.println(five_count);
        System.out.println(six_count);
        System.out.println(seven_count);
        System.out.println(eight_count);
        System.out.println(nine_count);


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 10;
        int same_count = 0;

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++)
        {
            arr[i] = Integer.parseInt(br.readLine()) % 42 ;
        }

        Arrays.sort(arr);

        for (int i = 0; i < 9; i++)
        {
            if(arr[i] == arr[i+1])
            {
                same_count++;
            }
        }

        System.out.println(total - same_count);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr = new int[s.length()];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = s.charAt(i) - '0';
        }

        int result = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if(result == 0 || result == 1) // result == 1 인 경우 체크를 못했음 ..
            {
                result += arr[i];
            }else
            {
                result *= arr[i];
            }
        }

        System.out.println(result);
    }
}

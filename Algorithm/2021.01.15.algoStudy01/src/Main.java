import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] arr = s.toCharArray();

        int zeroToOneCount = 0;
        int oneToZeroCount = 0;

        if (arr[0] == '1') oneToZeroCount++;
        else zeroToOneCount++;

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i + 1] != arr[i] && arr[i + 1] == '1') oneToZeroCount++;
            else if (arr[i + 1] != arr[i] && arr[i + 1] == '0') zeroToOneCount++;
        }


        System.out.println(Math.min(oneToZeroCount, zeroToOneCount));
    }
}

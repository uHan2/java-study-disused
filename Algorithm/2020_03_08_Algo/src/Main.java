import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[tc];
        int count = tc;

        StringTokenizer str = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length ; i++)
        {
            arr[i] = Integer.parseInt(str.nextToken());

            if(arr[i] == 1)
            {
                count--;
            }

            for(int j = 2; j <= (int) Math.sqrt(arr[i]) ; j++)
            {
                if(arr[i] % j == 0)
                {
                    count--;
                    break;
                }
            }
        }

        bw.write(count + "");

        bw.flush();
    }
}
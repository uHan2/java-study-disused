import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringTokenizer str2 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        int count = 0;

        int start = 0;

        int compare = start + 1;

        int end = start + K - 1;

        int[] arr = new int[N];

        for(int i = 0; i < arr.length ; i++)
        {
            arr[i] = Integer.parseInt(str2.nextToken());
        }

        Arrays.sort(arr);

        while(true)
        {
            compare = start + 1;

            end = start + K - 1;

            if(arr[start] == arr[compare])
            {

                if(end >= arr.length-K+1)
                {
                    break;
                }
                else
                {
                    start += 1;
                }
            }
            else if(arr[start] != arr[compare])
            {

                for(int k = compare ; k <= end ; k++)
                {
                    arr[k] = arr[start];
                }
                count++;

                if(end >= arr.length-K+1)
                {
                    break;
                }
                else
                {
                    start = start + K - 1;
                }
            }

        }

        if(arr[arr.length-1] != arr[0])
        {
            count++;
        }

        System.out.print(count);


    }

}
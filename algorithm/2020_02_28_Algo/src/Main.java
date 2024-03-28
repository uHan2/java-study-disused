import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int count = 0;
        int average = 0;
        int sum = 0;

        int avg_count = 0;

        double ratio = 0;

        int[] arr = null;
        double[] ratioarr = new double[testCase];

        while(count < testCase)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int eachCase = Integer.parseInt(str.nextToken());

            arr = new int [eachCase];
            ratio = 0;
            sum = 0;
            avg_count = 0;

            for(int i = 0 ; i < arr.length ; i++)
            {
                arr[i] = Integer.parseInt(str.nextToken());
            }

            for(int i = 0 ; i < arr.length ; i++)
            {
                sum += arr[i];
            }

            average = sum / eachCase;

            for(int i = 0 ; i < arr.length ; i++)
            {
                if(arr[i] > average)
                {
                    avg_count++;
                }
            }

            ratio = (double) avg_count / (double) eachCase * (double) 100;

            ratioarr[count] = ratio;

            count++;

        }

        for(int i = 0 ; i < testCase ; i++)
        {
            System.out.println(String.format("%.3f", ratioarr[i]) + "%");
        }
    }
}
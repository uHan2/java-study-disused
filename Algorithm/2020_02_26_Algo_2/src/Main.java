import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double[] arr;
        double sum = 0;

        int arrsize = Integer.parseInt(br.readLine());

        arr = new double[arrsize];

        StringTokenizer str = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(arr);

        double M = arr[arr.length - 1];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = arr[i] / M * (double) 100 ;
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }

        double total = sum / (double) arr.length ;

        System.out.println(total);


    }
}
